package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStruct5 {

	public static void main(String[] args) {
		String answer = "";
		String s = "TRY  HELLO WORLD ";
		int index = 0;
		for(int i=0; i<s.length(); i++) {
			String text = String.valueOf(s.charAt(i));
			if(text.trim().isEmpty()) {  //�����϶� 
				index = 0;
		    	System.out.println("���� ");
			}
			else {
				if(index % 2 == 0) {  //¦����°�� �빮�� 
			    	System.out.println(text + "|" + index);
					text = text.toUpperCase();
				}
				else {
			    	System.out.println(text + "|" + index);
					text = text.toLowerCase();
				}
				index ++;
			}
			answer += text;
		}
		
    	System.out.println(answer);

	}
}
