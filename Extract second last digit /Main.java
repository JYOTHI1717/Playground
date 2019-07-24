import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int a = n%100;
      int b = a/10;
      System.out.println(b);
      
	}
}