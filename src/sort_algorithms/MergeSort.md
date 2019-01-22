### Merge Sort
* Divide and conquer algorithm  
* Recursive algorithm  
* Two phases : Splitting and Merging  
* Splitting phase leads to faster sorting during the Merging phase  
* Splitting is logical. We don;t create new arrays  

#### Splitting Phase
* Start with an unsorted arrau.  
* Divide the array into two arrays, which are unsorted.  
The first array is the left array, and the second array is the rigth array.  
* Split the left and right arrays into two arrays each  
* Keep splitting until all the arrays have only one element each - these arrays are sorted  

#### Merging Phase
* Merge every left/right pair of sibling arrays into a sorted array  
* After the first merge, we'll have a bunch of 2-element sorted arrays  
* Then merge those sorted arrays (left/right silblings) to end up with a bunch of 4-element sorted arrays  
* Repeat until you have a single sorted array  
* Not in-place. Uses temporary arrays    

* NOT an in-place algorithm  
* O(nlogn) - bases 2. We're repeatedly dividing the array in half during the splitting phase  
* Stable alogrithm  
  
  

 
