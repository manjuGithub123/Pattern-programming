/*
 import java.util.*;            //using for loop
 
public class Patterntwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);//creating object of scanner cls
System.out.println("enter the char");//asking user to enter char
char a=sc.next().charAt(0);//read and storing value in variable a
for(int i=1;i<=5;i++)//checking condition
{
	System.out.println("*");
}
	}

}*/
/*
import java.util.*;
public class Patterntwo{
public static void main(String[]args)
{
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter the char");
	char a=sc.next().charAt(0);
	for(char i=1;i<=5;i++)
	{
		for(char j=1;j<=4;j++)
		{
			System.out.print("*");
		}
		System.out.println("*");
	}
	
}
}*/


//using dowhile

import java.util.*;
public class Patterntwo{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int b=sc.nextInt();
		System.out.println("enter the char");
		char a=sc.next().charAt(0);
		int i=1;
		do {
			int j=1;
			do
			{
				System.out.print(a);
				j++;
			}
			while(j<=b);
			System.out.println();
			i++;
		}
		while(i<=b);
			
			
			
			
		}
		}
		
		
		
		
		