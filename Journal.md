# Journal
Write your Journal questions and notes here.

Phase 1-
We override the equals method to check for equality because the default == and .equals() both check to see if they are the same object in memory. While thats not what we want to check for, in this case we want to check to see if they have the same id field to be equal. The swap with last minimizes preformance impact by doing a single swap operation instead of shifting the entire array which is an O(N) operation and can have a large impact on preformance if we have to do frequently.
