package Week2.Ques10;

/* Create a class Student with fields:-
		• id
		• name
		• marks
		• Store multiple Student objects in an ArrayList and:-
	o Sort students by marks using Comparable
	o Sort students by name using Comparator
	o Print the sorted results*/

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public int compareTo(Student student) {
		return this.marks - student.marks;        // it will sort the marks in ascending order
	}
	
}


