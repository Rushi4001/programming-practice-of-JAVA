//Array of any type : use length property : ex - Arr.length
//for starting use length() method : Ex = str.length()

import java.util.*;

class demo
{
	public void maximumword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		String stemp=null;
		int imax=Arr[0].length();
		for(String s : Arr)
		{
			if(s.length()>imax)
			{
				imax=s.length();
				stemp=s;
			}
			
		}
		System.out.println("Longest word is :"+stemp);
	}

}
class string10
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		demo dobj = new demo();
		dobj.maximumword(str);
	}
	
}
