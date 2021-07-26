
import java.util.*;

class demo
{
	public void reversedisplay(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]= temp.split(" ");
		
		for(int i=0;i<Arr.length;i++)
		{
			StringBuffer bobj = new StringBuffer(Arr[i]);
			System.out.println(bobj.reverse());
			bobj = null; 
		}
		
	}

}
class string12
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		demo dobj = new demo();
		dobj.reversedisplay(str);
	}
	
}
























