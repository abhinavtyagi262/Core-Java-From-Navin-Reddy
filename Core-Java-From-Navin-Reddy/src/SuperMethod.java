class Abc
{
	public Abc()
	{
		System.out.println("in Abc");
	}
	public Abc(int i)
	{
		System.out.println("in Abc parameterized");
	}
}
class xyz extends Abc
{
	public xyz()
	{
		//super();                                //by defalut method in sub class
		super(5);
		System.out.println("in xyz");
	}
	public xyz(int i)
	{
		//super();                //by defalut method in sub class    //
		super(i);
		System.out.println("in xyz parameterized");
	}
}
public class SuperMethod 
{

	
	public static void main(String[] args) 
	{
		xyz obj=new xyz();
		

	}

}
