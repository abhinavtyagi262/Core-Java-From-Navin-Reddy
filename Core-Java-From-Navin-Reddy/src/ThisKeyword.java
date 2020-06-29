class b
{
    int num1;                          //instance variable
    int num2;
    public b(int num1,int num2)       //local variable
    {
    	this.num1=num1;
    	this.num2=num2;
    	//System.out.println("hii");
    }

}
public class ThisKeyword 
{
	public static void main(String[] args)
	{
	b obj=new b(4,5);	
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	

	}

}
