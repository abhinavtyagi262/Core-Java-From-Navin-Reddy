class A
{
	int num1;
	int num2;
	int result;
	public A()
	{
		num1=5;
		num2=5;
		System.out.println("hii");
	}
	public A(int n)
	{
		num1=n;
	}
	public A(double d,int n)
	{
		num1=(int) d;
		num2=n;
	}
}

public class ConstructorExmple
{
	public static void main(String[] args)
	{
	//	A obj=new A();
	//	A obj=new A(7);
		A obj=new A(9.5,8);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
