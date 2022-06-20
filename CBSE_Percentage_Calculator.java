package hellojava;
import java.util.Scanner;
public class Percentage_calculator {

	public static void main(String[] args) {
		System.out.println("CBSE Board percentage calculator:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of subject 1:");
		float a=sc.nextFloat();
		System.out.println("Enter the marks of subject 2:");
		float b=sc.nextFloat();
		System.out.println("Enter the marks of subject 3:");
		float c=sc.nextFloat();
		System.out.println("Enter the marks of subject 4:");
		float d=sc.nextFloat();
		System.out.println("Enter the marks of subject 5:");
		float e=sc.nextFloat();
		float percentage=(a+b+c+d+e)/5;
		System.out.println("The Percentage of the Student is:");
		System.out.println(percentage);
		
		

	}

}
