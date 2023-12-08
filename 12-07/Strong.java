/*
 * 1.  Write a program to check whether a number is a Strong number 
 * or not. Strong number is a special number whose sum of factorial 
 * of digits is equal to the original number. For example: 145 is a 
 * strong number. Since, 1! + 4! + 5! = 145
 */

import java.util.Scanner;

/**
 * Strong
 */
public class Strong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers separated by space: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    Factorial fc = new Factorial();
    int fac1 = fc.fact(num1);
    int fac2 = fc.fact(num2);
    int fac3 = fc.fact(num3);
    int fact_total = fac1 + fac2 + fac3;
    sc.close();
  }
}

/**
 * Factorial 
 */
public class Factorial  {

  int fact(int num){
    int fact_num = 1;
    for (int i = 2; i <= num; i++){
      fact_num *= i;
    }
    return fact_num;
  }
}
