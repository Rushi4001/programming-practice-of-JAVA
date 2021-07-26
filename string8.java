//Array of any type : use length property : ex - Arr.length
//for starting use length() method : Ex = str.length()

import java.util.*;

class demo
{
	public void evenword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i].length()%2)==0)
			{
				System.out.println(Arr[i]);
			}
		}
	}

}
class string8
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		demo dobj = new demo();
		dobj.evenword(str);
	}
	
}
