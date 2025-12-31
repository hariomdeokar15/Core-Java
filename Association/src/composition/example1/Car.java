package composition.example1;

public class Car {
	
	private Engine engine;
	
	Car(){
		engine = new Engine();
		
	}
	
	void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
	

}
