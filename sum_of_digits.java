import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        int n,sum=0,x;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=n;
        while(n>0)
    {
            int b=n%10;
            sum+=b;
            n=n/10;
    }
    System.out.println("Sum of digits in "+ x+" is:"+sum);
}
}
