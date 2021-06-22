fun main(args: Array<String>) {
	var d1: Dog = Dog("BowBow", 25, "Labrador");
	d1.bark();
	println(d1);
	println("====")
	var dogs: Array<Dog> =
		arrayOf(Dog("brownie1", 14, "daburman1"), Dog("brownie2", 114, "daburman2"), Dog("brownie3", 214, "daburman3"))

	for (dog: Dog in dogs) {
		println(dog);
	}
	println("Another way...");
	for (i in 0 until dogs.size) {
		println(dogs[i])
	}
}

class Dog(val name: String, var weight: Int, val breed: String) {
	fun bark() {
		if (weight < 20) {
			println("Yip!!!");
		} else {
			println("Woof!!!");
		}
	}

	override fun toString(): String {
		return "Hello, I am a " + breed + " and name is " + name + " of: " + weight + " lbs";
	}
}