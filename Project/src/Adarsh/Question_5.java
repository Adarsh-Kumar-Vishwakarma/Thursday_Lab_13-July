package Adarsh;
import java.util.*;
public class Question_5 {
	public static void main(String[] args) {
		int n,i,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		System.out.println("TABLE OF " + n);
		for(i=1; i<=10; i++)
		{
			a = n*i;
		    System.out.println(n + " * " + i + " = " + a);		
		    
		}

	}
}
