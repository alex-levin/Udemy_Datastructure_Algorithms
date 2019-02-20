### Double Linked List
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
               ^                                      ^
               |                                      |
              head                                   tail  

#### Insert at head
                        ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
                 null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
                            ^                                      ^
                            |                                      |
                           head                                   tail
              
              
           ()(Bill)()-->()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
    null<--()(Bill)()<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
               ^                                      ^
               |                                      |
              head                                   tail  
- Create new node "Bill"  
- Assign "Jane" to Bill's next field  
- Assign whatever Jane is pointing to as previous to Bill's previous field  
- Assign "Bill" to Jane's previous field  
- Assign head to "Bill"  
- O(1) time complexity  


#### Insert at tail
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
               ^                                      ^
               |                                      |
              head                                   tail
                           
                           
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->()(Bill)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()<--()(Bill)()  
               ^                                                    ^
               |                                                    |
              head                                                 tail     
- Create new node "Bill"  
- Assign tail's next field to Bill's next field  
- Assign tail  to Bill's previous field  
- Assign tail's next field to "Bill"  
- Assign til to "Bill"  
- O(1) time complexity  


#### Delete from head
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
               ^                                      ^
               |                                      |
              head                                   tail
              
              
                        ()(John)()-->()(Mary)()-->()(Mike)()-->null  
                 null<--()(John)()<--()(Mary)()<--()(Mike)()  
                             ^                         ^
                             |                         |
                            head                      tail
- Assign "Jane" to "removedNode"  
- Assign John's previous field to Jane's previous field  
- Assign head to Jane's next field  
- Return "removedNode" from the method  
- O(1) time complexity  


#### Delete from tail
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->()(Bill)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()<--()(Bill)()  
               ^                                      ^
               |                                      |
              head                                   tail
                            
                            
           ()(Jane)()-->()(John)()-->()(Mary)()-->()(Mike)()-->null  
    null<--()(Jane)()<--()(John)()<--()(Mary)()<--()(Mike)()  
               ^                          ^
               |                          |
              head                       tail
- Assign "Bill" to "removedNode"  
- Assign Mike's next field to Bill's next field  
- Assign tail to Bill's previous field  
- Return "removedNode" from the method  
- O(1) time complexity  


#### To insert a node A between nodes B and C
- Assign A's next field to B's next field  
- Assign A's previous field to C's previous field  
- Assign B's previous field to A  
- Assign C's previous field to A  
- O(1) time complexity BUT we have to find the insertion position first, so this is actually O(n)  



#### To remove node A from between B and C
- Assign A to "removedNode"  
- Assign C's previous field to A's previous field  
- Assign B's next field to A's next field  
- Return A from the method  
- O(1) time complexity BUT we have to find A first, so this is actually O(n)  



