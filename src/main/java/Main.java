
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    Hesap_Makinesi hesap_makinesi = new Hesap_Makinesi();
    int choice,i=1;
    
    while(i>0){
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Exit");
      System.out.println("Choose a number:");
      choice = scanner.nextInt();
      if(choice == 5){
        System.out.println("Exiting...");
        System.exit(0);
      }
      System.out.println("Enter two numbers:");
      float a = scanner.nextFloat();
      float b = scanner.nextFloat();
      switch(choice){
       case 1:hesap_makinesi.topla(a,b);break;
       case 2:hesap_makinesi.cikar(a,b);break;
       case 3:hesap_makinesi.carp(a,b);break;
       case 4:hesap_makinesi.bol(a,b);break;
       default:System.out.println("Invalid number");
      } 
      i++;
    }
  }
}
