package hellojava;
import java.util.Scanner;
public class Have_a_good_day_text {

	public static void main(String[] args) {
		System.out.print("What is your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Hello " + name + " Have a good day.");
