package methodoverriding;

public class MethodOverridingExample {
	
	/*
	 If subclass (child class) has the same method as declared in the parent class,
	 it is known as method overriding in Java.

     In other words, If a subclass provides the specific implementation of the method that has
      been declared by one of its parent class, it is known as method overriding.
      
      * Usage of Java Method Overriding
       Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
      Method overriding is used for runtime polymorphism
      
      
     * Rules for Java Method Overriding
        The method must have the same name as in the parent class
        The method must have the same parameter as in the parent class.
        There must be an IS-A relationship (inheritance).
	 
	 */

	public static void main(String[] args) {
		Vehicle v1 = new Bike();
		Vehicle v2 = new Vehicle();
		
		v1.run();
		v2.run();

	}

}
