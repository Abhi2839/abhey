import java.util.*;
public class multidimensional_array_list {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
    ArrayList<Integer> row1=new ArrayList<>();
    row1.add(1);
    row1.add(2);
    row1.add(3);
    ArrayList<Integer>arr2=new ArrayList<>();
    arr2.add(4);
    arr2.add(5);
    arr2.add(9);
    ArrayList<Integer>arr3=new ArrayList<>();
    arr3.add(6);
    arr3.add(7);
    arr3.add(8);
    arr.add(row1);
    System.out.println(arr+" ");
    arr.add(arr2);
    System.out.println(arr+" ");
        arr.add(arr3);
        System.out.println(arr+" ");
        // to print list by list
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer>currlist=arr.get(i);
            for (int j=0;currlist.size()>j;j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println("");
        }
}
}
