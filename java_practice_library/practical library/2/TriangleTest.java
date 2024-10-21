public class TriangleTest {

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class Triangle {
        private Point p1, p2, p3;

        Triangle(Point p1, Point p2, Point p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public double area() {
            return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0);
        }

        public double perimeter() {
            return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
        }

        private double distance(Point a, Point b) {
            return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
        }

        public void display() {
            System.out.println("Points: " + p1 + " : " + p2 + " : " + p3);
        }

        public void move(double x, double y) {
            double dx = x - p1.x;
            double dy = y - p1.y;
            p1.x = x;
            p1.y = y;
            p2.x += dx;
            p2.y += dy;
            p3.x += dx;
            p3.y += dy;
        }

        public void move(Point newPoint) {
            move(newPoint.x, newPoint.y);
        }

        public void rotate(Point pivot, double angle) {
            if (angle == 90) {
                rotate90Clockwise(pivot);
            }
        }

        private void rotate90Clockwise(Point pivot) {
            p1 = rotatePoint(p1, pivot);
            p2 = rotatePoint(p2, pivot);
            p3 = rotatePoint(p3, pivot);
        }

        private Point rotatePoint(Point point, Point pivot) {
            double newX = pivot.x + (point.y - pivot.y);
            double newY = pivot.y - (point.x - pivot.x);
            return new Point(newX, newY);
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);
        Triangle triangle = new Triangle(p1, p2, p3);

        triangle.display();

        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        triangle.move(1, 1);
        triangle.display();

        triangle.rotate(new Point(1, 1), 90);
        triangle.display();

        Point newPoint = new Point(2, 2);
        triangle.move(newPoint);
        triangle.display();
    }
}


/*

Points: (0.0, 0.0) : (4.0, 0.0) : (0.0, 3.0)
Area: 6.0
Perimeter: 12.0
Points: (1.0, 1.0) : (5.0, 1.0) : (1.0, 4.0)
Points: (1.0, 1.0) : (1.0, -3.0) : (4.0, 1.0)
Points: (2.0, 2.0) : (2.0, -2.0) : (5.0, 2.0)

*/
