//Time Complexity - O(N)
//Space complexity - O(N) -> call stack memory

import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    return p1(str,0);
  }
	public static boolean p1(String str, int i){	
		int j = str.length() - 1 - i;
		if(i>=j)
			return true;
		
		if(str.charAt(i)==str.charAt(j) && p1(str, i+1))
			return true;
		return false;
	}
}
