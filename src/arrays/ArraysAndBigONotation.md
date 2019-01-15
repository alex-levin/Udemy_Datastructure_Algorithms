# (Udemy)Data Structures and Algorithms: Deep Dive Using Java

## Arrays in Memory
- Contiguous block in memory
- Every element occupies the same amount space in memory
- If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the following expression: x + i*y
- If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

|0|1 |2  |3 |4 |5 |6|  
--|--|---|--|--|--|--  
20|35|-15|7 |55|1 |-22  

Start address of array 12, element size = 4 bytes(because int is a primitive type)
In object's case, such as String, only the reference will be stored in memory, which has the same size always. 

Address od array[0] = 12  
Address od array[1] = 12 + (1 * 4) = 16  
Address od array[2] = 12 + (2 * 4) = 20  
Address od array[3] = 12 + (3 * 4) = 24  
Address od array[4] = 12 + (4 * 4) = 28  
Address od array[5] = 12 + (5 * 4) = 32  
Address od array[6] = 12 + (6 * 4) = 36  

## Big O values in Array
1. Multiply the size of the element by its index
2. Get the start address of the array
3. Add the start address to the result of the multiplication

For an int array, assume element starts at address 12. Each int is 4 bytes.  
To get intArray[0] = 12 + 0 * 4 = 12  
To get intArray[1] = 12 + 1 * 4 = 16  
To get intArray[2] = 12 + 2 * 4 = 20  
To get intArray[3] = 12 + 3 * 4 = 24  

|Number of Elements|Steps to Retrieve|  
-------------------|------------------ 
1                  |3    
1000               |3
100000             |3
10000000           |3
10000000000        |3  


|Operation                                      |Time Complexity      |
------------------------------------------------|---------------------  
Retrieve with index                             |O(1) - Constant time  
Retrieve without index                          |O(n) - Linear time   
Add an element to a full array                  |O(n)  
Add an element to the end of an array(has space)|O(1)  
Insert or update an element at a specific index |O(1)  
Delete an element by setting it to null         |O(1)  
Delete an element by shifting elements          |O(n)  

Usually, if the code requires a loop, the time complexity will be "Linear".

 



