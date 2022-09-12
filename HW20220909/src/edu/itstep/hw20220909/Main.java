package edu.itstep.hw20220909;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        ForwardListInteger list = new ForwardListInteger();

//        public class Node - !!!
//        ForwardListInteger.Node node1 = list.new Node();
//        ForwardListInteger.Node node2 = list.new Node(7);
//        node1.showNode();
//        node2.showNode();
//        System.out.println(node1);
//        System.out.println(node2);
//        node1.setNext(node2);
//        System.out.println(node1.getNext());

        System.out.println("- addToHead --------------------------------------");
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.addToHead(4);
        list.addToHead(5);
        list.addToHead(6);
        list.addToHead(7);
        list.showList();

        System.out.println("- deleteFromHead --------------------------------------");
        list.deleteFromHead();
        list.showList();

        System.out.println("- addToTail --------------------------------------");
        list.addToTail(0);
        list.showList();

        System.out.println("- deleteFromTail --------------------------------------");
        list.deleteFromTail();
        list.deleteFromTail();
        list.showList();

        System.out.println("- test --------------------------------------");
        list.deleteFromHead();
        list.deleteFromHead();
        list.deleteFromTail();
        list.deleteFromTail();
        list.addToHead(777);
        list.addToTail(777);
        list.showList();
    }
}
