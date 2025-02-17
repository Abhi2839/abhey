import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String ans;
    ans=(n%3==0)?"Multiple of 3":"Non Multiple of 3";
System.out.println(ans);    
}
}
