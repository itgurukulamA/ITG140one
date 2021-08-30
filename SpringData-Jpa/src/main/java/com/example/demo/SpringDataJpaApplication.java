package com.example.demo;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.repo.userRepositiory;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		userRepositiory userRepositiory=((BeanFactory) context).getBean(userRepositiory.class);
		User user1=new User();
		user1.setId(9);
		user1.setCity("hyd");																
		user1.setName("chirasmita");
		
		User user2=new User();
		user2.setId(5);
		user2.setCity("banaglore");																
		user2.setName("debasmita");
		
		
		User result=userRepositiory.save(user1);
		User result1=userRepositiory.save(user2);
		
		System.out.println("Saved user="+result);
		System.out.println("done");
		
		
		List<User> users=userRepositiory.findByName("");
		List<User> users1=userRepositiory.findByNameAndCity("sonu","abc");
		users.forEach(e->System.out.println(e));
		List<User> allUser=userRepositiory.getAllUser();
		allUser.forEach(f->System.out.println(f));
		

}
}
