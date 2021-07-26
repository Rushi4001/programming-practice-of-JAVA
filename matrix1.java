
import java.util.*;

class matrix1
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
		Arr=null;
	}
}
























