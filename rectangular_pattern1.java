import java.util.Scanner;
public class rectangular_pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=0;a>i;i++){
            for (int j=0;b>j;j++){
                if (i==0 || i==a-1 ||j==0 ||j==b-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
