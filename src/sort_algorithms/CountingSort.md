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

|1 |2 |3 |4 |5 |6 |7 |8 |9 |10|   
---|--|--|--|--|--|--|--|--|---   
0  |2 |1 |1 |1 |0 |1 |2 |1 | 1  

2 2 3 4 5 7 8 8 9 10  
