public class prb {
  public static void main(String[] args) {
    int num = 0, i = 0;
    while (num != -2500){
      i += 1;
      if (i % 2 != 0){
        num = i*i;
        System.out.print(num);
      }
      else{
        num = (-1)*i*i;
        System.out.print(num);
      }
      System.out.print(" ");
    }
  }
}
