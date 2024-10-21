//Example 15.10: Joining strings with delimiter

// Demonstrate the join() method defined by String.
class StringJoinDemo {
public static void main(String args[]) {
String result = String.join(" ", "Alpha", "Beta", "Gamma");
System.out.println(result);
result = String.join(", ", "Java", "query","E-mail: java@google.com");
System.out.println(result);
}
}

/*

Z:\java\string>java StringJoinDemo
Alpha Beta Gamma
Java, query, E-mail: java@google.com

*/