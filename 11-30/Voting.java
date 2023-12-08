import java.util.Scanner;
public class Voting {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    Eligible vt = new Eligible();
    vt.check(age);
  }
}
public class Eligible {

  int eligible_age = 18;

  public void check(int age){
    if (age >= eligible_age){
      System.out.println("You are eligible for voting");
    }
    else {
      System.out.println("You are not eligible for voting");
    }
  }
}
