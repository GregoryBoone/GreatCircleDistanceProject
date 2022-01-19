import java.util.Scanner;

public class Exercise04_02 {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         GreatCircleDistance myObject = new GreatCircleDistance();

         System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
         double x1 = Math.toRadians(input.nextDouble());
         double y1 = Math.toRadians(input.nextDouble());

         System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
         double x2 = Math.toRadians(input.nextDouble());
         double y2 = Math.toRadians(input.nextDouble());

         System.out.println("The distance between the two points is " + myObject.getDistance(x1,y1,x2,y2) + " km");
     }
}
