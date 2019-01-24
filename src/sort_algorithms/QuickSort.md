### Quick Sort  
* in-place algorithm  
* O(nlogn) - base 2. We're repeatedly partitioning the array into two halves.  In the worst case, O(n^2)  
* Unstable algorithm  

* Divide and conquer algorithm  
* Recursive algorithm  
* Uses a pivot element to partition the array into two parts  
* Elements < pivot to its left, elements > pivot to its right  
* Pivot will then be in its correct sorted position  
* Process is now repeated for the left array and right array  
* Eventually, every element has been the pivot, so every element will be in its correct sorted position  
* As with merge sort, we'll end up partitioning the array into a series of 1-element arrays  
* Does this in-place (unlike merge sort)  

{20, 35, -15, 7, 55, 1, -22}

Pivot will be the first element in the array (or subarray)  

start = 0, i = start  
end = 7, j = end  
pivot = 20 (array[start])

We start with (--j) and go from right to left, looking for the first element that's less than the pivot element.
--j = 6
array[6] = -22  

-22 is less than the pivot element, so we assign it to position i, which is 0  
  
{-22, 35, -15, 7, 55, 1, -22}  

Now we switch to i. We start with (i++) and go from left to right, looking for the first element that's greater than the pivot.  

i = 1
array[1] = 35 is greater than the pivot, so we assign it to position j, which is 6  

{-22, 35, -15, 7, 55, 1, 35}  

Notice how we have not lost any data, because we know we've already moved whatever was at position 6.  

By alternating between going from right to left and left to right, we can be sure we won't lose any values.  
  
i = 1  
j = 6    
Now we check whether the value of i, and j have crossed each other. If i < j, they haven't, so we switch back to j and look for the first element that's less than the pivot.  

We check the element at (--j), which is position 5. 1 is less than the pivot, so we assign it to position i.  
i = 1  
j = 5  
array[5] = 1 < pivot 
array[i] = array[j]

{-22, 1, -15, 7, 55, 1, 35}     

Notice once again that we have not lost any data, because we've already moved 35 from position 1  

Now we switch to i and look for the first element greater than the pivot  
This will take us the way to 55 
i = 2, array[2]=-15 < pivot
i = 3, array[3]=7 < pivot
i = 3, array[4]=55 > pivot
At this point, we assign 55 to position j, which is 5  

{-22, 1, -15, 7, 55, 55, 35}  

Now we check to see whether i and j have crossed each other.  

At this point, i = 4 and j = 5  

We switch to j and look for the first element that's less than the pivot. 
--j = 4, array[4]=55 > pivot
--j = 3, at position 3, j has now crossed.   
So we don't do anything. We stop.  
i = 4, j = 4

At this point, the value of i will be the sorted position of the pivot value (20).   
So we assign 20 to position 4.  

{-22, 1, -15, 7, 20, 55, 35}  
Notice that everything to the left of 20 is smaller than 20, and everything to the right of 20 is larger than 20.  

Now we repeat this process for the left partition, and the right partition.  

We do this until the entire array is sorted.  

   

