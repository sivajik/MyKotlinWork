fun main(args: Array<String>) {
	var d1: Dog = Dog("BowBow", 25, "Labrador");
	d1.bark();
	println(d1);
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