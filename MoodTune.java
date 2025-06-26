import java.util.*;

public class MoodTune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Map<String, List<String>> musicMap = new HashMap<>();
        musicMap.put("happy", Arrays.asList("Happy by Pharrell", "Good Vibes by Chris Janson"));
        musicMap.put("sad", Arrays.asList("Fix You by Coldplay", "Let Her Go by Passenger"));
        musicMap.put("angry", Arrays.asList("Numb by Linkin Park", "Lose Yourself by Eminem"));
        musicMap.put("relaxed", Arrays.asList("Weightless by Marconi Union", "Sunset Lover by Petit Biscuit"));

        System.out.println("Welcome to MoodTune ");
        System.out.print("How are you feeling today? (happy/sad/angry/relaxed): ");
        String mood = scanner.nextLine().toLowerCase();

        if (musicMap.containsKey(mood)) {
            System.out.println(" Based on your mood, we suggest these songs:");
            for (String song : musicMap.get(mood)) {
                System.out.println("- " + song);
            }
        } else {
            System.out.println("Sorry, we don't have suggestions for that mood yet.");
        }

        scanner.close();
    }
}
