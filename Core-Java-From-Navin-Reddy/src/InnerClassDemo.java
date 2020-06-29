class outer
{
	int a;
	void show()
	{
		
	}
	static class inner
	{
		public void display()
		{
			System.out.println("this is an inner class");
		}
	}

}
public class InnerClassDemo
{
              //variable,method,class
	
	public static void main(String[] args)
	{
		outer obj=new outer();
		obj.show();
	  //outer.inner obj1=obj.new inner();        //for non static class
		outer.inner obj1=new outer.inner();      //for static class
		obj1.display();

	}

}
