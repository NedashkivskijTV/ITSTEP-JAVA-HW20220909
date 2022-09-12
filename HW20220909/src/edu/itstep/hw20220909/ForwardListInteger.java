package edu.itstep.hw20220909;

public class ForwardListInteger {
    private Node head;
    //private Node tail;

    public ForwardListInteger() {
        this.head = null;
        //this.tail = null;
    }

    // AddToHead
    public void addToHead(int val){
        Node newNode = new Node(val, this.head);
        this.head = newNode;
    }

    // AddToTail
    public void addToTail(int val){
        Node newTail = new Node(val);
        Node temp = this.head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newTail);
    }

    // DeleteFromHead
    public void deleteFromHead(){
        if(this.head != null){
            Node newHead = this.head;
            this.head = newHead.getNext();
        }
    }

    // DeleteFromTail
    public void deleteFromTail(){
        if(this.head != null){
            Node temp = this.head;
            Node newTail = null;
            while (temp.getNext() != null){
                newTail = temp;
                temp = temp.getNext();
            }
            newTail.setNext(null);
        }
    }

    // Show
    public void showList(){
        Node temp = this.head;
        while (temp != null){
            temp.showNode();
            //System.out.println();
            temp = temp.getNext();
        }
        System.out.println();
    }

    private class Node { // внутрішній клас
        private int value;
        private Node next;

        public Node() {
            this(0, null);
        }

        public Node(int value) {
            this(value, null);
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public void showNode(){
            System.out.print(this.value + " ");
        }
    }
}
