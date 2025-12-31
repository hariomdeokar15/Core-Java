package aggregation.example1;

public class Bi_directional_Aggregation {
	class Teacher {
		int id;
	    String name;
	    Department department;

	    Teacher(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    void setDepartment(Department department) {
	        this.department = department;
	    }
	    
	    void show() {
	    	System.out.println("Teacher ID: "+id);
	    	System.out.println("Teacher Name: "+name);
	    	System.out.println("Department: "+department);
	    }
	    
	    void teaching() {
	    	System.out.println("Teacher is teaching");
	    }
	}

	class Department {
		String schoolName;
	    Teacher teacher;
	    String name;

	    Department(Teacher teacher, String name, String schoolName) {
	        this.teacher = teacher;
	        this.name = name;
	        this.schoolName = schoolName;
	    }
	    void show() {
	    	System.out.println("Teacher ID: "+teacher.id);
	    	System.out.println("Teacher Name: "+teacher.name);
	    	System.out.println("Department Name: "+name);
	    	System.out.println("Department School Name: "+schoolName);
	    	
	    }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "name: "+name+", School Name: "+schoolName;
		}
	    
	}
	
	 public static void main(String[] args) {
		 
		 Bi_directional_Aggregation b = new Bi_directional_Aggregation();
		    
	        Teacher t = b.new Teacher("Rahul", 101);
	        Department d = b.new Department(t, "IT", "JSPM");
	        t.setDepartment(d); // link after creation
	        System.out.println("This is teacher Class method");
	        t.show();
	        System.out.println("\n"+"================================="+"\n");
	        System.out.println("This is Department Class method");
	        d.show();
	    }

}
