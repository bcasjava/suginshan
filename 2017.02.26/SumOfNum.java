
public class SumOfNum {
	public int sumNum(int num){
        int result = 0;
        result = (num/10) + (num%10);   
        return result;
}
// to validate the number length
public int validateResult(int num){
        int result = 0;         
        if(num < 9){
                result = num;                   
        }else{
                result = sumNum(num);
                result = validateResult(result);                        
        }
        return result;
}
// main method
public static void main(String[] args) {
      int number = 111111;       
		
		
        SumOfNum sumOfNum = new SumOfNum();
        int value = sumOfNum.validateResult(number);            
        System.out.println("SUM OF " + number + " IS : "+  value);              
}

}
