//
import java.util.*;

class string5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		System.out.println("string length is :"+str.length());
		
		String temp=str.trim();
		String arr[] = temp.split("\\s");
		System.out.println("number of word are:"+arr.length);
		
	}
	
}
