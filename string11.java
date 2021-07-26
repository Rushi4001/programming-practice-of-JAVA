//Array of any type : use length property : ex - Arr.length
//for starting use length() method : Ex = str.length()

import java.util.*;

class demo
{
	public void maximumword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		
		int imax=Arr[0].length();
		int index =0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i].length()>imax)
			{
				imax = Arr[i].length();
				index=i;
			}
		}
		System.out.println("Longest word is :"+Arr[index]);
	}

}
class string11
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