import java.util.*;

public class sort_in_descending_order{    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            arr.add(b);
        }
        Collections.sort(arr);
        // System.out.println("enter the index you want to swap");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
// System.out.print(arr+" ");
// //temp ch a idx di val
// // b index 
//         int temp=arr.get(a);
//         arr.set(a,arr.get(b));
//         arr.set(b,temp);
  Collections.sort(arr,Collections.reverseOrder());
        System.out.print(arr+" ");
    }
}