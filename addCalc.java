import java.util.Scanner;
 
class addCalc {
   public static void main(String args[]) {
      int x, y, z;
	  String answer = "Y";
      Scanner in = new Scanner(System.in);
	  
	  while (answer.equals ("Y")) || answer.equals ("y")) {
	  System.out.println("Enter two numbers to calculate their sum ");
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      System.out.println("Sum of entered numbers = "+z); 
	  System.out.println("Would you like to add some more? Y or N");
	  answer = in.next();
		}
	}
}