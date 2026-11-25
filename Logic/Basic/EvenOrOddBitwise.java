import java.util.Scanner;

public class EvenOrOddBitwise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value to check for Even or Odd");
		int n = sc.nextInt();
		if((n&1)==0){
		System.out.println("Entered value is Even");
		}
		else{
		System.out.println("Entered value is Odd");
		}
	}
}