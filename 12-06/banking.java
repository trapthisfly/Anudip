/**
 * banking
 */
public class banking {

  public static void main(String[] args) {
    Bank bk = new Bank(10000);
    double bal = bk.withdrawalAmount(3000);
    System.out.print("Blance = "+bal);
    bal = bk.depositAmount(5000);
  }
}

/**
 * Bank 
 */
public class Bank  {
  double amount;
  Bank(double amount){
    this.amount = amount;
  }
  double withdrawalAmount(double amount){
    int val = this.amount > amount ? 1 : 0; 
    if (val){
      System.out.println("withdraw successful");
      return (this.amount - amount);
    }
    else{
      System.out.println("withdraw unsuccessful");
      return this.amount;
    }
  }
  double depositAmount(double amount){
    this.amount += amount;
    return this.amount;
  }
}
