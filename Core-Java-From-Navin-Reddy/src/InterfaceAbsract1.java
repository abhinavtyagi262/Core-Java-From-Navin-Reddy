interface writer                    //we basically want to create reference of writer to 
{                                        //execute methods of both extended classes altogether
	 void write();        
}
class pen implements writer                     
{                                               
public void write()                              
{
	System.out.println("i am a pen");

}
}
class pencil implements writer
{                                                
public void write()
{
	System.out.println("i am a pencil");

}
}
class kit
{
 public void doSomething(writer w)
{
     w.write();
}
}
public class InterfaceAbsract1
{

	
	public static void main(String[] args)
	{
		kit k=new kit();
		writer p=new pen();                
		writer pc=new pencil();
		
        k.doSomething(pc);
        k.doSomething(p);
	}


}