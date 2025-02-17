import java.util.Scanner;

public class sum_of_all_elements_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int arr[]=new int [n];
for (int i=0;n>i;i++)
{
    int b=sc.nextInt();
    arr[i]=b;
    sum+=arr[i];
}
System.out.println("Sum of all elements in array is: "+sum);
    }
}
