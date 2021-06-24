fun main(args: Array<String>) {
	println("hello wolrd");
}

open class Animal() {
	open val image = "";
	open val food = "";
	open val habitat = "";
	/* I am not keeping as open this */ var hunger = 10;

	open fun makeNoise() {
		println("Animal is making some noise");
	}

	open fun eat() {
		println("Animal is eating");
	}

	open fun roam() {
		println("Animal is roaming");
	}

	fun sleep() {
		println("Animal is sleeping");
	}
}

class Hippo : Animal() {

}