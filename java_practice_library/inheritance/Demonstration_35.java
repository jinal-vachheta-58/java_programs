/* Encapsulation: Defining a class with method */

class Pointt
{
int x,y;
void setPoint( ) {
x = 10;
y = 10;
}
}

// definition of another class. This is a main class

class Demonstration_35
{
//float distance;
public static void main (String args[ ]) {
Pointt p = new Pointt( );
p.setPoint();
System.out.println ( " x = "+ p.x );
System.out.println ( " y = "+ p.y );
}
}

/*

x = 10
y = 10

 */