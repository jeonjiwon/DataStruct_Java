package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStruct2 {
	public static void main(String[] args) {
//		길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
//		1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
		
		int[] arr = {4, 1, 3, 2};
////		int[] arr = {4, 1, 3};
//        boolean answer = true;
//        int list_max = 0;
//       
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int i=0; i<arr.length; i++){
//        	list.add(arr[i]);
//        	if(arr[i] > list_max) list_max = arr[i];
//        }
//        if(list_max == list.size()) {
//            Collections.sort(list);  //정렬 
//            
//            for(int i=0 ; i<list.size(); i++) {
//            	if(i != 0) {
//            		if(list.get(i-1) + 1 != list.get(i)) {
//            			answer = false;
//            		}       			
//            	}
//            }
//        }
//        else {
//        	answer = false;
//        }
//        
        boolean check;
        int[] answer = new int[arr.length];  
        for(int i=0; i<arr.length; i++) answer[i] = i+1;  //정답을 만들어놓고  인자값과 비교함 
        Arrays.sort(arr);  // O(nlogn)
        
        check = Arrays.equals(answer, arr); 
        
        
		
		
        System.out.println("결과값은  : " + check  );
        
	}

}
