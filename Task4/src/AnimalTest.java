//animaltest class extends animal
public abstract class AnimalTest extends AbstractAnimal {

	public static void main(String args[]) {
		//create new objects for dog lion and cat
		Dog1 Dog = new Dog1();
		Lion1 Lion = new Lion1();
		Cat1 Cat= new Cat1();
		
		//call the methods that are unique to the dog/cat/lion classes
		//call the methods in the Animal class
		Dog.bark();
		Dog.sleep();
		Dog.eat();
		Dog.move();
		
		//call all of the main methods, as well as the methods unique to the cat class
		Cat.meow();
		Cat.sleep();
		Cat.eat();
		Cat.move();
		
		//call all of the main methods, as well as the methods unique to the lion class
		Lion.roar();
		Lion.sleep();
		Lion.eat();
		Lion.move();
	}
	
}
