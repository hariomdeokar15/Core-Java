package aggregation.example2;

public class Uni_directional_Aggregation {
	
	class Shop{
		
		String name;
		Worker w;
		
		
		Shop(String name, Worker w){
			this.name=name;
			this.w = w;
		}
		
		void show() {
			System.out.println("shopname: "+name);
			System.out.println("Worker name: "+w.name);
			System.out.println("Worker Number: "+w.workerNo);
		}
		
	}
	
	class Worker{
		
		String name;
		int workerNo;
		
		Worker(String name, int workerNo){
			this.name = name;
			this.workerNo = workerNo;
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uni_directional_Aggregation u = new Uni_directional_Aggregation();
		Worker w = u.new Worker("Nitin", 101);
		Shop s = u.new Shop("Ambika", w);
		s.show();
		
		

	}

}
