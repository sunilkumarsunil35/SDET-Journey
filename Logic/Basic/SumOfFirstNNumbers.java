import java.util.Scanner;
public class SumOfFirstNNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to identify the sum until the value");
		int n = sc.nextInt();
		System.out.println("Sum of Natural number until n is: "+ (n*(n+1))/2 );
	}
}