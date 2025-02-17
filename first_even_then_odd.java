import java.util.Scanner;

public class first_even_then_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        while(r>l){
            if (arr[l]%2!=0 && arr[r]%2==0)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        l++;
        r--;
        }
        for (int x:arr)
        System.out.print(x+" ");
    }
}
