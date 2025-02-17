
import java.util.*;

 public class pair_sum_in_arraylist {
//     public static boolean pair_sum(ArrayList<Integer>arr,int target){
//         // brute force approach
//         for (int i=0;arr.size()>i;i++){
//             for (int j=i+1;arr.size()>j;j++){
//                 if (arr.get(i)+arr.get(j)==target){
//                     return true;
//                 }
            
//             }
//         }
//         return false;
//     }
    // optimal approach using 2 pointer
    public static boolean pair_sum1 (ArrayList<Integer>arr,int target){
        int low=0;
        int high=arr.size()-1;
        while(high>low){
            int sum=arr.get(low)+arr.get(high);
            if (sum==target){
                return true;
            }
            
            if (sum<target){
            low++;}
            else{
            high--;
        }
    }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer>arr=new ArrayList<>();
        arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(7);
            arr.add(5);
            arr.add(4);
            arr.add(7);
            Collections.sort(arr);
    int target=6;
            System.out.println(pair_sum1(arr, target));

    }
}
