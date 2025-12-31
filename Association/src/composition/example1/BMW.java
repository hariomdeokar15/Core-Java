package composition.example1;

public class BMW {
	
	private Engine engine;
	
	BMW(){
		engine = new Engine();
	}
	
	void drive() {
		engine.start();
        System.out.println("BMW started");
	}

}
