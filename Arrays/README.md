# Dynamic array 

### About
Putting in practice my data structures studies. Implementing a vector (mutable array with automatic resizing):
- [ ] Practice coding using arrays and pointers, and pointer math to jump to an index instead of using indexing.
- [x] New raw data array with allocated memory
	- can allocate int array under the hood, just not use its features
	- start with 16, or if starting number is greater, use power of 2 - 16, 32, 64, 128
- [x] size() - number of items
- [x] getCapacity() - number of items it can hold
- [x] isEmpty()
- [x] get(index) - returns item at given index, blows up if index out of bounds
- [x] push(item)
- [x] insert(index, item) - inserts item at index, shifts that index's value and trailing elements to the right
- [x] prepend(item) - can use insert above at index 0
- [x] pop() - remove from end, return value
- [x] delete(index) - delete item at index, shifting all trailing elements left
- [x] remove(item) - looks for value and removes index holding it (even if in multiple places)
- [x] find(item) - looks for value and returns first index with that value, -1 if not found
- [x] resize(new_capacity) // private function
	- [x] when you reach capacity, resize to double the size
	- [x] when popping an item, if size is 1/4 of capacity, resize to half
- [x] Time
	- O(1) to add/remove at end (amortized for allocations for more space), index, or update
	- O(n) to insert/remove elsewhere
- [ ] Space
	- contiguous in memory, so proximity helps performance
	- space needed = (array capacity, which is >= n) * size of item, but even if 2n, still O(n)