import java.util.Scanner;

public class reverse_an_array{
static void print_array(int arr[])
{
    for (int i=0;arr.length>i;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int [n];
    for (int i=0;n>i;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Original array: ");
    print_array(arr);
    int i=0;
    int j=arr.length-1;
    while (i<j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println("Reversed array: ");
    print_array(arr);
    }
}