import java.util.*;

public class nearest_sqrt_val {
    public static int nearest_val(int n){
        int  y = n, ans = 0;
        while(ans*ans <=y){
ans++;
        }
        return ans-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Square root of "+n+" is "+nearest_val(n));
    }
}
