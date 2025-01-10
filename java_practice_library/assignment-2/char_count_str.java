
/*Write and run a JAVA program that reads a string from the user and perform the following.
 counts number of occurance of a given character (for example, " a") in a string.

searches the last occurance of a character in a string.
 */
import java.util.Scanner;

class char_count_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine();
        char_count_str ccs = new char_count_str();
        int c = ccs.count_char_occur(str, 'a');
        System.out.println("count_char_occur : " + c);
        
        int last_occurence = ccs.last_occurence(str, 'a');
        System.out.println("last_occurence : " + last_occurence);

        input.close();
    }

    public int count_char_occur(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    int last_occurence(String str,char c)
    {
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                index = i;   
            }
        }
        return index;
    }
}
