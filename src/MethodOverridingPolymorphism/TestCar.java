package MethodOverridingPolymorphism;

public class TestCar {

	public static void main(String[] args) {
		BMW obj = new BMW();
		//the child class methods are called here...
		//Static Polymorphism or compile-time polymorphism - that means during compile time java will decide which method to call. 
		//Poymorphism is one to many, that means many methods i.e. method overriding.
		obj.start();
		obj.stop();
		obj.fuel();
		obj.safety();
		System.out.println("*********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.fuel();
		// c.safety(); ---------this won't work, as you cannot access child class properties into parent class
		
		System.out.println("*********");
		Car obj1 = new BMW(); //child class object can be referred by parent class reference variable - is called dynamic/run time polymorphism
		obj1.start();
		obj1.stop();
		obj1.fuel();
	}
}

/*Output
 ...BMW start function
...BMW stop function
...BMW fuel method
...BMW safety method
*********
... Car start function
...Car stop function
...Car fuel method
*********
...BMW start function
...BMW stop function
...BMW fuel method
 */
