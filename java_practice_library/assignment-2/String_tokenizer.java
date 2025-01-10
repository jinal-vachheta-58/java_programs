import java.util.StringTokenizer;

/**
 * String_tokenizer
 */
public class String_tokenizer {
    public static void main(String[] args) {
        
        String s = new String("jinal vachheta p.");

        StringTokenizer t = new StringTokenizer(s);// default delimiter is space 
        while (t.hasMoreTokens()) {
            System.out.println(t.nextToken());
        }
    }
    
}