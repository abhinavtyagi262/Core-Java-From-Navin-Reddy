class calculator1
{
	public int add(int i,int j)
	{
		return i+j;
	}
	
}
class calculator2 extends calculator1{
	public int sub(int i,int j)
	{
		return i-j;
	}
	
}
class calculator3 extends calculator2
{
	public int multi(int i,int j)
	{
		return i*j;
	}
	
}
public class InheritenceDemo 
{

	
	public static void main(String[] args)
	{
		calculator3 obj=new calculator3();
		System.out.println(obj.add(4,5));
		System.out.println(obj.sub(4,5));
		System.out.println(obj.multi(4,5));
		
		
		
		
		

	}

}
