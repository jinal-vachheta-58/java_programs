/*8) Write an application that counts the total number of characters in all of its command-line
arguments. */

public class CharacterCounter {
    public static void main(String[] args) {
        int totalCharacters = 0;

        for (String arg : args) {
            totalCharacters += arg.length();
        }

        System.out.println("Total number of characters in command-line arguments: " + totalCharacters);
    }
}

/*
 E:\java>java CharacterCounter khushi shah
Total number of characters in command-line arguments: 10

E:\java>java CharacterCounter khushi
Total number of characters in command-line arguments: 6

 */