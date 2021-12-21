import java.util.Scanner;

/*
  
1)WAP to accept a no from user and check it is positive or negative.
Enter a number
7
The given number is positive =	7 

 */
/*
public class voting_positive_negative_even_odd_26_nov 
{

	public static void main(String[] args)
	{	
		System.out.println("1)WAP to accept a no from user and check it is positive or negative.");
		int num,pos,neg;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.print("The given number is positive =\t"+num);
			
		}
		else
		{
			System.out.println("The given number is negative =\t" +num);
		}
		
	}

}
*/
/*

2)WAP to accept a no from user if no is even than display the cube or else display the square
Enter a number
21
The Entered number is Odd so it's cube is 9261

 */
/*

public class voting_positive_negative_even_odd_26_nov 
{

	public static void main(String[] args)
	{	
		System.out.println("2)WAP to accept a no from user if no is even than display the cube or else display the square");
		int num,square,cube;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		square=num*num;
		cube=num*num*num;
		if(num%2==0)
		{
			System.out.println("The Entered number is Even so it's square is "+square);
		}
		else
		{
			System.out.println("The Entered number is Odd so it's cube is "+cube);
		}
	}
}
*/
/*
3)WAP to accept age from user and check it is eligible for voting or not.
Enter Your Age
22
You are Eligible to vote

*/



/*

public class voting_positive_negative_even_odd_26_nov  
{

	public static void main(String[] args)
	{
		System.out.println("3)WAP to accept age from user and check it is eligible for voting or not.");
		int age,minor,major,eligible;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		minor=18-age;
		if(age<18)
		{
			System.out.println("You are Minor,not eligible to vote.You can vote after "+minor);
			if(minor<2)
			{
			System.out.print("year.");
			}
			else
			{
				System.out.print("years.");
			}
		}
		else if(age>=18&&age<90)
		{
			System.out.println("You are Eligible to vote");
		}
		else
		{
			System.out.println("Sorry You are not eligible to vote");
		}
	}
}	
*/



		
		
		
		
		
		
		
		
	}