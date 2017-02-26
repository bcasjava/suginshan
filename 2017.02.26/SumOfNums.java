import java.util.Scanner;
public class SumOfNums {
	//public static void main(String []args){
	public int sumNum(int num){
		int result=0;
		result = (num/10) + (num%10);   
        return result;
	}
	// to validate the number length
	public int validateResult(int num){
	        int result = 0;         
	        if(num <= 9){
	                result = num;                   
	        }else{
	                result = sumNum(num);
	                result = validateResult(result);                        
	        }
	        return result;
	}
	// main method
    public static void main(String[] args) {
    	
    	//String cal;
    	int addnum;
    	System.out.println("Enter the number : ");
    	Scanner in = new Scanner(System.in);
    	addnum = in.nextInt();
    	
    	int number = addnum;            
            SumOfNums sumOfNum = new SumOfNums();
            int value = sumOfNum.validateResult(number);            
            System.out.println("SUM OF " + number + " IS : "+  value);              
    }
}
