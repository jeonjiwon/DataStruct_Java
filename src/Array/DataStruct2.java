package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStruct2 {
	public static void main(String[] args) {
//		���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�.
//		1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ� ��� true��, �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.
		
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
//            Collections.sort(list);  //���� 
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
        for(int i=0; i<arr.length; i++) answer[i] = i+1;  //������ ��������  ���ڰ��� ���� 
        Arrays.sort(arr);  // O(nlogn)
        
        check = Arrays.equals(answer, arr); 
        
        
		
		
        System.out.println("�������  : " + check  );
        
	}

}
