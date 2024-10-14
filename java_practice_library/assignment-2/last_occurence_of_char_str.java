
// searches the last occurance of a character in a string.
// import java.util.Scanner;

public class last_occurence_of_char_str {
    public static void main(String[] args) {
        String str = new String("jinal");
        last_occurence_of_char_str ccs = new last_occurence_of_char_str();
        int last_occurence = ccs.last_occurence(str, 'a');
        System.out.println("last_occurence : " + last_occurence);

    }
    public int last_occurence(String str,char c)
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
// output : 
// last_occurence : 3