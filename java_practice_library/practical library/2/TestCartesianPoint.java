public class TestCartesianPoint {
    public static void main(String[] args) {
        CartesianPoint point1 = new CartesianPoint(5, 10);
        point1.display();
        
        point1.move(7, 14);
        point1.display();  

        point1.move(3);
        point1.display();  

       
        CartesianPoint point2 = new CartesianPoint(8);
        point2.display();  
    }
}


/*
 C:\Users\rcc\Desktop>javac CartesianPoint.java TestCartesianPoint.java

C:\Users\rcc\Desktop>java TestCartesianPoint
Current Position: (5, 10)
Current Position: (7, 14)
Current Position: (3, 3)
Current Position: (8, 8)

 */