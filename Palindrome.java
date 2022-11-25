
import java.util.Scanner;

public class Palindrome {
	
	public static void number(int n){
		int i,r,rev=0,temp;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
		    n=n/10;
		}
		if(temp==rev)
		System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.number(9889);
		number(21212);
		number(323);
		number(15151);
		number(9879);
	}
