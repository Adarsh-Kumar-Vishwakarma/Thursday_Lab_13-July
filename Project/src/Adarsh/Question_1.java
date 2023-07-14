package Adarsh;

import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		int n;
		float a,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius.");
		n = sc.nextInt();
		 a = (float) (3.14*n*n);
		 c = (float) (2*3.14*n);
		System.out.println("area of circle." + a);
		System.out.println("circumference of circle." + c);
	}


}
