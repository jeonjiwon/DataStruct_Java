package Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DataStruct_Map1 {

	public static void main(String[] args) {
		
		int[] nums = {3,3,3,2,2,2};
		int answer = 0;
		
		int select_nums = nums.length / 2;
		HashMap<Integer, Integer> map = new HashMap<>();
		

		//key - value
		
		for(int i = 0 ; i < nums.length; i ++) {
			map.put(nums[i], i);
		}
		int total = map.size();
		
		
		//total 중에서 select_nums 를 고르는 경우의 수 
		if(total < select_nums) answer = total;
		else answer = select_nums;

		System.out.println(total + "|" + select_nums + "그래서 : " + answer);
	}
}
