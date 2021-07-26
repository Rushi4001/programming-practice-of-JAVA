
import java.util.*;
import RUSHi.Matrix;

class Demo extends Matrix
{
	
	public Demo (int irow , int icol)
	{
		super(irow,icol);
	}
	
	void Forest()
	{
		for(int i = 1; i< Arr.length-1; i++)
		{
			for(int j = 1; j < Arr[i].length-1; j++)
			{
				if(Arr[i][j] == Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j+1]+Arr[i+1][j+1]+Arr[i+1][j]+Arr[i+1][j-1]+Arr[i][j-1])
				{
					System.out.println("Forest element is : "+Arr[i][j]);
				}	
			}
		}
	}

}


class Mat8     
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
		
		dobj.Forest();
		
		System.gc();
	}
}
