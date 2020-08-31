package Tests;

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.MethodOverloading();
		obj.MethodOverloading(10);
		obj.MethodOverloading(10,20);

		
	}
		
		public void MethodOverloading() {
			System.out.println("no input, no output");
		}
		public void MethodOverloading(int i) {
			System.out.println("input, no output " +i);
		}
		public int MethodOverloading(int i, int j) {
			System.out.println("input, output " +(i+j));
			return i+j;
		}
		


}
