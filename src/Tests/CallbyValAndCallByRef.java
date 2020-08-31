package Tests;
public class CallbyValAndCallByRef {
	int p;
	int q;
	public static void main(String[] args) {
		CallbyValAndCallByRef obj = new CallbyValAndCallByRef();
		int x=10;
		int y=20;
		int i = obj.testSum(x, y); //call by value or pass by value
		System.out.println(i);
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		//after swap
		System.out.println("Value if p is: "+obj.p); //prints 60
		System.out.println("Value if q is: "+obj.q); //prints 50
	}
	public int testSum(int a, int b) { //one copy of x & y value will be given to a & b parameters
// if a = 30; b=40 defined in this class,; then the c value will be 70, rather than 30 this is because call by value         just keep the copy of values but these copies are replaced by another set of values
		int c = a + b;
		return c;
	}
	public void swap(CallbyValAndCallByRef t) { //call by reference i.e. passing the value of object reference
		int temp;
		temp= t.p; //50
		t.p=t.q; //60
		t.q=temp; //50
		System.out.println("value of temp is " +temp);
	}}
