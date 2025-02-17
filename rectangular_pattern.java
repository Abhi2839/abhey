import java.util.Scanner;
public class rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=0;a>i;i++){
            for (int j=0;b>j;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
