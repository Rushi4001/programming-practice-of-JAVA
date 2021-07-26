//accept string from user and display frequency of letter


import java.util.*;

class demo
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();
		int Frequency=0;
		HashMap<Character,Integer>hobj=new HashMap<Character,Integer>();
		for(char ch: Arr)
		{
			if(hobj.containsKey(ch))
			{
				Frequency=hobj.get(ch);
				hobj.put(ch,Frequency+1);
			}
			else
			{
				hobj.put(ch,1);
			}
		}
		System.out.println(hobj);
	}
}
class string14    
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sobj.nextLine();
		demo dobj = new demo();
		dobj.CharacterFrequency(str);
	}
	
}






















