
/**
 * Allows for user input of a color and radius. 
 * 
 * @author Lew Piper III
 * @version 9/25/2016
 */

//Import statement for the scanner
import java.util.Scanner;

public class CircleTester
{
    //main() method
    public static void main(String[] args) {
        
        //Create scanner object
        Scanner in = new Scanner(System.in);
        
        //Prompt user for a radius an a color and store those
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter color: ");
        String color = in.next();
        
        //Pass radius and color to the circle class
        Circle circle = new Circle(radius,color);
        
        //Print and format the results from the circle class
        System.out.println(" ");
        System.out.println("For the " + circle.getColor() + " circle");
        System.out.println(String.format("Circumference is: %.2f", circle.getCircumference()));
        System.out.println(String.format("Area is: %.2f", circle.getArea())); 
        
    }
}
