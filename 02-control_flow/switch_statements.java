public class _switch {
    int day = 3;

    // evaluate the value of day
    switch (day) {
        case 1:
            System.out.println("Monday");
            // without break, execution falls to next case
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid Day");
    }

    // string example
    String color = "red";
    switch (color) {
        case "red":
            System.out.println("Stop");
            break;
        case "green":
            System.out.println("Go");
            break;
        default:
            System.out.println("Unknown");
    }

    // modern java
    String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        default -> "Unknown";

    };
}
