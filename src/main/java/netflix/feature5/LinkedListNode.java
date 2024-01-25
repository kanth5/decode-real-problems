package main.java.netflix.feature5;

class LinkedListNode {
    public int key;
    public int data;
    public LinkedListNode next;
    public LinkedListNode prev;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public LinkedListNode(int key, int data) {
        this.key = key;
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    public LinkedListNode(int data, LinkedListNode next, LinkedListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}