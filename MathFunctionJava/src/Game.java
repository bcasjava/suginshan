import java.util.Scanner;
public class Game {

public static void main(String[] args) {
		
		System.out.println("Enter number between 0-10 : ");
		Scanner scan = new Scanner(System.in);
		int userIn = scan.nextInt();
		
		
		int ans = (int) (Math.random()*10);
		//System.out.println("random num : "+ans);
		
		if(userIn==ans){
			System.out.println(" u r winner");
			
		}
		else{
			System.out.println(" sorry u r lost \nlucky number is : "+ans);
		}
	}

}
