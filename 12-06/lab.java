// 3. Write a program to declare two variables num and n and take an input during compilation time to check whether the nth bit of the given number is set (1) or not(0)
import java.util.Scanner;


/**
 * lab
 */
public class lab {
  public static void main(String[] args) {
    SetBit sb = new SetBit();
    sb.input();
    sb.bit();
    sb.showBit();
  }
}
/**
 * SetBit
 */
public class SetBit {
  int num, n, bit;
  void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: num = ");
    this.num = sc.nextInt();
    System.out.print("Input nth bit number: n = ");
    this.n = sc.nextInt();
    sc.close();
  }
  void bit(){
    this.bit = (num >> n) & 1;
  }
  void showBit(){
    System.out.println(n+" bit of "+num+" is Set("+bit+")");
  }
}

