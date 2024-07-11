package com.examples.practice;
import java.util.ArrayList;

public class ArrayListPosition {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        
        System.out.println("Elements of ArrayList with positions:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + arrayList.get(i));
        }
    }
}
