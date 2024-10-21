import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "1.txt";
        System.out.println("Word count: " + countWords(filePath));
    }

    public static int countWords(String filePath) {
        int count = 0;
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNext()) {
                sc.next(); 
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
}
