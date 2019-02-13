### Linked List

    head-->(Jane)()-->(John)()-->(Mary)()-->(Mike)()-->null  
Each item in the list is called a node.  
The first item in the list is the head of the list.  

#### Insert
               head-->(Jane)()-->(John)()-->(Mary)()-->(Mike)()-->null  
    head-->(Bill)()-->(Jane)()-->(John)()-->(Mary)()-->(Mike)()-->null    
1. Create a new node "Bill"  
2. Assign "Jane" ot the next field  
3. Assign head to "Bill"  
4. Will ne O(1) time complexity  

#### Delete
    head-->(Bill)()-->(Jane)()-->(John)()-->(Mary)()-->(Mike)()-->null
               head-->(Jane)()-->(John)()-->(Mary)()-->(Mike)()-->null
1. Assign "Bill" to a temporary variable "removedNode"  
2. Assign "head" to "Jane"  
3. Return "removedNode"  
4. Will be O(1) time complexity  
