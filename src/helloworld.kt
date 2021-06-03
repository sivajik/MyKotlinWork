fun main(args: Array<String>) {
	val name = "jodha is good"
	val height = 10

	println("my name is $name");
	println("my height is $height");
	printName(name);
	println("---------------")

	val a = 6
	val b = 7
	val c = a + b + 10
	val str = c.toString()
	println("Sum of value: $str")
	println("---------------")

	val array = arrayOf("sunday", "monday", "tuesday")
	var x = 0
	while (x < 3) {
		println("Item $x is ${array[x]}")
		x = x + 1;
	}
}

fun printName(name: String) {
	println("*** I am printing..." + name)
}