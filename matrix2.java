
import java.util.*;

class Mat
{
	public int Addition(int Arr[][])
	{
		int isum=0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				isum=isum+Arr[i][j];
			}
			
		}
		return isum;
	}
}

class matrix2
{
	public static void main(String str[]) //kahi chalt str
	{
		Scanner sobj = new Scanner (System.in);
		System.out.println("Enter number of Rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of Rows");
		int col = sobj.nextInt();
		
		int Arr[][]=new int[row][col];
		
		System.out.println("Enter the elements");
		for(int i=0;i<Arr.length;i++)   //rows
		{
			for(int j=0;j<Arr[i].length;j++) //columns
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
		System.out.println("Entered elements are");
		for(int i=0;i<Arr.length;i++)  //rows
		{
			for(int j=0;j<Arr[i].length;j++) //columns
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
		Mat mobj = new Mat();
		int ret = mobj.Addition(Arr);
		System.out.println("Addition is :"+ret);
		
		
		Arr=null;
	}
}

