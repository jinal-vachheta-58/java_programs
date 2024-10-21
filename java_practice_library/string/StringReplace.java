//Example 15.5: Extracting substring of a string

// Substring replacement.

class StringReplace {
public static void main(String args[]) {
String org = "This is a test. This is, too.";
String search = "is";
String sub = "was";
String result = "";
int i;
do { // replace all matching substrings
System.out.println(org);
i = org.indexOf(search);
if(i != -1) {
result = org.substring(0, i);
result = result + sub;
result = result + org.substring(i + search.length());
org = result;
}
} while(i != -1);
}
}

/*

This is a test. This is, too.
Thwas is a test. This is, too.
Thwas was a test. This is, too.
Thwas was a test. Thwas is, too.
Thwas was a test. Thwas was, too.

class StringReplace {
    public static void main(String args[]) {
        String org = "This is a test. This is, too."; // Original string
        String search = "is"; // Substring to search for
        String sub = "was"; // Substring to replace with
        String result = ""; // To hold the intermediate result
        int i; // Index of the first occurrence of 'search'
        
        do { // Loop to replace all occurrences of 'search'
            System.out.println(org); // Print the current state of 'org'
            i = org.indexOf(search); // Find the index of the first occurrence of 'search'
            if(i != -1) { // If 'search' is found
                result = org.substring(0, i); // Extract substring before 'search'
                result = result + sub; // Append 'sub' to the result
                result = result + org.substring(i + search.length()); // Append the remaining part of 'org'
                org = result; // Update 'org' with the new string
            }
        } while(i != -1); // Continue the loop as long as 'search' is found
    }
}


*/