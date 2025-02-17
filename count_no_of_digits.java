import java.util.Scanner;

public class count_no_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0,b=n;
        while(b>0){
            cnt++;
            b/=10;
        }
        System.out.println("Number of digits in "+n+" is "+cnt);

    }
}
