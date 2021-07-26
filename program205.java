

import java.util.*;

class Stringx
{
	public void Display(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	
}

class program205
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner (System.in);
		
		System.out.println("plese enter string");
		
		String str = sobj.nextLine();
		 
		Stringx obj = new Stringx();
		obj.Display(str);
	}
}







