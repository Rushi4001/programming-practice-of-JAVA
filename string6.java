//
import java.util.*;

class string6
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		System.out.println("string length is :"+str.length());
		
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		
		System.out.println("new string after removing extra white spaces:"+temp.length());
		System.out.println("modified string is:"+temp);
	}
	
}
/*
Enter the string
   abc   abc   abc
string length is :18
new string after removing extra white spaces:11
modified string is:abc abc abc

*/

