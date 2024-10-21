/*3. Develop the Figure application in given steps.
a. Design an interface IFig having the following methods:
i. public void calcAreaQ;
ii. public void calcVolumeO;
iii. It must also have the variable pi of the type double and having a value 3.1428.
b. Design an abstract class called Figure.
i. It must have three attributes r. a and v of data type double.
ii. It has abstract methods:
1. public abstract void dispAreaQ;
2. public abstract void dispVolumeO;

c. Design three classes Cone, Sphere and Cylinder. Each of them, should
extend the Figure class and implement the IFig interface.
d. Write a test program to demonstrate polymorphism

ClassName 	Attribute
Cone 		h, s of the type double
Sphere
Cylinder		 h of the type double



Figure Formulae

Cone
Area =(pi*r*s)+(pi*r*r)
Volume = (pi * r * r * h)/3

Sphere
Area = 4 * p * r * r
Volume = (4 * pj * r * r r) /3

Cylinder
Area =(2*pi*r*r)+(2*pi*r*h)
Volume = pi * r * r * h

*/

interface IFig {
    double pi = 3.1428; 

    void calcAreaQ();  
    void calcVolumeO(); 
}

abstract class Figure implements IFig {
    protected double r; 
    protected double a; 
    protected double v; 

    public abstract void dispAreaQ(); 
    public abstract void dispVolumeO();
}

class Cone extends Figure {
    private double h; 
    private double s; 

    public Cone(double radius, double height, double slantHeight) {
        this.r = radius;
        this.h = height;
        this.s = slantHeight;
    }

    @Override
    public void calcAreaQ() {
        a = (pi * r * s) + (pi * r * r);
    }

    @Override
    public void calcVolumeO() {
        v = (pi * r * r * h) / 3;
    }

    @Override
    public void dispAreaQ() {
        System.out.println("Cone Surface Area: " + a);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("Cone Volume: " + v);
    }
}

class Sphere extends Figure {
    public Sphere(double radius) {
        this.r = radius;
    }

    @Override
    public void calcAreaQ() {
        a = 4 * pi * r * r;
    }

    @Override
    public void calcVolumeO() {
        v = (4.0 / 3) * pi * r * r * r;
    }

    @Override
    public void dispAreaQ() {
        System.out.println("Sphere Surface Area: " + a);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("Sphere Volume: " + v);
    }
}

class Cylinder extends Figure {
    private double h; 
    public Cylinder(double radius, double height) {
        this.r = radius;
        this.h = height;
    }

    @Override
    public void calcAreaQ() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    @Override
    public void calcVolumeO() {
        v = pi * r * r * h;
    }

    @Override
    public void dispAreaQ() {
        System.out.println("Cylinder Surface Area: " + a);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("Cylinder Volume: " + v);
    }
}

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Cone(3, 5, 6); 
        figures[1] = new Sphere(4); 
        figures[2] = new Cylinder(3, 7); 

        for (Figure fig : figures) {
            fig.calcAreaQ(); 
            fig.calcVolumeO(); 
            fig.dispAreaQ();
            fig.dispVolumeO(); 
            System.out.println(); 
        }
    }
}


/*
 
Z:\java(sessional-1)\practical library\3>javac TestFigures.java

Z:\java(sessional-1)\practical library\3>java TestFigures
Cone Surface Area: 84.8556
Cone Volume: 47.141999999999996

Sphere Surface Area: 201.1392
Sphere Volume: 268.18559999999997

Cylinder Surface Area: 188.568
Cylinder Volume: 197.9964

 */
