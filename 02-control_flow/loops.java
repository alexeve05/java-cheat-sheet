public class loops {
	int count = 1;

	// continue looping while its count is less than or equal to 5
	while(count <= 5){
		// print current value
		System.out.println(count);
		// increase by 1
		count++;
	}

	// do-while runs at least once
	do{
		System.out.println(count);
		count++;
	} while (count <= 5);

	// for loop combines initialization, condition, and update
	for(int i = 1; i <= 5; i++){
		System.out.println(i);
	}

	// outer loop controls flow
	for(int row = 1; row <= 3; row++){
		// inner loop controls columns
		for(int col = 1; col <= 3; col++){
			System.out.println("* ");
		}
		System.out.println();
	}

	// this loop doesnt stop
	while(true){
		System.out.println("Forever loop.");
}
