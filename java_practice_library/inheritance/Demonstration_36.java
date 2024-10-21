/* Automatic initialization in Java through the constructor as in C++*/
/* Encapsulation: Defining a class having method with parameter */
class Point1
{
int x,y;
void setPoint( int a, int b ) {

x = a;
y = b;
}
}

// definition of another class. This is a main class

class Demonstration_36
{
//float distance;
public static void main (String args[ ]) {
Point1 p1 = new Point1( );
Point1 p2 = new Point1( );
p1.setPoint(15, 20);
p2.setPoint(70, 30);
System.out.println ( " x = "+ p1.x );
System.out.println ( " y = "+ p1.y );
System.out.println ( " x = "+ p2.x );
System.out.println ( " y = "+ p2.y );
}
}


/*

 x = 15
 y = 20
 x = 70
 y = 30
 
 */