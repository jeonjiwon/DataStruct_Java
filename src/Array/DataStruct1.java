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
        
        
//		int[] answer = {};  //배열은 크기 고정 
//    	int max_count = 0; //max인 인덱스 갯수 
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
//            	max_count ++; //max 인 갯수 
//                System.out.println("최대값 인덱스 : " + i);
//
//            }
//        }
//        System.out.println("최대값 갯수 : " + max_count);
//
//    	answer = new int[max_count];        
//        for(int i = 0; i < arr.length; i++){
//        	 if(max == arr[i]) {
//                 System.out.println("최대값 인덱스2 : " + i);
//                 System.out.println("최대값 인덱스index : " + index);
//             	 answer[index] = i;
//             	 index++;
//             }
//
//        }
		
	}

}
