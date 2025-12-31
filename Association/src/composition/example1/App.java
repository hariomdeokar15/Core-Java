package composition.example1;

public class App {
   
	public static void main(String[] args) {
		
		Car c = new Car();
		c.drive();
		
		System.out.println("\n"+"========================="+"\n");
		
		BMW b = new BMW();
		b.drive();
	}
}
