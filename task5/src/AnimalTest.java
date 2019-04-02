
public class AnimalTest extends Animal{
		
	public static void main(String args[]) {
		
		//create objects of the dog, cat, and lion classes
		Dog dogObj = new Dog();
		Cat catObj = new Cat();
		Lion lionObj = new Lion();
		
		// testing the dog object methods
		dogObj.bark();
		dogObj.eat();
		dogObj.sleep();
		//calling the dog makeSound method to override the animal method
		dogObj.makeSound();
		//changing the name of the owner
		dogObj.setOwner("Mike");
		System.out.println("The dog owner is " + dogObj.getowner());
		
		//testing the cat object methods
		catObj.meow();
		catObj.eat();
		catObj.sleep();
		//calling the cat makeSound method to override the animal method
		catObj.makeSound();
		//changing the name of the owner
		catObj.setOwner("Peter");
		System.out.println("The cat owner is " + catObj.getowner());
		
		//testing the lion object methods
		lionObj.roar();
		lionObj.eat();
		lionObj.sleep();
		//calling the lion makeSound method to override the animal method
		lionObj.makeSound();	
		//changing the name of the owner
		lionObj.setOwner("Alice");
		System.out.println("The lion owner is " + lionObj.getowner());
		
	}
}
