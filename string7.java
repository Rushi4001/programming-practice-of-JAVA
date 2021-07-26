import java.util.*;

class demo
{
	public int wordcount(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		return Arr.length;
	}

	
}
class string7
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		demo dobj = new demo();
		int iret=dobj.wordcount(str);
		System.out.println("Number of words are :"+iret);
	}
	
}




