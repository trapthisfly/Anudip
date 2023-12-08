// Create a class that calculates volums of all the three dimensional figures(cube, cuboidal, cylinder)
import java.util.*;
/**
 * prb
 */
public class prb {


  public static void main(String[] args) {
    Volume v = new Volume();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for cube, 2 for cuboidal, 3 for cylinder: ");
    int choice = sc.nextInt();

    if (choice == 1) {
      System.out.println("Enter the side of the cube: ");
      float side = sc.nextFloat();
      v.vol(side);
    }
    else if (choice == 2) {
      System.out.println("Enter the length, breadth and height of the cuboidal separated by space: ");
      float length = sc.nextFloat();
      float breadth =sc.nextFloat();
      float height = sc.nextFloat();
      v.vol(length, breadth, height);
    }
    else if (choice == 3) {
      System.out.println("Enter the radius and height of the cuboidal separated by space: ");
      float radius = sc.nextFloat();
      float height = sc.nextFloat();
      v.vol(radius, height);
    }

    sc.close();
  }
}
/**
 * Volume 
 */
public class Volume  {
  double volume;
  void vol(float side){
    volume = side*side*side;
    System.out.println("Volume of cube with side "+side+" is : "+volume);
  }
  void vol(float radius, float height){
    volume = 3.14 * radius * radius * height;
    System.out.println("Volume of cylinder with radius "+radius+" and height "+height+" is : "+volume);
  }
  void vol(float length, float breadth, float height){
    volume = length * breadth * height;
    System.out.println("Volume of cuboidal with length "+length+", breadth "+breadth+" and height "+height+" is : "+volume);
  }
}
