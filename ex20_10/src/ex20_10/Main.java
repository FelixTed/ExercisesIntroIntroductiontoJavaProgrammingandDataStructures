package ex20_10;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<String> list = new PriorityQueue<>(Arrays.asList("George","Jim","John","Blake","Kevin"));
		PriorityQueue<String> list2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin","Mi	chelle","Ryan"));
		
		System.out.println("list 1: " + list);
		System.out.println("list 2: " + list2);
		System.out.println("Union: " + union(list,list2));
		System.out.println("Difference: " + difference(list,list2));
		System.out.println("Intersection: " + intersection(list,list2));
	}
	
	public static PriorityQueue<String> union(PriorityQueue<String> list,PriorityQueue<String> list2){
		PriorityQueue<String> union = new PriorityQueue<>(list);
		union.addAll(list2);
		return union;
	}
	public static PriorityQueue<String> difference(PriorityQueue<String> list, PriorityQueue<String> list2){
		PriorityQueue<String> difference = new PriorityQueue<>(list);
		difference.removeAll(list2);
		return difference;
	}
	public static PriorityQueue<String> intersection(PriorityQueue<String> list, PriorityQueue<String> list2){
		PriorityQueue<String> intersection = new PriorityQueue<>(list);
		intersection.retainAll(list2);
		return intersection;
	}

}
