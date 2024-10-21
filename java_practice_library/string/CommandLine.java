//Example 15.4: Creating strings as arguments in Java’s main()

class CommandLine {
public static void main(String args[]) {
for(int i=0; i<args.length; i++)
System.out.println("args[" + i + "]: " + args[i]);

}
}

/*

E:\khushi>java CommandLine shah khushi
args[0]: shah
args[1]: khushi
*/