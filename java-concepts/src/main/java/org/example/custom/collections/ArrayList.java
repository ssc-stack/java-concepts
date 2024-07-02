package org.example.custom.collections;

import java.util.Arrays;

public class ArrayList<E> {

    private static final int DEFAULT_CAPACITY=10;
    private int size=0;
    private Object[] elementData;

    public ArrayList() {
        elementData=new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        if(initialCapacity>0) {
            elementData=new Object[initialCapacity];
        } else if(initialCapacity==0) {
            elementData=new Object[0];
        } else {
            throw new IllegalArgumentException("Invalid value for capacity");
        }
    }

    public void add(E element) {
        ensureCapacity(size+1);
        elementData[size++]=element;
    }

    private void ensureCapacity(int minCapacity) {
        if(minCapacity>=elementData.length) {
            int oldCapacity=elementData.length;
            int newCapacity= elementData.length*2; // Increase Capacity By 50%
            elementData=Arrays.copyOf(elementData,newCapacity);
        }
    }

    public void set(int index,E element) {
        if(!(index>=0 && index< elementData.length)) throw new IndexOutOfBoundsException("Invalid index");
        elementData[index]=element;
    }

    public boolean contains(E element) {
        return search(element)>=0;
    }

    private int search(E element) {
        for(int i=0;i<size;++i) {
            if(elementData[i].equals(element)) return i;
        }
        return -1;
    }

    public void removeAtIndex(int index) {
        if(!(index>=0 && index< elementData.length)) throw new IndexOutOfBoundsException("Invalid index");
        for(int i=index+1;i< elementData.length;i++) {
            elementData[i-1]=elementData[i];
        }
        size--;
    }

    public void remove(E element) {
        int index=search(element);
        if (index>=0) {
            for (int i = index + 1; i < elementData.length; i++) {
                elementData[i - 1] = elementData[i];
            }
            size--;
        }
    }

    public int size() {
        return size+1;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<size;i++) {
            sb.append((E)elementData[i]);
            if(i!=size-1)
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
