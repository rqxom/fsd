package com.examples.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ListOfSongs {

	public static void main(String[] args) {
		LinkedList<String> playList=new LinkedList<String>();
		playList.addFirst("song 1");
		playList.add("song 2");
		playList.add("song 3");
		playList.add(1,"song 4");
		playList.addLast("song 5");
		playList.add(2,"song 6");
		System.out.println(playList);
		System.out.println(playList.removeLast());
		System.out.println(playList);
		System.out.println(playList.remove(2));
		System.out.println(playList);
		Collections.shuffle(playList);
		System.out.println(playList);
	}

}
