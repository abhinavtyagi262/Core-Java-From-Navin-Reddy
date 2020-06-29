
public class ExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
		 int arr[]=new int[5];
		 arr[5]=58;
		
	     int i=9/0;
	     System.out.println(i);
		}
		
		catch(ArithmeticException e)
		{
			System.err.println("error in division");
		}
		catch(Exception e)
		{
			System.err.println("error in array");
		}
		finally
		{
			System.out.println("bye");
		}
		
		
	}

	
}
