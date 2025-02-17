import java.util.*;

public class rotate_k_times_array {
    static void reverse(int arr[],int i,int j){
        while(j>i){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
            i++;
            j--;
        }
    }
    static void r(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void rotate(int arr[],int k){
        int n=arr.length;
    for (int i=n-k;n>i;i++){
        System.out.print(arr[i]+" ");
    }
    for (int i=0;i<n-k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;n>i;i++){
            arr[i]=sc.nextInt();
        }
        k=k%n;
        r(arr,k);
// rotate(arr, k);
r(arr,k);
for (int x: arr){
    System.out.print(x+" ");
}
    }
}
