
import java.util.*;
import RUSHi.Matrix;

class Demo extends Matrix
{
	
	public Demo (int irow , int icol)
	{
		super(irow,icol);
	}
	
	public int Addition()
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}


class Mat2
{
	public static void main(String str[])	// From 26th June new PPA batch
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		Demo dobj = new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		int iret=dobj.Addition();
		System.out.println("Addition of number is :"+iret);
		
		System.gc();
	}
}























