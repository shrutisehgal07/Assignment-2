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
public class SortName implements Comparator<Student> {
	
	public int compare(Student student, Student student2) {
		return student.name.compareTo(student2.name);
	}
	
}
