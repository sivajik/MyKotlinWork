fun main(args: Array<String>) {
	var x = 5;
	var z: Long = x.toLong();
	println(z);
	println("===========");


	var array = arrayOf(26, 3, 20, 4, 13, 8, 19, 80)
	println(array.size);
/*
	val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
	val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
	val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")
	val arraySize1 = wordArray1.size
	val arraySize2 = wordArray2.size
	val arraySize3 = wordArray3.size

	val rand1 = (Math.random() * arraySize1).toInt();
	val rand2 = (Math.random() * arraySize2).toInt();
	val rand3 = (Math.random() * arraySize3).toInt();

	var phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray2[rand3]}"
	println(phrase);
*/	
	
	var fruits:Array<String> = arrayOf("Banana", "Blueberry", "Pomegranate", "Cherry");
	var i = 0;
	while (i < fruits.size) {
		println("Fruit: ${fruits[i]} => " +  fruits[i]);
		i++;
	}
}