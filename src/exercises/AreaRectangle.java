package exercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main (String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the rectangle's length (in feet)? ");
        Double length = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the rectangle's width (in feet)? ");
        Double width = input2.nextDouble();
        Double areaRect = length * width;
        System.out.println("The area of your rectangle is " + areaRect + " square feet.");
    }

}
