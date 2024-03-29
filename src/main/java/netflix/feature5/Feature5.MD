Description:-

We want to implement a feature so that the user can view the n titles that they’ve watched or accessed most recently. You need to come up with a data structure for this feature. Let’s break it down. If we think it through, we realize the following: i) This data structure should maintain titles in order of time since last access; ii) If the data structure is at its capacity, an insertion should replace the least recently accessed item.

We need to design a structure that takes the ID of our movies, adds them to our data structure, and fetches movie titles when accessed through their ID. We also need to consider the size of our data structure and maintain the least recently watched property.

Solution:-

A doubly linked list provides an ideal way of maintaining ordered elements. We can keep the most recently accessed item at the tail. But when a recently watched item is accessed again, we’ll move it to the tail of the linked list. This will require searching for an element in the linked list, which is expensive. To fix this, we can use a hash map to store the pointers of the linked list elements.

Here’s how we implement the feature:

If the element exists in the hashmap, our first step is to move the accessed element to the tail of the linked list.

If the data structure is at its capacity, remove the element at the head of the linked list and the Hash Map. Then, we add the new element at the tail of the linked list and in the Hash Map.

Finally, we retrieve the element and return.