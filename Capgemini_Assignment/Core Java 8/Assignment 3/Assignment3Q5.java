import java.util.HashMap;


class Employee {
    private String name;
    private int id;
    public Employee(){
    	
    }
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+", Name: "+name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 8;
	}
}
class Department{
	private String name;
	private int id;
	public Department() {
		
	}
	public Department(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Id: "+id+", Name: "+name;
	}
	
	
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    	HashMap<Employee,Department> details = new HashMap<>();
    	Employee e1 = new Employee("Harish",11);
    	Employee e2 = new Employee("Anu",12);
    	Employee e3 = new Employee("Krrish",13);
    	Employee e4 = new Employee("Milo",14);
    	Employee e5 = new Employee("Camila",15);
    	
    	Department d1 = new Department("CSE", 8);
    	Department d2 = new Department("ECE", 9);
    	Department d3 = new Department("MEC", 10);
    	Department d4 = new Department("EEE", 11);
    	
    	details.put(e1,d2);
    	details.put(e2,d4);
    	details.put(e3,d1);
    	details.put(e4,d1);
    	details.put(e5,d3);
    	System.out.println("Size of HashMap is: "+details.size());
    	
    	for (HashMap.Entry<Employee,Department> entry : details.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             "| Value = " + entry.getValue());
    	
    }

	
}
