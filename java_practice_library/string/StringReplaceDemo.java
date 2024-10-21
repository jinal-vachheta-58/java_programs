//Example 15.7: Replace character(s) in a string by another character(s)

// Replacing characters in a string.
class StringReplaceDemo {
public static void main(String args[]) {
String s1 = "Java";
String s2 = s1.replace('a', 'u'); // Replace all occurrences of a with u
System.out.println(s2);
System.out.println();
String s3 = "top and pop";
String s4 = s3.replace("op", "oop"); // Replace op with oop
System.out.println(s4);
}
}


/*
 Juvu

toop and poop
 */