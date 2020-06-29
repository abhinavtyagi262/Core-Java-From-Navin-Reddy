abstract class human
{
	public abstract void eat();
	public void walk()
	{
		
	}
}
class man extends human        //concrete class
{
	public void eat()
	{
		
	}
}
public class AbstractDemo
{

	
	public static void main(String[] args)
	{
	human obj=new man();	
    obj.eat();
	}

}
