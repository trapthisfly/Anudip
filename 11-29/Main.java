import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int rev = 0, num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int num = sc.nextInt();
    while (num != 0) {
      rev = (rev * 10) + (num % 10);
      num /= 10;
    }
    System.out.println(rev);
  }

}

  
