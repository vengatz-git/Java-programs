package taskCode;

class VowelException extends Exception {
    VowelException(String message) {
        super(message);
    }
}

public class VowelsExceptionTask {
    // Method to check if the string contains vowels
    public static void checkVowels(String str) throws VowelException {
        if (str == null || str.isEmpty()) {
            throw new VowelException("The string is null or empty.");
        }

        str = str.toLowerCase();
        boolean vowelFound = false;

        // Check for vowels
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelFound = true;
                break;
            }
        }

        if (!vowelFound) {
            throw new VowelException("The string does not contain vowels.");
        }
    }

    public static void main(String[] args) {
        // Test Case 1: String with vowels
        try {
            checkVowels("Hello World");
            System.out.println("The string contains vowels.");
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        }

        // Test Case 2: String without vowels
        try {
            checkVowels("bcdfgh");
            System.out.println("The string contains vowels.");
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        }

        // Test Case 3: Null or empty string
        try {
            checkVowels("");
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        }
    }
}
