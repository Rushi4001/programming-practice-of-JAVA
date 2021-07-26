

import java.util.*;

class Numbers
{
	public boolean checkperfect(int iNo)
	{
		int isum=0;
		for(int i=1;i<=(iNo/2);i++)
		{
			if(iNo%i==0)
			{
				isum=isum+i;
			}
		}
		if(isum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int sum(int Arr[])
	{
		int isum=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(checkperfect(Arr[i])==true)
			{
				isum=isum+Arr[i];
			}
		}
		return isum;
	}
}

class program202
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
