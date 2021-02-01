//Time Complexity O(N)
//Space Complexity O(1)

import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
		int leftIdx = 0;
		int rightIdx = str.length() -1;
		while(leftIdx<=rightIdx){
			if(str.charAt(leftIdx) == str.charAt(rightIdx)){
				leftIdx++;
				rightIdx--;
			}
			else{
				return false;
			}
		}
		return true;
	
  }
}
