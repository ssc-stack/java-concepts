package org.example.iterable;

import java.util.Iterator;

class NodeV2 implements Iterable<Integer> {
    private int data;
    private NodeV2 next;

    public NodeV2(int data, NodeV2 next){
        this.data = data;
        this.next = next;
    }

    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }

    private class NodeIterator implements Iterator<Integer> {

        private NodeV2 current;

        NodeIterator(NodeV2 current) {
            this.current=current;
        }

        public boolean hasNext() {
            return current!=null;
        }

        public Integer next() {
            NodeV2 temp=current;
            current=current.next;
            return temp.data;
        }
    }
}
