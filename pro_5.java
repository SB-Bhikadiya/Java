import java.util.Scanner;

public class pro_5 {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt user to choose a case conversion option
        System.out.println("Choose a case conversion option:");
        System.out.println("1. UPPERCASE");
        System.out.println("2. lowercase");
        System.out.println("3. Sentence case");
        System.out.println("4. tOGGLE cASE");
        int choice = scanner.nextInt();

        // Perform the chosen case conversion
        String output = "";
        switch (choice) {
            case 1:
                output = input.toUpperCase();
                break;
            case 2:
                output = input.toLowerCase();
                break;
            case 3:
                output = toSentenceCase(input);
                break;
            case 4:
                output = toToggleCase(input);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                return;
        }

        // Display the converted string
        System.out.println("Output: " + output);
    }

    // Helper method to convert a string to sentence case
    private static String toSentenceCase(String input) {
        if (input.length() == 0) {
            return "";
        }
        String firstChar = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1).toLowerCase();
        return firstChar + rest;
    }

    // Helper method to convert a string to toggle case
    private static String toToggleCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
