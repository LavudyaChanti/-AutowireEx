import org.springframework.beans.factory.annotation.Autowired;

public class DemoBean				
{		
	@Autowired			//default constructor 	=>1.byName
	private SampleBean sb;		
	/*
	@Autowired			//Setters				=>2.byType
	public void setSb(SampleBean sb) 
	{
		System.out.println("I am setter");
		this.sb = sb;
	}*/
	/*
	@Autowired			//Constructor 			=>3.constructor
	public DemoBean(SampleBean sb) 
	{
		System.out.println("I am constructor");
		this.sb = sb;
	}*/
	//business component
	public void sayHello()
	{
		System.out.println("Hello");
		sb.sayHi();
	}
	
	
}