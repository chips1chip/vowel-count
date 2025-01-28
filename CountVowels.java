public class CountVowels {
    public static void main(String[] args) {
        int vowelCount = 0; // To count vowels
        String sentence = "My name is Anjali"; // Input string
        sentence = sentence.toLowerCase(); // Convert to lowercase for easy comparison
        for (int idx = 0; idx < sentence.length(); idx++) {
            char currentChar = sentence.charAt(idx); // Get character
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++; // Increment if vowel
            }
        }
        System.out.println("THE NO. OF VOWELS: " + vowelCount); // Display the result
    }
}
