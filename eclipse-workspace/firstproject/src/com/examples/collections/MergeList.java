package com.examples.collections;

import java.util.LinkedList;

public class MergeList {

    public static void main(String[] args)
    {
LinkedList<Integer> List1 = new LinkedList();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
LinkedList<Integer> List2 = new LinkedList();
        List2.add(7);
        List2.add(9);
        List2.add(11);
LinkedList<Integer> List3 = new LinkedList();
        List3.addAll(List1);
        List3.addAll(List2);

System.out.println("List1: "+List1);
System.out.println("List2: "+List2);
System.out.println("List3: "+List3);
}
}
