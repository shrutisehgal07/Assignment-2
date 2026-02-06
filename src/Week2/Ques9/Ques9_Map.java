package Week2.Ques9;

/*  Write a program to store employee ID and name using:-
HashMap - LinkedHashMap - TreeMap
Insert at least 5 entries in each map and print them.
Observe and explain the ordering behavior of each map.*/


import java.util.*;
public class Ques9_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap implementation: 
		
		HashMap<Integer,String> hm = new HashMap<>(); 
	
		//In hashMap, elements are displayed in unsorted order as it does not follow any fixed ordering. 
		
		hm.put(1, "Aditya");
		hm.put(7, "Shreya");
		hm.put(91,"Yash");
		hm.put(102,"Divya");
		hm.put(5, "Aanya");
		hm.put(30, "Tashu");
		
		System.out.println("The id and name of employees using HashMap are: ");
		System.out.println();
		
		for(Map.Entry<Integer,String> e: hm.entrySet() ) {
			
			System.out.println(e.getKey() + " "+ e.getValue()); 
		} 
		
		
		System.out.println();
		System.out.println();
		
		
		// LinkedHashMap implementation:
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		
		// In LinkedHashMap, elements are displayed in the order in which they get inserted.
		
		map.put(1, "Aditya");
		map.put(7, "Shreya");
		map.put(91,"Yash");
		map.put(102, "Divya");
		map.put(5, "Aanya");
		map.put(30, "Tashu");
		
		System.out.println("The id and name of employees using LinkedHashMap are: ");
		System.out.println();

		
		for(Map.Entry<Integer,String> e: map.entrySet() ) {

			System.out.println(e.getKey() + " "+ e.getValue()); 
		}
		
		
		System.out.println();
		System.out.println();
		
		
		// TreeMap implementation: 
		
		TreeMap<Integer,String> tmap = new TreeMap<>();
		
		/* In treeMap the elements are displayed in the custom or natural sorting order.
		The sorting is done for the elements on the keys(id here) not on the values. */
		
		tmap.put(1, "Aditya");
		tmap.put(7, "Shreya");
		tmap.put(91,"Yash");
		tmap.put(102, "Divya");
		tmap.put(5, "Aanya");
		tmap.put(30, "Tashu");
		
		System.out.println("The id and name of employees using TreeMap are: ");
	
		System.out.println();

		
		for(Map.Entry<Integer,String> e: tmap.entrySet() ) {
			
			System.out.println(e.getKey() + " "+ e.getValue()); 
		}

	}

}
