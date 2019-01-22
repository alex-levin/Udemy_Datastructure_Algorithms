### Selection Sort (Theory)  
  
|0|1 |2  |3 |4 |5 |6|  
--|--|---|--|--|--|--  
20|35|-15|7 |55|1 |-22  

lastUnsortedIndex = 8  
this is the last index of the unsorted partition.

largest = 0  
index of largest element in unsorted partition  
(Initialize the largest element to 0.  
In the beginning of the sorting, we only know index 0 and assume it as the largest)

i = 1  
index used to traverse the array from left to right  

* In-place algorithm  
* O(n^2) time complexity - quadratic  
* It will take 100 steps to sort 10 times,  
10,000 steps to sort 100 items,  
1,000,000 steps to sort 1000 items  
* Doesn't require as much swapping as bubble sort
* Unstable algorithm
