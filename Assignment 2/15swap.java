import java.util.Scanner;

class swap
{
	public static void main (String args[])
   {
	   Scanner sc = new Scanner(System.in);
	  System.out.println("enter 2 no.");
	  int a=sc.nextInt();
	  	  int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
	  System.out.println("swaped no. are \n"+a+"\n"+b);
	  }}
