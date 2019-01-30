### Counting Sort
* Make assumptions about the data  
* Doesn't use comparisons   
* Counts the number of occurrences of each value  
* Only works with non-negative discrete values (can't work with floats, strings)  
* Values must be within a specific range  

  
1. Assume we have values between 1 and 10 inclusive  
2. We have 10 possible values, so we create a counting array of length 10  
3. Traverse the input array from left to right  
4. Use the counting array to track how many of each value are in the input array  
5. Using the counts in the counting array, write the values in sorted order to the input array   

{2, 5, 9, 8, 2, 8, 7, 10, 4, 3}   

|1(min)|2 |3 |4 |5 |6 |7 |8 |9 |10(max)|   
-------|--|--|--|--|--|--|--|--|--------   
0      |2 |1 |1 |1 |0 |1 |2 |1 | 1  

2 2 3 4 5 7 8 8 9 10  



### Stable Counting Sort
- Require extra steps  
- Can calculate where values should be written back to the original array  
- Writing the values into the array in backwards order ensures stability  


1330 8792 1594 4725 4586 5729  
We'll sort this array based on the 10's position - must be a stable sort!  

1594 must remain after 8792  
5729 must remain after 4725  
 
We do the counting as we did before  
We'll end up with the counting array below  

|0(min)|1 |2 |3 |4 |5 |6 |7 |8 |9(max) |     
-------|--|--|--|--|--|--|--|--|--------  
0      |0 |2 |1 |0 |0 |0 |0 |1 |2  

1330 8792 1594 4725 4586 5729   
0  0  2  1  0  0  0  0  1  2  

We create a temporary array that matches the length of the array we're sorting.  
We can use the counts to figure out which range of indices in the temporary array will be occupied by each value.  
For example, we can figure out that the two values with '2' in the 10s position will occupy indices 0 and 1 in the temporary array.  
The value with '3' in the 10's position will occupy index 2.  
The value with 8 in the 10's position will occupy index 3.  
The values with 9 in the 10's position will occupy indices 4 and 5.  

- After the first pass, we adjust the counts.  
Instead of the number of values that have a specific 10's value, we want to store how many values have a specific 10's value or less.  
- For example, we want to store 3 at index 3, because 3 values have a 10's value of 3 or less.  
- We can calculate each adjusted count by adding up the counts up to and including the 10's value.  

1330 8792 1594 4725 4586 5729   
0  0  2  3  3  3  3  3  4  6  

We can use these adjusted counts to write out the values in the correct order and preserve the relative positioning of values that have duplicate 10's values.


int[] tmp = new int[n];  
for (int k = n - 1; k >= 0; k--) {  
    tmp[--countArray[getDigit(position, input[k], radix)]] = input[k];  
}  

n = length of the input array = 6  
k starts at 5 and goes to 0  

When k = 5:  

- countArray[getDigit(...)] = countArray[2] for 5729  
  (the value at input[k]) = 2  
- We are using the prefix operator, so we subtract one from countArray[2] = 1  
- We then assign input[k] (5729) to tmp[1]    


1330 8792 1594 4725 4586 5729   <-input
0   5729   0   0   0   0        <-tmp
0  0  1  3  3  3  3  3  4  6    <-countArray
Temp array now has 5729  
countArray[2] has been decremented by 1, since we've written out one value with 2 in the 10's position.  

When k = 4:  

- countArray[getDigit(...)] = countArray[8] for 4586  
  (the value at input[k]) = 4  
- We are using the prefix operator, so we subtract one from countArray[8] = 3  
- We then assign input[k] (4586) to tmp[3]  


1330 8792 1594 4725 4586 5729   <-input
0   5729   0   4586   0   0     <-tmp
0  0  1  3  3  3  3  3  3  6    <-countArray  

Temp array now has 4586  
countArray[8] has been decremented by 1, since we've written out one value with 8 in the 10's position.  

When k = 3:  

- countArray[getDigit(...)] = countArray[2] for 4725  
  (the value at input[k]) = 1  
- We are using the prefix operator, so we subtract one from countArray[2] = 0  
- We then assign input[k] (4725) to tmp[0]  


1330 8792 1594 4725 4586 5729   <-input
4725  5729   0  4586  0   0     <-tmp
0  0  0  3  3  3  3  3  3  6    <-countArray  

Temp array now has 4725  
countArray[2] has been decremented by 1, since we've written out one value with 2 in the 10's position.  
Notice that the relative position of 4725 and 5729 have been preserved.  

When k = 2:  

- countArray[getDigit(...)] = countArray[9] for 1594  
  (the value at input[k]) = 6  
- We are using the prefix operator, so we subtract one from countArray[9] = 5  
- We then assign input[k] (1594) to tmp[5]  

1330 8792 1594 4725 4586 5729   <-input
4725  5729   0  4586  0  1594   <-tmp
0  0  0  3  3  3  3  3  3  5    <-countArray  

Temp array now has 1594  
countArray[9] has been decremented by 1, since we've written out one value with 9 in the 10's position.  
:
k = 1:  
k = 0:  

####Stable Counting Sort Wrapup  
- This works because we traverse the input array from right to left, and we write duplicate values into the temp array right to left.  
- If we know the duplicate values will go into positions 3 and 4, we write the rightmost value in the input array into position 4, and the leftmost value into position 3.  
- This preserves the relative positioning of duplicate values.  
- By adjusting the counting array after the initial pass, we can map values to indices in the temp array.  
- Can also use linked list to make counting sort stable.  

