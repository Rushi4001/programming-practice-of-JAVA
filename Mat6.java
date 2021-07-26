
import java.util.*;
import RUSHi.Matrix;

class Demo extends Matrix
{
	
	public Demo (int irow , int icol)
	{
		super(irow,icol);
	}
	
	public void AdditionRow()
	{
		int isum = 0;
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			 isum=0;
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				
				isum=isum+Arr[i][j];
					
			}
			System.out.println("maximum number from row is :"+isum);
		}
		
	}
}


class Mat6
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
		dobj.AdditionRow();
		
		System.gc();
	}
}
