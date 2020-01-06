package com.cg.intro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TempConverterClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("tempconverter.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		TempConverter tc=(TempConverter)factory.getBean("tempConverter");
		double cel=tc.fartocel(100);
		System.out.println("far to cel is:"+ cel);
	}

}
