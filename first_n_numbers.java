import java.util.Scanner;

public class first_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n=sc.nextInt();
        System.out.println("First "+n+" natural nos are: ");
        for (int i=1;n>=i;i++)
        System.out.println(i);
    }
}
