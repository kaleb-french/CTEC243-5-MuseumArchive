# Journal
Write your Journal questions and notes here.

Phase 1-
We override the equals method to check for equality because the default == and .equals() both check to see if they are the same object in memory. While thats not what we want to check for, in this case we want to check to see if they have the same id field to be equal. The swap with last minimizes preformance impact by doing a single swap operation instead of shifting the entire array which is an O(N) operation and can have a large impact on preformance if we have to do frequently.

Phase 2-
The trade of it the memory over head of each node being an seperate object reference and each has a reference to the next in the chain, also there is no guerranty that they will be next to each other in memeory. The ArrayCollection will have a fixed size which helps keep memory in check and is placed in a block of memory together at creation.

Phase 3-
The comparable interface allows you to specify how you will sort objects, in this example by id string. when the id string is being is less it will return a -1, when it is equal it returns 0, and when more it will return a +1. In this way it can determin how they should be place in a sorted list.
It is recommend to return 0 if they are == because they would be sorted a equal value(this usually means their places would remain next to each other when sorting).
