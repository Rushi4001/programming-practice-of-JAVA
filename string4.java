//
import java.util.*;

class string4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		System.out.println("string length is :"+str.length());
		
		String temp=str.trim();
		System.out.println("new string is:"+temp);
		System.out.println("length of string is:"+temp.length());
		
		String temp2 = temp.replaceAll("\\s{2,}",""); //+
		System.out.println("modified string is:"+temp2);
	}
	
}
