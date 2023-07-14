package Adarsh;
import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		int n , fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		while(n>=1)
		{
			fact = fact*n;
			n--;
		}
		
		System.out.println("Factorial of "+ fact);
	}

}
