import java.util.Scanner;

public class total_pair_sum_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key,count=0;
        key=sc.nextInt();
        for(int i=0;arr.length>i;i++){
            for(int j=i+1;arr.length>j;j++){
                if (arr[i]+arr[j]==key)
                count++;
            }
        }
        System.out.println("Total numbers of pairs: "+count);
    }
}
