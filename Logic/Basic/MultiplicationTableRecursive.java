import java.util.Scanner;

public class MultiplicationTableRecursive{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for printing Multiplication Table");
	int n = sc.nextInt();
	int i = 0;
	while(i!=10){
	i = i+1;
	System.out.println(n+" x "+i+" = "+n*i);
		}	
	}
}