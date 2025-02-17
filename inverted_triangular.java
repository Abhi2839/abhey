import java.util.Scanner;

public class inverted_triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i =0;n>i;i++){
            for (int j =0;j<=(n-1-i);j++){
        System.out.print("*");
            }
System.out.println();
    }
}
}
