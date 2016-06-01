package in.mhatre.sagar.spring.tutorial.point;

public class HelloWorld {
	   private String message;
	   private long creationTimestamp;
	   
	   public HelloWorld(){
		   creationTimestamp = System.currentTimeMillis();
	   }
	   
	   public void printCreationTimestamp(){
		   System.out.println("CreationTime :" + creationTimestamp + " Your Message : " + message);
	   }

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   public void init(){
		   System.out.println("init : Your Message : " + message); 
	   }
	   
	   public void destroy(){
		   System.out.println("init : Your Message : " + message); 
	   }
	}