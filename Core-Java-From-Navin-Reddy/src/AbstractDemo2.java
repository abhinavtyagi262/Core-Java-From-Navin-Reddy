class printer
{
	public void show(Number i) //Number is a abstract class which is accessed by integers,float etc
	{                          //here we use wrapper classes like Integer and Float which extnds
		System.out.println(i);                            //abstract class like number
	}
}
public class AbstractDemo2
{

	
	public static void main(String[] args) 
	{
	printer obj=new printer();
	obj.show(5.5f);

	}

}
