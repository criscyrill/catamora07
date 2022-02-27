package digit.com;

public class DIGITS {

  public static void main(String[] args) {
  
         String str = "6126842345";
         boolean result = str.matches("[0-9]+");
         System.out.println("Original String : " + str);
         System.out.println("Does string contain only Digits? : " + result);
         
  }
}
