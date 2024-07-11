package com.examples.practice;
import java.util.*;
import java.util.ArrayList;
class RemoveDuplicatesFromArray
{
  public static void main (String[] args)
  {
     int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
     int n = arr.length;
     Set<Integer> hash_Set = new HashSet<Integer>();
     
for (int i=0; i<n; i++)
hash_Set.add(arr[i]);

List<Integer> arrayList = new ArrayList<Integer>(hash_Set);
Collections.sort(arrayList); 
System.out.println(arrayList);
}
}