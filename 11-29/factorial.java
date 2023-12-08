import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    if (number < 0){
      System.out.println("Negative factorial not possible");
    }
    else if (number == 0){
      System.out.println("Factorial of 0 is 1");
    }
    else {
      long fact = 1;
      for (int i = 1; i <= number; i++){
        fact *= i;
      }
      System.out.println("Factorial of "+number+" is "+fact);
    }
  }
}
