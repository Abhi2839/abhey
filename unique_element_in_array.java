import java.util.Arrays;
import java.util.Scanner;

public class unique_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;n>i;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;n>i;i++){
            for (int j=i+1;n>j;j++){
                if (arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0;n>i;i++){
            if (arr[i]!=-1)
            {
                ans=arr[i];
            }
        }
        System.out.println("Unique element is "+ans);
    }
}
