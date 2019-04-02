public class Animal {
		
	public boolean isAPet = true;
	public String owner = "John";
		
	//this is a method that can be called by all classes inheriting this superclass
	public void sleep() {
		System.out.println("Sleeping");
	}
			
	public void eat() {
		System.out.println("Eating");
	}
	
	public void makeSound() {
		System.out.println("The animal makes sounds");
	}
	
	public String getowner() {
		return owner;
	}
	
	public void setOwner(String NewOwner) {
		owner = NewOwner;
	}
		
}

