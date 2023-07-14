package Adarsh;
import java.util.*;
public class Question_3 {
	public static void main(String[] args) {
		int choice,n1,n2,n3,n4;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Enter the age to check eligible for voting or not\n2:Enter the 3 number find out greatest\n3:Enter the number Check Even and Odd");
		choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        	System.out.println("Enter Your Age");
        	n1 = sc.nextInt();
        	if(n1>=18)
        	{
        		System.out.println("Eligible for voting");
        	}else {
        		System.out.println("Not eligible for voting");
        	}
        		break;
        case 2:	
        	System.out.println("Enter the 3 Number");
        	n1 = sc.nextInt();
        	n2 = sc.nextInt();
        	n3 = sc.nextInt();
        	if(n1>n2 && n1>n3)
        	{
        		System.out.println("Num 1 is greater" + n1);
        	}else if(n2>n1 && n2>n3)
        	{
        		System.out.println("Num 2 is greater" + n2);
        	}
        	else 
        	{
        		System.out.println("Num 3 is greater" + n3);
        	}
        	break;
        case 3:	
        	System.out.println("Enter the no.");
    		n4 = sc.nextInt();
    		if(n4%2 == 0)
    		{
    			System.out.println("Enter the no. is Even");
    		}else {
    			System.out.println("Enter the no. is Odd");
    		}
    		break;
    		
    		default:
    			System.out.println("Invaild choice");
    			break;
        }
	}
}
