package NumPrograms;
import java.util.Scanner;
public class REMOVINGWHITESPACE {
   private static Scanner sc;
   public static void main(String[] args) {
   
      sc= new Scanner(System.in);
      
      System.out.println("Enter String to Remove White Spaces = hello world ");
      String str1 = sc.nextLine();
      
      System.out.println("Original String = " + str1);
      
      
      String str2 = str1.replaceAll("\\s", "");
      System.out.println("Final String = " + str2);
      
      
      
  }
}
