### Stack
- Abstract data type
- LIFO - Last in, first out
- push - adds an item as the top item on the stack
- pop - removes the top item on the stack
- peek - gets the top item on the stack without popping it
- Ideal backing data structure: linked list

#### Time complexity
- O(1) for push, pop, and peek, when using a linked list
- If you use an array, then push is O(n), because the array may have to be resized.
- If you know the maximum of item that will ever be on the stack, an array can be a good choice.
- If memory is tight, an array might be a good choice
- Linked list is ideal
