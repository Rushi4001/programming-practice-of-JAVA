
// javac Matrix.java -d .
package RUSHi;

import java.util.*;

public class Matrix
{
	public int Arr[][];
	public Matrix(int iRow, int iCol)
	{
		Arr = new int[iRow][iCol];
	}
	protected void finalize()
	{
		Arr = null;
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter th elements");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		System.out.println("Elemenets of Matrix are : ");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
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

