fun main(args: Array<String>) {
	var d1: Dog = Dog("BowBow1", 25, "Labrador1");
	var d2: Dog = Dog("BowBow2", 125, "Labrador2");
	var d3: Dog = Dog("BowBow3", 225, "Labrador3");

	d1.bark();
	println(d1);
	println("====")
	var dogs: Array<Dog> =
		arrayOf(
			Dog("brownie1", 14, "daburman1"),
			Dog("brownie2", 114, "daburman2"),
			Dog("brownie3", 214, "daburman3")
		)

	for (dog: Dog in dogs) {
		println(dog);
	}
	println("Another way...");

	var newDogs: Array<Dog> = arrayOf(d1, d2, d3);
	for (i in 0 until newDogs.size) {
		println(newDogs[i])
	}
}

class Dog(val name: String, var weight: Int, val breed: String) {
	var upperBreed = breed.toUpperCase();
	lateinit var unInitialised: String;

	val weightInKgs: Double
		get() = weight / 2.2;

	var lowerBreed: String = name
		set(value) {
			field = value
		}

	fun bark() {
		if (weight < 20) {
			println("Yip!!! " + upperBreed);
		} else {
			println("Woof!!!" + upperBreed);
		}
	}

	override fun toString(): String {
		return "Hello, I am a " + breed + " and name is " + name + " of: " + weight + " lbs";
	}

	init {
		println("=> Just now created an object " + name + " , " + unInitialised);
		unInitialised = "Jodha";
	}


}