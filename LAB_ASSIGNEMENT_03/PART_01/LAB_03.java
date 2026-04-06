import java.util.Scanner;

class Shape {
    double area;

    Shape(double side) {
        area = side * side;
        System.out.println("Area of Sq: " + area);
    }

    Shape(double len, double breadth) {
        area = len * breadth;
        System.out.println("Area of Rect: " + area);
    }

    Shape(double radius, boolean isCircle) {
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void area(int side) {
        System.out.println("Sq area: " + (side * side));
    }

    void area(int len, int breadth) {
        System.out.println("Rect area: " + (len * breadth));
    }

    void area(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

public class LAB_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter side:");
                int s = sc.nextInt();
                Shape sq = new Shape(s);
                sq.area(s);
                break;

            case 2:
                System.out.println("Enter length and breadth:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                Shape rect = new Shape(l, b);
                rect.area(l, b);
                break;

            case 3:
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                Shape cir = new Shape(r, true);
                cir.area(r);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
