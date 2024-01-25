Description:-

This feature and the one we discussed before are almost similar, but now the titles are maintained in order of viewing/access frequency. When the data structure is at capacity, a newly inserted item will replace the least frequently accessed item. In the case of a tie, the least recently accessed item should be replaced.

We need to design a structure that takes the ID of the movies and adds them to our structure. It also needs to fetch a movie title when accessed through its ID. We also have to consider the size of the data structure and maintain the least frequently watched property. This means that when our structure is at its capacity then a newly inserted item will replace the item whose frequency count is the lowest.

Here is an illustration of this process. When we insert the value 5, then the element with the least frequency is 1. Hence, it gets replaced by 5.

Solution:-

We’ll build this structure on top of the one from the previous lesson. We will also use a Hash Map and a doubly linked list. In this case, we’ll also store data on how frequently titles are accessed along with their respective keys and values. We’ll append each new entry at the tail of the doubly linked list. A Hash Map will be used to keep track of the keys and their values in the linked list.

You could create a Hash Map that will store the key, value, and frequency count for that value. Since multiple titles can have the same access frequency, the value stored in the Hash Map for each key will be a doubly linked list. The most recently accessed title is inserted at the tail of this linked list. We can easily remove the least recently accessed title by removing it from the head of the linked list. However, the Hash Map entries are linked lists, so lookups are slow. To fix this problem, we can use a second Hash Map with a unique key for every item in the first Hash Map. The value corresponding to a key in this second Hash Map will point to the corresponding node in the linked list.

Here’s how we will implement this feature:

If an element is accessed and is present in our data structure, we will:

Increase its frequency count

Move it to the end of its respective list

If an element is added and there is space for it in our structure, we create a node with the specified key and value, assign the node a frequency count of 1, and increase the size of the structure.

If an element is added and eviction is needed, we will delete the keys and references of the least frequent node from both the Hash Maps. Then, we simply repeat step 2.

If a key already exists for a certain key-value pair, we update the value of the node for the respective key.

