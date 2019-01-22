### Shell Sort
* Variation of Insertion Sort  
* Insertion sort chooses which element to insert using a gap of 1  
* Shell Sort starts out using a larger gap value  
* As the algorithm runs, the gap is reduced  
* Goal is to reduce the amount of shifting required    

* As the algorithm progress, the gap is reduced  
* The last gap value is always 1  
* So, the algorithm does some preliminary work (using gap values greater than 1), and then becomes insertion sort  
* By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required  
* About how to select the initial gap, there're several approaches, and which one you choose will affect to the time complexity.  

#### Knuth Sequence

|k| Gap(interval)|  
--|---------------  
1 | 1  
2 | 4  
3 | 13  
4 | 40  
5 | 121   

* Gap is calculated using (3^k - 1) / 2  
* We set k based on the length of the array  
* We want the gap to be as close as possible to the length of the array we want to sort, without being greater than length  

  

  
