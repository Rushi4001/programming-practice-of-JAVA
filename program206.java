
import java.util.*;

class Stringx
{
	public int CapCount(String str)
	{
		char arr[]=str.toCharArray();
		int icnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				icnt++;
			}
		}
		return icnt;
	}
	
}

class program206
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner (System.in);
		
		System.out.println("plese enter string");
		
		String str = sobj.nextLine();
		 
		Stringx obj = new Stringx();
		int iret=obj.CapCount(str);
		System.out.println("CAPITAL COUNT IS:"+iret);
	}
}
