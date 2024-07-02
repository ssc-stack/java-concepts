package org.example.custom.collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<8;++i) {
            list.add(i+1);
        }

        System.out.println(list);
        list.set(0,100);
        list.set(1,200);
        System.out.println(list);
        list.removeAtIndex(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(200));
        System.out.println(list.contains(100));
        list.remove(200);
        System.out.println(list);
        System.out.println(list.size());
    }
}
