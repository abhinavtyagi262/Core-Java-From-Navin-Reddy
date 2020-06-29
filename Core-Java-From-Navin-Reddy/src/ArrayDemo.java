import java.util.Scanner;
public class ArrayDemo 
{

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[4][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;i<2;i++)
			{
				System.out.println("enter value");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr[i].length;i++)
			{
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
