public class break_continue {
	// loop from 1 to 10
    for (int i = 1; i <= 10; i++) {
    // stop the loop when i reaches 5
        if (i == 5) {
            break;
        }
        System.out.println(i);
    }

    // loop from 1 to 5
    for (int i = 1; i <= 5; i++) {
    // skip the number 3
        if (i == 3) {
            continue;
        }
        System.out.println(i);
    }

    // break in switch statements
    switch (choice) {
        case 1:
            System.out.println("Option 1");
            break;
        default:
            System.out.println("Invalid");
    }
}
