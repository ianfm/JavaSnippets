public class Enumeration {
	Car myCar;

	enum Car {
		lamborghini("red", "ultrafast"),
		ferrari ("yellow", "superfast"),
		audi ("silver", "fast"),
		bmw ("blue", "quick"),
		mercedes ("black", "slow");

		// Fields
		private final String color;
		private final String speed;

		// Constructor (used at top when defining enum values)
		Car(String color, String speed) {
			this.color = color;
			this.speed = speed;
		}
		// Why does an enum get constructors when all of the possible elements are already defined?
		// Turns out you can't access an Enum constructor yourself! 

		// Methods
		private String color() { return color; }
		private String speed() { return speed; }
	}

	public static void main(String[] args) {
		// Car inGarage = Car.lamborghini;
		// System.out.printf("A %s is %s and %s", inGarage, inGarage.color(), inGarage.speed());

		for (Car car: Car.values()) {
			System.out.printf("A %s is %s and %s\n", car, car.color(), car.speed());
		}
	}
}
