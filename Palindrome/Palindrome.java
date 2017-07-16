package palindrome;

public class Palindrome {
	public static String removeStuffs(String str) {
		String a;
		a = str.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
		return a;
	}

	public void print(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public void palindromeCheck(String strn) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(strn);
		String toArr = sb.reverse().toString();
		char[] arrayforw = strn.toCharArray();
		char[] arraybackw = toArr.toCharArray();

		print(arrayforw);
		System.out.println();
		print(arraybackw);
		System.out.println();

		for (int i = 0; i < arraybackw.length; i++) {
			if (arraybackw[i] != arrayforw[i]) {
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println(strn + " is Palindrome!!!");
		} else {
			System.out.println(strn + " is not a Palindrome!!!");
		}
	}

}
