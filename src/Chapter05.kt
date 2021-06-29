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


open class Canine : Animal() {
	override fun roam() {
		println("The Canine is roaming");
	}
}

class Wolf : Canine() {
	override val image = "wolf.jpeg";
	override val food = "meat";

	override val habitat = "forests";

	override fun makeNoise() {
		println("Howl!!!!");
	}

	override fun eat() {
		println("The Wolf is eating food.");
	}
}

class Hippo : Animal() {
	override val image = "hippo.jpeg";
	override val food = "grass";

	override val habitat = "water";

	override fun makeNoise() {
		println("Grunt!!!!");
	}

	override fun eat() {
		println("The Hippo is eating food.");
	}
}