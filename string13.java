//input : Hello Demo India
//output : olleH omeD aidnI


import java.util.*;

class demo
{
	public String reverseword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		String output =" ";
		for(int i=0;i<Arr.length;i++)
		{
			StringBuffer bobj = new StringBuffer(Arr[i]);
			output=output+" " + bobj.reverse();
			bobj = null; 
		}
		return output.trim();
	}
}
class string13
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		demo dobj = new demo();
		String ret = dobj.reverseword(str);
		System.out.println(ret);
	}
	
}

