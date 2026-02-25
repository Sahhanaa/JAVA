import java.io.File;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            String longest = "";
            while (sc.hasNext()) {
                String word = sc.next();
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("Longest word: " + longest);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}