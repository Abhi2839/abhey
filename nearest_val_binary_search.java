import java.util.Scanner;

public class nearest_val_binary_search{
    static int near(int n){
        int ans=-1,low=0,high=n;
        while(low<=high){
            int mid=(low+high)/2;
           int val=mid*mid;
            if(mid==n)
            return mid;
            else if (val>n){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;    
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(near(n));
    }
}