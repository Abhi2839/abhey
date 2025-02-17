import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            System.out.println(n);
             n+=n;
        }
        while(100>n);
    }
}
