//armstrong number

import java.util.*;

class Digits
{
	boolean armstrongxyz(int ino)   
	{
		int temp=ino;
		int count=0,idigit=0,isum=0,ipower=1;
		
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		temp=ino;
		while(temp!=0)
		{
			idigit=temp%10;
			for(int i=1;i<=count;i++)
			{
				ipower=ipower*idigit;
			}
			isum=isum+ipower;
			ipower=1;
			temp=temp/10;
		}
		if(isum==ino)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class armstrong
{
	public static void main(String arg[])
	{
		int no;
		boolean bret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		no=sobj.nextInt();
		
		Digits dobj = new Digits();
		
		bret=dobj.armstrongxyz(no);
		if(bret==true)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}
}





































