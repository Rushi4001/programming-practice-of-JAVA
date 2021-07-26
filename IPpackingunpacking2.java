//168760593

import java.util.*;

class packunpack
{
	public int packing(int no1,int no2,int no3, int no4)
	{
		
		return ((no1<<24) | (no2<<16) | (no3<<8) | no4);
	
	}
	public void unpacking(int no)
	{
		int no1, no2 , no3 , no4;
		no1 = no & 0x000000ff;
		no2 = no >> 8;
		no2 = no2 & 0x000000ff;
		no3 = no >> 16;
		no3 = no3 & 0x000000ff;
		no4 = no >> 24;
		System.out.println("Fourth number"+no1);
		System.out.println("Third number"+no2);
		System.out.println("Second number"+no3);
		System.out.println("First number"+no4);
	}
}

class IPpackingunpacking2
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
		
		obj.unpacking(iret);
	}
	
}

