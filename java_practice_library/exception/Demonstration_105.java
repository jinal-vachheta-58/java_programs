class Demonstration_105 {
public static void main (String args[ ]){
int number, InvalidCount = 0, validCount = 0;
for (int i = 0; i < args.length; i++)
{
try {
number = Integer.parseInt(args[i]);
} catch (NumberFormatException e){
InvalidCount++;


System.out.println ("Invalid number at " + i +" "+ args[i]);

}
validCount++;
System.out.println ("Valid number at " + i+" "+ args[i]);

}
System.out.println ("Invalid entries: " + InvalidCount);
System.out.println ("Valid entries: " + validCount);
}
}

/*
 E:\new>java Demonstration_105 10 p -1
Valid number at 0 10
Invalid number at 1 p
Valid number at 1 p
Valid number at 2 -1
Invalid entries: 1
Valid entries: 3


E:\new>java Demonstration_105 p q r
Invalid number at 0 p
Valid number at 0 p
Invalid number at 1 q
Valid number at 1 q
Invalid number at 2 r
Valid number at 2 r
Invalid entries: 3
Valid entries: 3

E:\new>java Demonstration_105 3 5 7
Valid number at 0 3
Valid number at 1 5
Valid number at 2 7
Invalid entries: 0
Valid entries: 3

 */