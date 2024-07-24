/*
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

    LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
    int get(int key) Return the value of the key if the key exists, otherwise return -1.
    void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.
 */
package org.example.lru.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    final Node head=new Node(0,0);
    final Node tail=new Node(0,0);
    final Map<Integer,Node> map;
    final int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        int value=-1;

        if(map.containsKey(key)) {
            Node node=map.get(key);
            remove(node);
            insertToHead(node);
            return node.value;
        }
        return value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node=map.get(key);
            remove(node);
            insertToHead(node);
            node.value=value;
        } else {
            if(map.size()==capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node node=new Node(key,value);
            insertToHead(node);
            map.put(key,node);
        }
    }

    public void remove(Node node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insertToHead(Node node) {
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }

    class Node {
        Node prev,next;
        int key;
        int value;
        Node(int key,int value) {
            this.key=key;
            this.value=value;
        }
    }
}
