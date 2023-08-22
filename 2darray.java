import java.util.*;
public class 2darray
{
	public static void main(String mm[])
	{
		Scanner k=new Scanner(System.in);
		int data[][]=new int[3][4];
		for(int j=0;j<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Enter the number ");
				data[i][j]=k.nextInt();
			}
		}
	
		System.out.println("the entered values are as follows");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(data[i][j]+" ");
			}
			System.out.println();
		} 
	}
}
