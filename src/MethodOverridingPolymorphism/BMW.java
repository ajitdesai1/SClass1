package MethodOverridingPolymorphism;

public class BMW extends Car{
	
	public void start() {
		System.out.println("...BMW start function");
	}
	public void stop() {
		System.out.println("...BMW stop function");
	}
	public void fuel() {
		System.out.println("...BMW fuel method");
	}
	public void safety() {
		System.out.println("...BMW safety method");
	}
}
