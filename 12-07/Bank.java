import java.util.Scanner;

/**
 * Bank
 */
public class Bank {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount();
    sa.inputdetails(); // Parent method
    // sa.displaydetails(); // parent method
    sa.inputbalance();
    // sa.displaybalance();
    // sa.displayinfo();
    // sa.deposit();
    // sa.withdraw();
    while (1==1){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your choice:");
      System.out.println("1. Display details:");
      System.out.println("2. Display balance:");
      System.out.println("3. Deposit:");
      System.out.println("4. Withdraw:");
      System.out.println("5. Exit");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          sa.displayinfo();
          break;
        case 2:
          sa.displaybalance();
          break;
        case 3:
          sa.deposit();
          break;
        case 4:
          sa.withdraw();
          break;
        case 5:
          return;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }
  }
}
/**
 * Account 
 */
public class Account  {

  long ac_no;
  String ac_holder_name, address;
  void inputdetails(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the account number: ");
    ac_no = sc.nextLong(); 
    sc.nextLine();
    System.out.print("Enter account holder name: ");
    ac_holder_name = sc.nextLine();
    System.out.print("Enter account holder address: ");
    address = sc.nextLine();
  }
  void displaydetails(){
    System.out.println("\n");
    System.out.println("Account number : "+ac_no);
    System.out.println("Account Holder Name : "+ac_holder_name);
    System.out.println("Account Holder address : "+address);
    System.out.println("\n");
  }
}
/**
 * SavingsAccount extends Account
 */
public class SavingsAccount extends Account {

  double balance;
  static String ac_type = "Savings";
  void inputbalance(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter current account balance : ");
    this.balance = sc.nextFloat();
  }
  void displayinfo(){
    System.out.println("\n");
    System.out.println("Account number : "+ac_no);
    System.out.println("Account Holder Name : "+ac_holder_name);
    System.out.println("Account Holder address : "+address);
    System.out.println("Account Type : "+ac_type);
    System.out.println("\n");
  }
  void displaybalance(){
    System.out.println("\n");
    System.out.println("Account Balance : "+balance);
    System.out.println("\n");
  }
  void withdraw(){
    System.out.println("\n");
    Scanner sc = new Scanner(System.in );
    System.out.print("Enter the amount you want to withdraw: ");
    float amount = sc.nextFloat();
    if ((this.balance - amount) < 1000){
      System.out.println("Transaction not possible.");
    }
    else {
      System.out.println("Transaction Successful.");
      this.balance -= amount;
    }
    System.out.println("\n");
  }
  void deposit(){
    System.out.println("\n");
    Scanner sc = new Scanner(System.in );
    System.out.print("Enter the amount you want to deposit: ");
    float amount = sc.nextFloat();
    this.balance += amount;
    System.out.println("\n");
  }
}
