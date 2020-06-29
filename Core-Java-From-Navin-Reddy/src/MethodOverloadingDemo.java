class casio
{
public void add(int i,int j)
{
System.out.println(i+j);	
}
public void add(int i,int j,int k)
{
System.out.println(i+j+k);	
}
public void add(double i,int j)
{
System.out.println(i+j);	
}
}
public class MethodOverloadingDemo
{

	
	public static void main(String[] args)
	{
		casio obj=new casio();
		obj.add(4.6,5);
	}

}
