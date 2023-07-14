package Adarsh;
import java.util.*;
public class Question_2 {
	public static void main(String[] args) {
		int choice,a,b,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Arithmetic operater\n2:Assignment operater\n3:Bitwise operater\n4:Trinary operater\n5:Logical operater\n6:Comparision operater");
		choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        	System.out.println("ARITHMETIC OPERATER");
        	System.out.println("Enter the First number");
        	a = sc.nextInt();
        	System.out.println("Enter the Second number");
        	b = sc.nextInt();
        	System.out.println("a + b = " + (a + b) );
        	System.out.println("a * b = " + (a * b) );
        	System.out.println("a / b = " + (a / b) );
        	System.out.println("a % b = " + (a % b) );
        	System.out.println("a - b = " + (a - b) );	
       break;
        case 2:
        	System.out.println("ASSIGNMENT OPERATER");
        	System.out.println("Enter the First number");
        	a = sc.nextInt();
        	System.out.println("Enter the Second number");
        	b = sc.nextInt();
        	System.out.println("a += b = " + (a += b) );
        	System.out.println("a *= b = " + (a *= b) );
        	System.out.println("a /= b = " + (a /= b) );
        	System.out.println("a %= b = " + (a %= b) );
        	System.out.println("a -= b = " + (a -= b) );
        break;
        case 3:
        	System.out.println("BITWISE OPERATER");
        	System.out.println("Enter the First number");
        	a = sc.nextInt();
        	System.out.println("Enter the Second number");
        	b = sc.nextInt();
        	System.out.println("a & b = " + (a & b) );
        	System.out.println("a | b = " + (a | b) );
        	System.out.println("a ^ b = " + (a ^ b) );
         break;
        case 4:
        	System.out.println("TRINARY OPERATER");
        	System.out.println("Enter the First number");
        	a = sc.nextInt();
        	System.out.println("Enter the Second number");
        	b = sc.nextInt();
        	res = (a>b)?a:b;
        	System.out.println("Greater number is " + res );	
         break;
        case 5:
        	System.out.println("LOGICAL OPERATER");
        	System.out.println("Enter the First number");
     		a = sc.nextInt();
     		System.out.println("Enter the Second number");
     		b = sc.nextInt();
			System.out.println("(a > b) && (a < b)" + ((a > b) && (a < b)) );
			System.out.println("(a > b) || (a < b) " + ((a > b) || (a < b)) );
			System.out.println("!(a > b) " + (!(a > b)) );
			break;
        case 6:
        	System.out.println("COMPARISION OPERATER");
        	System.out.println("Enter the First number");
     		a = sc.nextInt();
     		System.out.println("Enter the Second number");
     		b = sc.nextInt();
			System.out.println("a > b " + (a > b));
			System.out.println("a < b " + (a < b));
			System.out.println("a >= b " + (a >= b) );
			System.out.println("a <= b " + (a <= b) );
			System.out.println("a == b " + (a == b) );
			System.out.println("a != b " + (a != b) );
			break;
    		default:
    			System.out.println("Invaild choice");
    			break;
        }
	}
}
