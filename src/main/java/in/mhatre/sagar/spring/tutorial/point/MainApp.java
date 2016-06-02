package in.mhatre.sagar.spring.tutorial.point;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");

      //HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
      obj.getMessage();      
      
      for(int i=0;i<3;i++){
    	  HelloWorld singletonHelloWorld = context.getBean("singletonHelloWorld", HelloWorld.class);
    	  singletonHelloWorld.printCreationTimestamp();
    	  HelloWorld prototypeHelloWorld = context.getBean("prototypeHelloWorld", HelloWorld.class);
    	  prototypeHelloWorld.printCreationTimestamp();    	  
          
      }
      
      HelloWorld helloWorldWithinitAndDestroy = context.getBean("helloWorldWithinitAndDestroy", HelloWorld.class);
      helloWorldWithinitAndDestroy.getMessage();
      
      ((AbstractApplicationContext) context).registerShutdownHook();
      
   }
}