//Example 15..9: Changing the case of characters within a string
// Demonstrate toUpperCase() and toLowerCase().

class ChangeCaseDemo {
public static void main(String args[]) {
String s = "This is a test.";
System.out.println("Original: " + s);
String upper = s.toUpperCase();
String lower = s.toLowerCase();
System.out.println("Uppercase: " + upper);
System.out.println("Lowercase: " + lower);
}
}


/*

Z:\java\string>java ChangeCaseDemo
Original: This is a test.
Uppercase: THIS IS A TEST.
Lowercase: this is a test.

*/