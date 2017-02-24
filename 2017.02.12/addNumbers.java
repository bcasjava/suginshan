public class addNumbers{
	int total;

	
	public addNumbers(int a, int b){
		total=a+b;
			//this constructor has 2 parameter, a,b.
			System.out.println("addition of " +a+ " and " + b+"   is : " +total);
		}
	public static void main(String[]args){
		
		addNumbers AaddNumbers = new addNumbers(10,20);
	}	
	
}