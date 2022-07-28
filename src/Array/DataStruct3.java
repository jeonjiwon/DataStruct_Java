package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.parser.Parser;

public class DataStruct3 {

	public static void main(String[] args) {
		long n = 135277;
		int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

//        String s = String.valueOf(n);
//        for(int i=0; i<s.length(); i++) {
//        	list.add(Character.getNumericValue(s.charAt(s.length() - i - 1)));
//        }
//        
        
        while(n > 0) {
        	list.add((int) (n % 10));
        	n /= 10;
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
//        
//        answer = new int[list.size()];
//        for(int i=0; i<list.size(); i++) {
//        	answer[i] = list.get(i);
//        }

    	System.out.println(Arrays.toString(answer));
        
	}
}
