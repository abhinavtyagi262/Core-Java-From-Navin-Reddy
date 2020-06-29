class ca
{
	int num1;
	int num2;
	String operation;
	public ca()
	{
		num1=0;
		num2=0;
		operation="nothing";
	}
	public ca(int i)
	{
		num1=i;
		num2=0;
		operation="nothing";
	}
	public ca(int i,int j)
	{
		num1=i;
		num2=j;
		operation="nothing";
	}
	public ca(int i,int j,String op)
	{
		num1=0;
		num2=0;
		operation=op;
	}
}
public class ConstructorOverloading {

	
	public static void main(String[] args)
	{
		ca ob=new ca(5,6);
        System.out.println(ob.num1);
        System.out.println(ob.num2);
        System.out.println(ob.operation);
	}

}
