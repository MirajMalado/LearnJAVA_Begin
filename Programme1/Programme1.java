import java.util.Scanner;
 
class Programme1 {
 
   public static void main( String[] args ) {
      int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Veuillez introduire deux nombres ");
      a = s.nextInt();
      b = s.nextInt();
      c = a + b;
      System.out.println( "La somme est: " + c );
   }
 
}