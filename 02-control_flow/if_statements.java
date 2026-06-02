public class if_statements {
	int age = 18;
	// executed if age variable is at least 18
	if(age <= 18){
		System.out.println("Adult");
	}

	// check whether a number is positive
	int number = -5;
	if(number > 0){
		System.out.println("Positive");
	} else {
		System.out.println("Negative");
	}

	// else if ladder
	int grade = 85;
	if(grade >= 90){
		System.out.println("A");
	}
	else if(grade >= 80){
		System.out.println("B");
	}
	else if(grade >= 70){
		System.out.println("C");
	}
	else {
		System.out.println("F");
	}

	// nested if statements
	int age = 20;
	boolean hasLicense = true;
	if(age >= 16){
		if(hasLicense){
			System.out.println("You may enter.");
		}
	}

	// operators in conditions
	if(age >= 16 && hasLicense){
		System.out.println("Entry granted.");
	}
}
