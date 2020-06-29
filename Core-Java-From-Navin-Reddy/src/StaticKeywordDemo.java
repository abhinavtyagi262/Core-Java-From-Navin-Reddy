class emp
{
	int eid;
	int salary;
	static String ceo;
	static                    //class is loaded only once
	{
		ceo="dumphy";
		System.out.println("in static");
	}
	public emp()              //default value
	{
		eid=1;
		salary=2000;
		System.out.println("in constructor");
	}
	public void show()
	{
		System.out.println(eid +":"+ salary +":"+ ceo);
	}
}
public class StaticKeywordDemo {

	
	public static void main(String[] args) 
	{
	emp ab=new emp();
	ab.eid=1;
	ab.salary=2000;
	//ab.ceo="larry";
	emp xy=new emp();
	xy.eid=2;
	xy.salary=8000;
	//xy.ceo="nikita";
	//emp.ceo="nikita";
    ab.show();
    xy.show();
	}

}
