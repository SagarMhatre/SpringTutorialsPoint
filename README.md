* Started with a Spring Starter Project, no dependencies selected
* Deleted classes from src/test/java
* Removed the spring-boot-starter-test dependency from the pom.xml
* Created a class with private member, Getter & Setter 
* Added Spring Bean Configuration file \src\main\resources\beans.xml. Selected the beans schema.
* Declared a bean in it
* Got a reference to the Bean using ClassPathXmlApplicationContext's getBean method 
* bean tag attributes : lazy-init="true" init-method destroy-method
* bean tag attributes : scope="singleton/prototype"