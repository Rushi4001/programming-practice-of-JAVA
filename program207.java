
/*
	"abcde" "cebad"
	"hello" "loleh"
	"india"  "iinda"
*/

import java.util.*;

class Stringx
{
	boolean CheckAnagram(String str1, String str2)
	{
		int count1[26]={0};
		int count2[26]={0};
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char arr[]=str1.toCharArray();
		char brr[]=str2.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			count1[arr[i]-'a']++;
		}
		for(int j=0;i<brr.length;i++)
		{
			count2[brr[i]-'a']++;
		}
		for()
		{
			if(count1[i]!=count2[i])
		}
	}
	
}

class program207
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("please enter first string");
		String str1 = sobj.nextLine();
		System.out.println("please enter first string");
		String str2 = sobj.nextLine();
		Stringx obj =new Stringx();
		boolean bret = obj.CheckAnagram(str1,str2);
		if(bret==true)
			System.out.println("string is anagram");
		else
			System.out.println("string is anagram");
		
	}
	
	
}

























