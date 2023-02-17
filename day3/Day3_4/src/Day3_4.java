import java.util.Scanner;

class Employee{
	String name;
	int id;
	int salary;

	void accept() {
		Scanner sc = new Scanner(System.in); //Scanner class is not closed so it will give a resource leak error unless `sc.close()` is used.

		System.out.println("enter the name: ");
		name = sc.nextLine();
		
		System.out.println("enter the id: ");
		id = sc.nextInt();
		
		System.out.println("enter the salary");
		salary = sc.nextInt();
	}
	void display() {
		System.out.println(name+"\t"+id+"\t"+salary);
	}
}
/*
public class Day3_4 {
	public static void main(String[] args) {
		Employee eobj = new Employee();
		eobj.accept();
		eobj.display();
	}
}
*/

/*
public class Day3_4 {
	public static void main(String[] args) {
		Employee e;//this is just a reference/local variable/method local variable. ref resides in stack.
		e = new Employee(); //now we intialize the reference e dynamically int the heap.
		e.display();
	}
}
*/

/*
public class Day3_4 {
	public static void main(String[] args) {
		Employee e;
		e.display(); //this will throw an error since local variable/ref `e` has to be intialized
	}
}
*/

/*
public class Day3_4 {
	public static void main(String[] args) {
		Employee e=null;
		e.display();// calling a method on null reference will throw a NullPointerException.
	}
}
*/

/*
public class Day3_4 {
	public static void main(String[] args) {
		Employee e = null;
		e = new Employee();
		e.display();
	}
}
*/

public class Day3_4 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.accept();
		e.display();
		Employee e1 = e; //this is referenc copy. Pretty self explanatory eh!
		e1.display();
	}
}