package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

class MyData{
   int value;
   public MyData(int value) {
      this.value = value;
   }
   static MyData create(int v) {
      return new MyData(v);
   }
   
   
   //출력 
   @Override
   public String toString() {
      return ""+value;
   }
   
   //contains 등 
   @Override
   public boolean equals(Object o) {
      if(this == o) return true;
      if(o == null || getClass() != o.getClass()) return false;
      MyData myData = (MyData) o;
      return value == myData.value;
   }
   
   @Override
   public int hashCode() {
      return Objects.hash(value);
   }
   
}

public class Datastruct {
   public static void main(String[] args) {
//      int[] arr = new int[5];   //array
//      
//      arr[0] = 1;
//      arr[arr.length-1] = 3;
//      
//      String[] strs = new String[5];
//      boolean[] bools = new boolean[5];
//
//      System.out.println(arr.length);
//      System.out.println(Arrays.toString(arr));
      
      
//      LinkedList<Integer> list = new LinkedList<>();
//      //primitive type은 허용안됨 reference 타입만 가능 
//      
//      list.add(1);
//      list.add(2);      
//      list.add(3);
//      
//      list.add(1, 5);  //index / element 
//      list.remove(2);  //index 
//      
//      System.out.println(list);
//      System.out.println(list.contains(Integer.valueOf(6)));  //해당값이 있는지 
      
      

//      LinkedList<MyData> list = new LinkedList<>();
//      list.add(MyData.create(1));
//      list.add(MyData.create(2));
//      list.add(MyData.create(3));
//      System.out.println(list.indexOf(MyData.create(3)));
//      System.out.println(list.contains(MyData.create(2)));
//      System.out.println(list.isEmpty());
//      System.out.println(list.size());
      
      

//      List<MyData> list = new ArrayList<>(2);  //안의 숫자는 initalCapacity
//      List<MyData> list2 = new Vector<>();
      //벡터형인데 리스트 형식으로 도 가능 -> 다형성 
      
      
      //리스트를 배열로 변환 
      List<Integer> alist = new LinkedList<>();
      alist.add(2);
      alist.add(6);
      int[] answer = alist.stream().mapToInt(Integer::intValue).toArray();
      
      
      int max = Arrays.stream(answer).max().getAsInt();
      
      
      System.out.println(max);
      
      
      
      
      
   }
   static void method1(List<MyData> list) {
      System.out.println(list.isEmpty());
      System.out.println(list.size());
      System.out.println(list.get(2));
      
   }

}