
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
	
}

//dog class extends animal, so the dog class can utilise the methods in the main method
class Dog extends Animal{
	//create a method that is unique to the class dog
	public void bark() {
		System.out.println("Woof!");
	}
	
	
}
//lion class extends animal, so the lion class can call the methods from the main methods
class Lion extends Animal{
	//create a method that is unique to the lion class
	public void roar() {
		System.out.println("Roooaar!");
	}
}

//class cat extends animal, and as such it can use the methods used in the animal class
class Cat extends Animal{
	//create a method that us unique to the cat class
	public void meow() {
		System.out.println("meoww!");
	}
}