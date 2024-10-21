//Example 15.6: Merging two strings

// String concatenation (merging).
class StringMergingDemo {
public static void main(String args[]) {

String s1 = "Bhumika";
String s2 = s1.concat("Shah");
System.out.println(s1);
System.out.println();
System.out.println(s2);


// Alternatively, + performs the same, for example

String s3 = "Bhumika";
String s4 = s3 + "Shah";
System.out.println(s3);
System.out.println();
System.out.println(s4);
}
}


/*
 Bhumika

BhumikaShah


Bhumika

BhumikaShah
 */