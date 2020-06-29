class calci
{
	int num1;
	int num2;
	int result;
	public void perform()
	{
	result=num1+num2;
	}
}
public class ObjectDemo 
{
	public static void main(String[] args) 
	{
	calci c=new calci();
	c.num1=3;
	c.num2=4;
	c.perform();
    System.out.println(c.result);
	}

}
