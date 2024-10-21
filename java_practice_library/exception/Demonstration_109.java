

/* finally in try-catch block */

class Demonstration_109 {
public static void main (String [ ] args ) {
int i = 0;
String greetings[] = {"Hello Twinkle !", "Hello Java !", "Hello World! "};
while ( i < 4) {
try {
System.out.println (greetings [i] );
i++;

}catch (Exception e ) {
System.out.println (e.toString() );
// Message of exception e in String format
}
finally {
System.out.println (" Hi !");
if (i < 3)
{
    
}
else {System.out.println("You should quit and reset index value");
break;
}


}
} // while ( )
} // main ( )
} // class


/*

Hello Twinkle !
 Hi !
Hello Java !
 Hi !
Hello World!
 Hi !
You should quit and reset index value

*/