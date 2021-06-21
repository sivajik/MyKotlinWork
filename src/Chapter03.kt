fun main(args: Array<String>) {
	var options = arrayOf("Rock", "Paper", "Scissors");
	var gameChoice: String = getGameChouse(options);
	println("Computer has selected : " + gameChoice);

	var userChoice = getUserChoice(options);
	println("User has selected : " + userChoice);

	println(printResult(gameChoice, userChoice));
}


fun getGameChouse(input: Array<String>): String {
	var index = Math.random() * input.size;
	println("Index: " + index.toInt());
	return input[index.toInt()];
}

fun getUserChoice(options: Array<String>): String {
	println("Please select one of the following inputs: ");

	for (item in options) {
		println(item);
	}

	var validChoice = false;
	var selection: String = "";
	while (!validChoice) {
		var input = readLine();
		for (item in options) {
			if (input.equals(item)) {
				validChoice = true;
				selection = input.toString();
			}
		}

		if (!validChoice) {
			println("*** Given input is wrong.. Try again.");
		}
	}
	return selection;
}

fun printResult(gameChoice: String, userChoice: String): String {
	var result: String = "";
	if (gameChoice == userChoice) {
		result = "Tie";
	} else if ((gameChoice == "Scissors" && userChoice == "Rock") || (gameChoice == "Rock" && userChoice ==
				"Paper") || (gameChoice == "Paper" && userChoice == "Scissors")
	) {
		result = "You Win";
	} else {
		result = "You Lose";
	}
	return result;
}