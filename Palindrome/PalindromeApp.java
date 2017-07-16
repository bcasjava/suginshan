package palindrome;

public class PalindromeApp {

	public static void main(String[] args) {
		String word = "Madam";
		Palindrome plm = new Palindrome();
		String stn = plm.removeStuffs(word);
		System.out.println(word);
		System.out.println(stn);
		plm.palindromeCheck(stn);
	}
}
