import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int number = sc.nextInt();
    NumReverse r = new NumReverse();

    System.out.print("Reverse number is: ");
    System.out.println(r.reverse(number));

    System.out.print("Total digit are: ");
    System.out.println(r.digit(number));
  }
}
public class NumReverse {

  public int reverse(int num){
    int rev = 0;
    int number = num;
    while(number != 0){
      rev = (rev*10)+(number%10);
      number /= 10;
    }
    return (num < 0) ? rev : (-1*rev);
  }
  public int digit(int num){
    int number = num;
    int digit = 0;
    while (number !=0){
      number /= 10;
      digit++;
    }
    return (digit);
  }
}
