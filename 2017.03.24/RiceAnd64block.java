package hipworks1;

import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;

public class RiceAnd64block {

	private static final byte[] ONE = null;

	public void printDetails() {
		System.out.println(
				"Chess board have - 64 blocks\nIn 1st block put - 1 rice\nIt will be doubled to next block\nIt's continues to 64 blocks");
		System.out.println("In 64th block - 9,223,372,036,854,775,808 rice (about 9=Quintillion)");
		System.out.println("10 rice - 1 gram \n10 x 1000 = 1kg rice \n50kg in 1 sack");
		System.out.println("64th block : ");
		// long gram = 9223372036854775808;
		System.out.println("		922,337,203,685,477,580     Grams");
		System.out.println("    		    922,337,203,685,477     Kilograms");
		System.out.println("        	     18,446,744,073,709     sacks");
		System.out.println(
				"\nHere u can find specific number of rice or sack, that will be in which block\nWhich one u wanna find? \n(R-for Rice and S for Sack) : ");
	}

	public void specify(String type, BigInteger cal) {
		BigInteger finalnum = new BigInteger("1");
		BigInteger sackricenum = new BigInteger("500000");
		if (type.equals("S")) {
			finalnum = cal.multiply(sackricenum);
			System.out.println("Sack Number is " + cal);
			System.out.println("Number of rice in " + cal + " sacks is " + finalnum);
			finding(finalnum);
		} else {
			finalnum=cal.divide(sackricenum);
			if(finalnum.equals(0)) {
				System.out.println("Your rice number "+cal+" is in the first sack");
			} else {
				System.out.println("Your rice number "+cal+" is in the sack number "+finalnum);
			}
			
			finding(cal);
		}

	}

	public void finding(BigInteger ricenum) {
		BigInteger find, j;
		find = new BigInteger("1");
		j = new BigInteger("2");
		for (int i = 1; i <= 64; i++) {
			find = find.multiply(j);
			if(ricenum.compareTo(find)<0){
				System.out.println("your number is in "+i+" th block");
				break;
			}
		}
	}

	public static void main(String[] args) {

		RiceAnd64block findrice = new RiceAnd64block();
		findrice.printDetails();
		Scanner in = new Scanner(System.in);
		String findtype = in.nextLine();
		System.out.println("Enter the number to find : ");
		BigInteger number = in.nextBigInteger();
		findrice.specify(findtype, number);
	}

}
