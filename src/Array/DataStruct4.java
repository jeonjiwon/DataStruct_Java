package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStruct4 {
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        if(list.size() > 0) {
            Collections.sort(list);  //오름차순 정렬  
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        else {
        	answer = new int[1];
        	answer[0] = -1;      	
        }
        
        
        for(int i = 0 ; i< answer.length ; i++) {
            System.out.println(answer[i]);	
        }
	}

}
