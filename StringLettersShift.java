import java.lang.*;
import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    
		StringBuffer newStr = new StringBuffer();
		
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			int k = key%26;
			int temp = k+ (int) ch;
			
			if(temp<=122)
				newStr.append((char) temp);
			else{
				temp = (temp%122) +96;
				newStr.append((char) temp);
			}
		}
		
		return newStr.toString();
  }
}
	
	
