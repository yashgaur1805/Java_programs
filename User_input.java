package hellojava;
import java.util.Scanner;
public class Taking_input_from_the_user {

	public static void main(String[] args) {
		System.out.println("Taking Input From the User");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("The Sum of these numbers is:");
		System.out.println(sum);
		

	}

}
