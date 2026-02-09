package Week2;

/*Create a List<String> containing employee names.
	• Use lambda expressions to: -
		o Print all names.
		o Filter names starting with letter ‘A’
		o Sort the names alphabetically
*/

import java.util.*;
public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> employees = new ArrayList<>();
		
		employees.add("Aanya");
		employees.add("Vaani");
		employees.add("Ashwin");
		employees.add("Rohit");
		employees.add("Surya");
		
		
		System.out.println("All the names of the employees are: ");
		employees.forEach(name -> System.out.println(name));              
	
	
		System.out.println();
	
		System.out.println("Filtered names of the employees starting with the letter 'A' are: ");
		employees.stream().filter(name -> name.startsWith("A"))
						  .forEach(name -> System.out.println(name));
		
		System.out.println();
		
		System.out.println("Sorted names of the employees are: ");
		employees.stream().sorted() .forEach(name -> System.out.println(name));
		
		
		
	}	
	
	

}
