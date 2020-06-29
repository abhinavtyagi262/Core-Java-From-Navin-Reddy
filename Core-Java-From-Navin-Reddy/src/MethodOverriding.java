class az
{
	public void show()
	{
		System.out.println("in Az");
	}
}
class bx extends az
{
	//@Override                    //will show compile time error if there is any logical error
	public void show()
	{ 
		super.show();              // call both method of Az and bx
		System.out.println("in bx");
	}
}
public class MethodOverriding
{


	public static void main(String[] args)
	{
		bx obj=new bx();
		obj.show();           //by default it will call class bx show method means bx overrides az

	}

}
