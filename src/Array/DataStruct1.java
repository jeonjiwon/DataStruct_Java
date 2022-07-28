package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.naming.StringRefAddr;

public class DataStruct1 {
	public static int[] Solution(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		return IntStream.range(0, arr.length).filter(i -> arr[i] == max).toArray();
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 4, 5, 6, 2, 1};
		int[] answer = {};
		
		
		answer = Solution(arr);

        System.out.println(Arrays.toString(answer));
        
        
//		int[] answer = {};  //�迭�� ũ�� ���� 
//    	int max_count = 0; //max�� �ε��� ���� 
//    	int index = 0;
//
//        int max = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max) max = arr[i];
//        }
//        
//        
//
//        System.out.println("max : " + max);
//        for(int i = 0; i < arr.length; i++){
//            if(max == arr[i]) {
//            	max_count ++; //max �� ���� 
//                System.out.println("�ִ밪 �ε��� : " + i);
//
//            }
//        }
//        System.out.println("�ִ밪 ���� : " + max_count);
//
//    	answer = new int[max_count];        
//        for(int i = 0; i < arr.length; i++){
//        	 if(max == arr[i]) {
//                 System.out.println("�ִ밪 �ε���2 : " + i);
//                 System.out.println("�ִ밪 �ε���index : " + index);
//             	 answer[index] = i;
//             	 index++;
//             }
//
//        }
		
	}

}
