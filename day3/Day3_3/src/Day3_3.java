import java.util.Scanner;

public class Day3_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your good name- ");
		String str = sc.next();
		
		System.out.println("enter your age- ");
		int age = sc.nextInt();
		
		System.out.println("enter how many fingers dow you have?");
		float fing = sc.nextFloat();
		
		System.out.println(str+"\t"+age+"\t"+fing);
		System.out.printf("%s %d %.2f", str,age,fing);

		
	}
}
