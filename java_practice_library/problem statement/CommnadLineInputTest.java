//ex-4
class CommnadLineInputTest{
public static void main(String args[ ] ) {
int count;
String aString;
count = args.length;

System.out.println( "Number of arguments ="+ count);

for(int i = 0; i < count; i++) {
aString = args[i];
System.out.println( "args["+i+"]"+"="+ aString);



}
}
}

/*

problem:  args[i] in place of args[0]

z:\java\problem statement>javac CommnadLineInputTest.java

z:\java\problem statement>java CommnadLineInputTest khushi krisa prachi jil
Number of arguments =4
args[0]=khushi
args[1]=krisa
args[2]=prachi
args[3]=jil

*/