package firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 


public class Test {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  

		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	    Student student2=(Student)/*factory*/context.getBean("studentbean2");  
	    student2.displayInfo();
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();
	}  
	}  

