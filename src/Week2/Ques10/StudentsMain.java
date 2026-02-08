package Week2.Ques10;

/* Create a class Student with fields:-
		• id
		• name
		• marks
		• Store multiple Student objects in an ArrayList and:-
	o Sort students by marks using Comparable
	o Sort students by name using Comparator
	o Print the sorted results
*/

import java.util.*;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al =new ArrayList<>();
		
		al.add(new Student(1,"Yogita", 78));
		al.add(new Student(2,"Ayush", 62));
		al.add(new Student(3,"Sahil", 89));
		al.add(new Student(4,"Aparna", 94));
		al.add(new Student(5,"Bhumi", 81));
		
		

		System.out.println("The students sorted on the basis of marks are: ");
		
		Collections.sort(al);
		for(Student s: al) {                               // printing using for each loop.
			System.out.println(s.id +" " + s.name +" " + s.marks);
		}
		
		System.out.println();
			
		System.out.println("The students sorted on the basis of names are: ");
		
		Collections.sort(al, new SortName());
		
		for(int i=0; i<al.size(); i++) {             // printing using for loop.
			Student s = al.get(i);
			System.out.println(s.id +" " + s.name +" " + s.marks);
		}
		
	}

}
