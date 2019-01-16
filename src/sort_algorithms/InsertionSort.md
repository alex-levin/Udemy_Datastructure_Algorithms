### Insertion Sort

|0|1 |2  |3 |4 |5 |6|  
--|--|---|--|--|--|--  
20|35|-15|7 |55|1 |-22  


i = 0
the last sorted partition index, assuming that 0 is already sorted.
index used to traverse the sorted partition from right to left

firstUnsortedIndex = 1
this is the first index of he unsorted partition

newElement = 35
the value we want to insert into the sorted partition - array[firstUnsortedIndex]

* In-place algorithm
* O(n^2) time complexity - quadratic
* It will take 100 steps to sort 10 items,  
10,000 steps to sort 100 items,  
1,000,000 steps to sort 1000 items
* Stable algorithm
