import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,y=n;
        while(n>0)
        {
            int b=n%10;
            rev=rev*10+b;
            n/=10;

        }
        System.out.println("Reverse of "+y+ " is: "+rev);
    }
}
