import java.util.Scanner;


/*
 
Q1.WAP to accept two numbers from user and do the arithmetic operation
Enter any two numbers
25
15
The Addition is 40
The Subtraction is 10
The Multiplication is 375
The Division is 1.0
The Modulus is 10

 */

/*
public class ArithematicOpearation_hw23nov 
{
	public static void main(String args[])
	{
		System.out.println("Q1.WAP to accept two numbers from user and do the arithmetic operation");
		int num1,num2,add,sub,mul,mod;
		float div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		System.out.println("The Addition is "+add);
		System.out.println("The Subtraction is "+(sub));
		System.out.println("The Multiplication is "+mul);
		System.out.println("The Division is "+div);
		System.out.println("The Modulus is "+mod);
		
		System.out.println("The Addition of Two Number  = "+(num1+num2));
		System.out.println("The Subtraction of Two Number ="+(num1-num2));
		System.out.println("The Multiplication of Two Number ="+(num1*num2));
		System.out.println("The Division of Two Number ="+(num1/num2));
		System.out.println("The Modulus of Two Number ="+(num1%num2));
        	
		
	}

}


*/
/*

Q2.WAP to accept l and b from user and calculate AR & PR
Enter l and b

6
2
Area =12
Perimeter =16

 */
/*
public class ArithematicOpearation_hw23nov  {

	public static void main(String[] args)
	{	
		System.out.println("Q2.WAP to accept l and b from user and calculate AR & PR");
		int l,b,AR,PR;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter l and b");
		l=sc.nextInt();
		b=sc.nextInt();
		AR=l*b;
		PR=2*(l+b);
		
		System.out.println("Area ="+AR);
		System.out.println("Perimeter ="+PR);
	}

}


*/

/*
Q3.WAP to accept radius from user and calculate AR & CC
Enter Radius of Circle
5
Area of Circle is 78.5
Circumference of Circle is 31.400000000000002

 */
/*
public class ArithematicOpearation_hw23nov  {

	public static void main(String[] args)
	{		
		System.out.println("Q3.WAP to accept radius from user and calculate AR & CC");
		
		double rad,AR,CC,pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		rad=sc.nextInt();
		AR=pi*rad*rad;
		CC=2*pi*rad;
		System.out.println("Area of Circle is "+AR);
		System.out.println("Circumference of Circle is "+CC);
		
		
	}
}
*/
/*
Q4: WAP to accept SP and CP from User and calc profit and loss And display the output
Enter SP

100
Enter CP

50
Profit is 50

 */
public class ArithematicOpearation_hw23nov  {

	public static void main(String[] args)
	{	
		System.out.println("Q3: WAP to accept SP and CP from User and calc profit and loss And display the output");
		int sp,cp,profit,loss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter SP");
		sp=sc.nextInt();
		System.out.println("Enter CP");
		cp=sc.nextInt();
		if(sp>cp)
		{
		profit=sp-cp;
		System.out.println("Profit is "+profit);
		}
		else
		{
			loss=cp-sp;
			System.out.println("Loss is "+loss);
		}
	
		
	}
}	

	
































