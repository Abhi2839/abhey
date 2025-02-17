import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;n-i>=j;j++){
                System.out.print(" ");}
for (int k=1;2*i-1>=k;k++)
System.out.print("*");
            System.out.println();
}
    }
}
