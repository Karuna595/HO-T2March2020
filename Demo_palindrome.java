package basic;

import java.util.Scanner;

public class Demo_palindrome {
	public static void main(String[] args)
	  {
		  int num, reverse=0,original;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  num=sc.nextInt();
		  original=num;
		  while(num>0)
		  {
			  reverse=reverse*10;
			  reverse=reverse+num%10;
			  num=num/10;
		  }
		  System.out.println("Reverse of number is:"+reverse);
		  
		  if(original==reverse)
		  {
			  System.out.println("Number is palindrome");
		  }
		  else
		  {
			  System.out.println("Numberis not palindrome");
		  }
		  sc.close();
	  }
}
