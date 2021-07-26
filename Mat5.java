
import java.util.*;
import RUSHi.Matrix;

class Demo extends Matrix
{
	
	public Demo (int irow , int icol)
	{
		super(irow,icol);
	}
	
	public void MaximumRow()
	{
		int imax = 0;
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			 imax=Arr[i][0];
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				if(Arr[i][j] > imax)
				{
					imax=Arr[i][j];
					
				}
				
			}
			System.out.println("maximum number from row is :"+imax);
		}
		
	}
}


class Mat5
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
		dobj.MaximumRow();
		
		System.gc();
	}
}
