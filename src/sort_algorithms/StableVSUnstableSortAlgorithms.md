Stable vs Unstable Sort
This concept comes When you have a duplicated value in the array.
When we sort the array, the original order of 9 will be preserved?

Unstable Sort
Unsorted:  
|0  |1   |2   |3   |4   |5  |   
----|----|----|----|----|----  
5   |9   |3   |9(*)|8   |4   
There two 9.
9 is located before 9(*)

Sorted:
|0|1 |2 |3 |4   |5 |  
--|--|--|--|----|--  
3 |4 |5 |8 |9(*)|9

In unstable sort, the 9's relative ordering is not preserved.
9(*) came before 9.


Stable Sort
Unsorted:
|0|1 |2  |3   |4 |5 |  
--|--|---|----|--|--  
5 |9 |3  |9(*)|8 |4
There two 9.
9 is located before 9(*)

Sorted:
|0|1 |2 |3 |4 |5   |  
--|--|--|--|--|----  
3 |4 |5 |8 |9 |9(*)

In stable sort, the relative ordering of 9 is preserved.
9 came before 9(*)


Stable sort is preferable to unstable sort.
Integer, it does not really matter, but in Object, such as name, address,.. will be matter.

Bubble sort is a stable sort algorithm.

In a nutshell, stable sort algorithms copy the relative ordering of same value, while unstable sort algorithms do not.


