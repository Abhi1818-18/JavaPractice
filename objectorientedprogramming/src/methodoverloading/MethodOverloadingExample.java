package methodoverloading;

public class MethodOverloadingExample {
	//method overloading with different parameters
	void add(int a,int b) {
		System.out.println("Result : " +(a+b));
	}
	void add(int a, int b, int c) {
        System.out.println("Result: " + (a + b + c));
    }
	
//	method overloading with different data type
	 void add2(int a, int b) {
	        System.out.println("Result: " + (a + b));
	    }

	    void add2(double a, double b) {
	        System.out.println("Result: " + (a + b));
	    }
	//method overloading with different sequence of parameters
	void add3(int a, double b) {
        System.out.println("Result: " + (a + b));
    }

    void add3(double a, int b) {
        System.out.println("Result: " + (a + b));
    }

	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		MethodOverloadingExample obj1 = new MethodOverloadingExample();
		MethodOverloadingExample obj2 = new MethodOverloadingExample();
		
		obj.add(23, 23);
		obj.add(23, 56, 567);
	
	    obj1.add2(2.4, 5.6);
		obj1.add2(2, 4);
		
		obj2.add3(3.5, 7);
		obj2.add3(23, 3.4);
		
		
		

	}

}
