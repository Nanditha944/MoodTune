import java.util.Scanner;
import java.util.Random;

public class TypeSpeedTest {
    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Practice makes a person perfect.",
            "Java is a popular programming language.",
            "Typing fast can save a lot of time.",
            "Simple projects are best for beginners."
        };

        Random random = new Random();
        String sentence = sentences[random.nextInt(sentences.length)];

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Typing Speed Test");
        System.out.println("Type the following sentence as fast and accurately as you can:");
        System.out.println("\"" + sentence + "\"");
        System.out.println("\nPress Enter when you're ready...");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();
        System.out.println("Start typing below:");
        String userInput = scanner.nextLine();
        long endTime = System.currentTimeMillis();

      
        long timeTaken = endTime - startTime; 
        double seconds = timeTaken / 1000.0;

        
        int wordCount = userInput.split(" ").length;
        double wpm = (wordCount / seconds) * 60;

        
        int correctChars = 0;
        int minLen = Math.min(userInput.length(), sentence.length());

        for (int i = 0; i < minLen; i++) {
            if (userInput.charAt(i) == sentence.charAt(i)) {
                correctChars++;
            }
        }

        double accuracy = ((double) correctChars / sentence.length()) * 100;

        
        System.out.printf("\nTime Taken: %.2f seconds\n", seconds);
        System.out.printf("Words Per Minute (WPM): %.2f\n", wpm);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        scanner.close();
    }
}
