package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

Resource r=new ClassPathResource("applicationContext.xml");
BeanFactory f=new XmlBeanFactory(r);
Student s=(Student) f.getBean("s");
System.out.println("hello 1");
//s.toString();
System.out.println("hello 2 "+s);
	}

}
