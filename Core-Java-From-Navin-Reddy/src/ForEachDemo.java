
public class ForEachDemo
{

	
	public static void main(String[] args)
	{
		int d[][]={
				     {3,4,5,6},
				     {4,5,6},
				     {2,1,3,7}
		          };
		       
		for(int k[] : d)
		{
			for(int l:k)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
		
	}

}
