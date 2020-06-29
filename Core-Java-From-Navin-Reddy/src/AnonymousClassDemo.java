interface abra
{
	void show();
}
public class AnonymousClassDemo {
	public static void main(String[] args) 
	{
		abra obj=new abra()
		                   {
			                public void show()
			                {
			                	System.out.println("this is me");
			                }
		                   };
	obj.show();
	}

}
