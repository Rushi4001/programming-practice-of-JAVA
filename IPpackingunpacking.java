//168760593

import java.util.*;

class packunpack
{
	public int packing(int no1,int no2,int no3, int no4)
	{
		int ans=0;
		int i = no1 << 24;
		int j = no2 << 16;
		int k = no3 << 8;
		int l = no4;
		ans=i|j|k|l;
		return ans;
	
	}
	
}

class IPpackingunpacking
{
	public static void main(String arg[])
	{
		int no1,no2,no3,no4;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First number");
		no1=sobj.nextInt();
		
		System.out.println("Enter second number");
		no2=sobj.nextInt();
		
		System.out.println("Enter third number");
		no3=sobj.nextInt();
		
		System.out.println("Enter Forth number");
		no4=sobj.nextInt();
		
		packunpack obj = new packunpack();
		int iret=obj.packing(no1,no2,no3,no4);
		System.out.println(+iret);
	}
	
}


























