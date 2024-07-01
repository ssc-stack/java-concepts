package org.example.iterable;

import java.util.Iterator;

class Node implements Iterable<Node> {
    int data;
    Node next;

    // Constructor to initialize data only
    public Node(int data) {
        this.data = data;
        this.next=null;
    }

    // Constructor to initialize data and next node
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Return an iterator to allow for-each loop
    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    // Private inner class to implement the Iterator interface
    private class NodeIterator implements Iterator<Node> {
        private Node current;

        // Constructor to initialize the iterator with the start node
        public NodeIterator(Node start) {
            this.current = start;
        }

        // Check if there is a next element
        @Override
        public boolean hasNext() {
            return current != null;
        }

        // Return the current element and move to the next
        @Override
        public Node next() {
            Node temp = current;
            current = current.next;
            return temp;
        }
    }
}
