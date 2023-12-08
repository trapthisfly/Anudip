// 2. Maximum of two using ternary operator
import java.util.Scanner;

/**
 * Max
 */
public class Max {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers separated by space : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    sc.close();
    int max = num1 > num2? num1 : num2;
    System.out.println(max+" is of higher value.");
  }
}
