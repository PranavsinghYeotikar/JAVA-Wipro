import java.util.Scanner;

public class Box{
    double height;
    double width;
    double depth;

    Box(double  height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println("Box created with height: " + height + ", width: " + width + ", depth: " + depth);
        System.out.println("Volume of the box: " + (height*width*depth));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double h = sc.nextDouble();
        System.out.println("Enter your width: ");
        double w = sc.nextDouble();
        System.out.println("Enter your depth: ");
        double d = sc.nextDouble();
        Box box = new Box(h, w, d);
    }
}