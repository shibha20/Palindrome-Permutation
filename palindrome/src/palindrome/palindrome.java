package palindrome;

import java.util.HashMap;

public class palindrome {

	public static void main(String[] args) {
		
		boolean result = isPalindrome("");
		System.out.print(result);

	}

	public static boolean isPalindrome(String s) {
		
		char[] ch = s.toCharArray();
		int count = 0;
		HashMap <Character, Integer> hm = new HashMap <Character, Integer> ();
		
		
		for (int i=0 ; i < ch.length; i++) {
			if (ch[i] != ' ') {
				if (hm.containsKey(ch[i])) {
					hm.put(ch[i], hm.get(ch[i])+1)  ;
				}
				else {
					hm.put(ch[i], 1);
				}	
			}
			
		}
		
		for (int i : hm.values()) {
			if (i % 2 ==1) {
				count++; 
			}
		}
		
		System.out.println(count);
		if (count >1) {
			return false;
		}
		else {
			return true;
		}		
	}
	
	
}
