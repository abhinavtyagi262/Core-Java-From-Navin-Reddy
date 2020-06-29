class calcu
{
	public int  add(int ... n)
	
	{
		int sum=0;
	    for(int k:n)
	    {
	    	sum=sum+k;
	    }
	    return sum;
	}
}
public class VarArgsDemo 
{
	
	public static void main(String[] args)
	{
		calcu obj=new calcu();
		System.out.println(obj.add(4,5,7));

	}

}
