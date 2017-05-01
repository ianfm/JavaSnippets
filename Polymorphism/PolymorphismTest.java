abstract class Animal {
	String size;
	String sound;

	void secret() {
		// for animal, nothing
	}

	String size() {
		return this.size;
	}

	void makeSound() {
		System.out.println("IMA ANIMAL");
	}
}

class Mammal extends Animal {
//  String size;
//  String Sound;
	void secret() {
		System.out.print("Mammal's secret: ");
		System.out.println(this.size);
	}	

	String size() {
		return this.size;
	}

	void makeSound() {
		System.out.println("I am Mammal");
	}
}



/* 	Dog MUST define the secret() method 
	in order for the
*/
class Dog extends Mammal {
//  String size;
	String sound = "Woof";	// default dog sound is woof
	String breed;

	void secret() {
		System.out.print("Dog's Secret: ");
		System.out.println("LOL doggo has no secrets heehee");
	}

	void makeSound() {
		System.out.println("Bark");
	}

	void getBreed() {
		System.out.println(this.breed);
	}
}

class Chihuahua extends Dog {
	String size = "Tiny";
	String sound = "Yipyipyipyipyipyip";
	String breed = "Chihuahua";

	void secret() {
		System.out.print("Chihuahua's Secret: ");
		System.out.println(this.sound);
	}	

	void makeSound() {
		System.out.println("Yipyipyipyipyipyip");
	}

	void getBreed() {
		System.out.println(this.breed);
	}
}

class Husky extends Dog {
	String size = "Big";
	String sound = "Woof";
	String breed = "Husky";

	void secret() {
		System.out.print("Husky's Secret: ");
		System.out.println(this.size);
	}	

	void makeSound() {
		System.out.println("Woof");
	}

	void getBreed() {
		System.out.println(this.breed);
	}
}


/////////////////////////////////////////////////


public class PolymorphismTest {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.secret();

		// REQUIRES some (any) superclass to implement secret()
		// otherwise cannot compile!!!
		Dog chi = new Chihuahua();
		chi.secret();

		// REQUIRES some (any) superclass to implement secret()
		Dog husk = new Husky();
		husk.secret();
	}
}