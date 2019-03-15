import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("myconfig.xml");
		
		UserBean ub=(UserBean)ctx.getBean("id1");
		ub.showMyName();
		
		ctx.close();
	}
}