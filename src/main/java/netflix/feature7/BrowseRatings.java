package main.java.netflix.feature7;

class BrowseRatings {
    public static void main(String args[]) {

        MyStack myStack = new MyStack(7);

        myStack.push(5);
        myStack.push(0);
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(3);
        myStack.push(10);

        System.out.println("Maximum Rating: " + myStack.maxRating());

        myStack.pop();
        System.out.println("\nAfter clicking back button\n");

        System.out.println("Maximum Rating: " + myStack.maxRating());

    }
}