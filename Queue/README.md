 Implement using linked-list, with tail pointer:

- [x] enqueue(value) - adds value at position at tail
- [x] dequeue() - returns value and removes least recently added element (front)
- [x] empty()
 - [ ] Cost:
   - a bad implementation using linked list where you enqueue at head and dequeue at tail would be O(n) because you'd need the next to last element, causing a full traversal each dequeue
   - enqueue: O(1) (amortized, linked list and array [probing])
   - dequeue: O(1) (linked list and array)
   - empty: O(1) (linked list and array)
