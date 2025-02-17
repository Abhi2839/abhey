import java.util.Scanner;
public class sort_zeros_ones{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int l=0;
        int r=n-1;
        while (r>l) {
            if (arr[l]==1 && arr[r]==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
    
           if(arr[l]==0) l++;
           if (arr[r]==1) r--;
        }
for(int x:arr)
System.out.print(x+" ");
    }
}