

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Question;

public class Test {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		
		Question q=(Question) f.getBean("q");
		System.out.println(q);

	}

}
