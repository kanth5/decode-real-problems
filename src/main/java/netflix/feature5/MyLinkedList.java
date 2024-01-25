package main.java.netflix.feature5;

public class MyLinkedList {
    public LinkedListNode head;
    public LinkedListNode tail;
    public int size;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int key, int data) {
        LinkedListNode newNode = new LinkedListNode(key, data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public void insertAtTail(int key, int data) {
        LinkedListNode newNode = new LinkedListNode(key, data);
        if (this.tail == null){
            this.tail = newNode;
            this.head = newNode;
            newNode.next = null;
            newNode.prev = null;
        }

        else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
            newNode.next = null;
        }
        this.size++;
    }

    public LinkedListNode getHead(){
        return this.head;
    }

    public LinkedListNode getTail(){
        return this.tail;
    }

    public LinkedListNode removeNode(LinkedListNode node){
        if(node == null){
            return null;
        }

        if(node.prev != null){
            node.prev.next = node.next;
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }

        if(node == this.head){
            this.head = this.head.next;
        }
        if(node == this.tail){
            this.tail = this.tail.prev;
        }
        this.size--;
        return node;
    }

    public void remove(int data){
        LinkedListNode i = this.getHead();
        while(i != null){
            if(i.data == data){
                this.removeNode(i);
            }
            i = i.next;
        }
    }

    public LinkedListNode removeHead(){
        return this.removeNode(this.head);
    }

    public LinkedListNode removeTail(){
        return this.removeNode(this.tail);
    }
}