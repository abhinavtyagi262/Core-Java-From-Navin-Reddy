package com.abhinav;

public class UserDefinedExceptionDemo 
{

	
	public static void main(String[] args)
	{
		try
		{
		int i,j;
		i=20;
		j=21;
		int k=i/j;
		   if(k==0)
			   throw new AbhinavException("this is ajeeb ");
		System.out.println(k);
		}
		catch(AbhinavException e)
		{
			System.out.println("error"+ e.getMessage());
		}
	
		
		
	}

}
