// 8) Write an application that counts the total number of characters in all of its command-line
// arguments.

/**
 * count_char_in_command_line
 */
public class count_char_in_command_line {
    public static void main(String[] args) {
        int total_len = 0;
        for (String arg : args) {
            total_len = total_len + arg.length();
        }
        System.out.println("total length "+ total_len);
    }
}