import java.util.Scanner;
class addNumbers{
	public static void main(String []args){
		int a,b,tot;
		System.out.println("Enter two numbers to Add :");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		tot =a+b;
		System.out.println("addition of " + a+ " and " + b+"   is : " +tot);
		
	}	
}