import java.util.Scanner;
class s8{
    int radius;

    s8(int radius)
    {
        this.radius = radius;
    }

    double area()
    {
        return Math.PI*radius*radius;
    }

    double perameter()
    {
        return 2*Math.PI*radius;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius = sc.nextInt();


        s8 s = new s8(radius);
        System.out.println("radius :"+s.radius);
        System.out.println("area : "+s.area());
        System.out.println("parameter :"+s.perameter());
    }
}

/*

enter the radius:
5
radius :5
area : 78.53981633974483
parameter :31.41592653589793

*/