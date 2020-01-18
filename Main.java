import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  int[] arr={1,2,3,5,6,88,88};
  HashMap<Integer,Integer> hm=new HashMap<>();
  
  for(int item:arr){
    if(hm.containsKey(item)){
      System.out.println(item);
      break;
      }
      hm.put(item, 0);
  }


  }
}