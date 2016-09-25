
/**
 * Preforms operations to calculate the area and circumference for a given circle object from the
 * CircleTester class
 * @author Lew Piper III
 * @version 9/25/2016
 */
import java.lang.Math;
public class Circle
{
   //Instance Variables
   private String color = " ";
   private double radius = 0;
   private double area = 0;
   private double circumference = 0;
   
   //Constants
   static final double PI = 3.1415926;
   
   //Copy the contents from the CircleTester class into this class and the associated instance variables here
   public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;
       area = PI * Math.pow(radius,2);       
       circumference = 2 * PI * radius;
    }
    
   //Calculate the area based on the given passed in radius
   public double getArea() {
       return area;
   }
   
   //Calculate the circumference based on the given passed in radius
   public double getCircumference() {
       return circumference;
   }
   
   //Return the color
   public String getColor() {
       return color;
   }
}
