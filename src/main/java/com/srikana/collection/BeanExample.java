package com.srikana.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class BeanExample implements CommandLineRunner{
	
	@Autowired
	BeanFactory bf;
	
	@Autowired
	Employer empl;
	//ApplicationContext ac;
	
	public BeanExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	SpringApplication.run(BeanExample.class, args);	
		Employer emp =new Employer();
		emp.setName("IBM");
		
		BeanExample be= new BeanExample();
		be.getBean();
	}
	
	void getBean(){
		/*ac.getBean("Employer");	
		bf.getBean("Employer");
		bf.getBean("setName","Srikana");
		bf.getBean("getName");*/
		
		//empl.setName("Srikana");
		System.out.println(empl.getName());
		//System.out.println(bf.getBean("getName"));
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*ac.getBean("Employer");	
		bf.getBean("Employer");
		bf.getBean("setName","Srikana");
		bf.getBean("getName");*/
		
		//empl.setName("Srikana");
		System.out.println(empl.getName());
		//System.out.println(bf.getBean("getName"));
		
	}

}
