import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserBean implements InitializingBean,DisposableBean			
{
	private String name;
	//setter
	public void setName(String name){this.name=name;}
	//bc
	public void showMyName()
	{
		System.out.println("Ur Name="+name);
	}
	//life cycle method
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Logic in destroy() method");		
	}
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Logic in afterPropertiesSet() method");			
	}		
}