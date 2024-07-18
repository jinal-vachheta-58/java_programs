/*
3. Create a Circle class with the following properties: radius. Implement methods to calculate
the area and circumference of the circle.
*/
import java.util.Scanner;

class circle {
    private float radius;
    public circle(float r) {
        this.radius = r;  
    }
    private double circumference()
    {
        return 3.14 * 2 * this.radius;
    }
    private double area()
    {
        return 3.14 * this.radius * this.radius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circle p1 = new circle(5);
        int ch;
        do{
            System.out.println("\n1. area\n2. circumference \n\nEnter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1: 
                    double x = p1.area();
                    System.out.println("\narea of circle : "+x);
                    break;
                
                case 2: 
                    double y = p1.circumference();
                    System.out.println("\narea of circle : "+y);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("enter valid choice");
            }

        }while(ch != 0);
    
    }    
}
