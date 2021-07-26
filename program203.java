

import java.util.*;

class Numbers
{
	
	public int sum(int Arr[])
	{
		int isum=0,iresult=0;
		for(int i=0;i<Arr.length;i++)
		{
			isum=0;
			for(int j=1;j<=(Arr[i]/2;j++))
			{
				if(Arr[i]%j==0)
				{
					isum=isum+j;
				}
			}
			if(isum==)
		}
		return isum;
	}
}

class program203
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner (System.in);
		int iSize=0;
		System.out.println("Enter number of Elements\n");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		System.out.println("please enter value:");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		Numbers nobj=new Numbers();
		int iret=nobj.sum(Arr);
		System.out.println("Addition of N numbers :"+iret);
	}
}
