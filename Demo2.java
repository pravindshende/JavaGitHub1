package Practice_Programs;  

import java.util.Scanner;


public class Revevrse_String{
	public static void main(String [] args) {
		String str="Prathamesh";
		StringBuilder obj=new StringBuilder();  
		obj.append(str);
		obj=obj.reverse();
		System.out.println(obj);
	}
}