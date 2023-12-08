import java.util.Scanner;

/**
 * Inface
 */
public class Inface {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("----------Select the figure-------------");
    System.out.println("1. Triangle");
    System.out.println("2. Circle");
    System.out.println("3. Rectangle");
    System.out.println("4. Square");
    System.out.println("4. Exit");
    int ch = sc.nextInt();
    switch (ch) {
      case 1:
        Triangle t = new Triangle();
        break;
      case 2:
        
        break;
      case 3:
        
        break;
      case 4:
        
        break;

      default:
        break;
    }
  }
}

interface TwoFigure
{
  float PI = 3.14;
  void Perimeter();
  void Area();
}

/**
 * Triangle implements TwoFigure
 */
public class Triangle implements TwoFigure {

  
}

/**
 * Circle implements TwoFigure
 */
public class Circle implements TwoFigure {

  
}

/**
 * Square implements TwoFigure
 */
public class Square implements TwoFigure {

  
}
