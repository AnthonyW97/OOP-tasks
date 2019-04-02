
public abstract class AbstractAnimal {
	
	public void sleep() {
		System.out.println("Sleeping");
	}
		
	public void eat() {
		System.out.println("Eating");
	}
	
	public abstract void move();
}


class Dog1 extends AbstractAnimal{
	
	public void bark() {
		System.out.println("Woof!");
	}
	
	public void move() {
		System.out.println("Running");
	}
	
	
}

class Lion1 extends AbstractAnimal{
	
	public void roar() {
		System.out.println("Roooaar!");
	}
	
	public void move() {
		System.out.println("Sitting");
	}
}

class Cat1 extends AbstractAnimal{
	
	public void meow() {
		System.out.println("meoww!");
	}
	
	public void move() {
		System.out.println("Jumping");
	}
}
