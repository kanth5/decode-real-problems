Description:-

Our third task is building a filter that will fetch relevant content based on the age of the users for a specific country or region. For this, we use the median age of users and the preferred content for users that fall into that specified category.

Because the number of users is constantly increasing on the Netflix platform, we need to figure out a structure or design that updates the median age of users in real-time. We will have an array that constantly receives age values, and we will output the median value after each new data point.

Let’s understand this better with an illustration: f3_1.png

Solution:-

We will assume that ‘x’ is the median age of a user in a list. Half of the ages in the list will be smaller than (or equal to) ‘x’, and the other half will be greater than (or equal to) ‘x’. We can divide the list into two halves: one half to store the smaller numbers (say smallList), and one half to store the larger numbers (say largeList). The median of all ages will either be the largest number in the smallList or the smallest number in the largeList. If the total number of elements is even, we know that the median will be the average of these two numbers. The best data structure for finding the smallest or largest number among a list of numbers is a Heap.

Here is how we will implement this feature:

First, we will store the first half of the numbers (smallList) in a Max Heap. We use a Max Heap because we want to know the largest number in the first half of the list.

Then, we will store the second half of the numbers (largeList) in a Min Heap, because we want to know the smallest number in the second half of the list.

We can calculate the median of the current list of numbers using the top element of the two heaps.