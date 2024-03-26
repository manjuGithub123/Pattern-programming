/*
 import java.util.*;                     //using for loop
 
public class Patternone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);//creating object of scanner cls
System.out.println("enter the char");//asking use to enter char
char a=sc.next().charAt(0);//read and storing value in variable a
for(int i=1;i<=5;i++)//checking the condition
{
	System.out.print("*");
}
}

}*/

/*
import java.util.*;            //using while loop
public class Patternone{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);//creating object of scanner cls
System.out.println("enter the char");//asking user to enter char
char a=sc.next().charAt(0);//read and store value in variable a
char i=1;
while(i<=5)//checking the condition
{
	System.out.print("*");
	i++;
}
}}*/

import java.util.*;    //using dowhile loop
public class Patternone{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);//creating object of scanner cls
		System.out.println("enter the char");//asking user to enter char
		char a=sc.next().charAt(0);//read and storing a value in variable a
		char i=1;
		do
		{
			System.out.print("*");
			i++;
			
			
			
		}
		while(i<=5);//checking condition
		
	}
}
