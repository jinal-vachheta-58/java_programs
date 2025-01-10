import java.util.StringTokenizer;
import java.util.Stack;

public class ReverseStringTokenizerExample {
    public static void main(String[] args) {
        String str = "Hello World Welcome to Java";
        
        // Tokenize the string using space as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        Stack<String> stack = new Stack<>();
        
        // Push all tokens into the stack
        while (tokenizer.hasMoreTokens()) {
            stack.push(tokenizer.nextToken());
        }
        
        // Pop tokens from the stack to reverse their order
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop()).append(" ");
        }

        // Trim the last space and print the reversed string
        System.out.println(reversedString.toString().trim());
    }
}
