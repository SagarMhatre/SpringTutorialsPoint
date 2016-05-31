package in.mhatre.sagar.spring.tutorial.point;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");

      //HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);

      obj.getMessage();
   }
}