import java.util.Scanner;

public class first_repeating_element {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;n>i;i++){
        arr[i]=sc.nextInt();
    }
    int ans=-1;
    for (int i=0;n>i;i++){
        for (int j=i+1;n>j;j++){
            if (arr[i]==arr[j]) {
        ans=arr[i];
        break;
            }
        }
    }
    if (ans!=-1)
    System.out.println("First repeated element is "+ans);
    else
    System.out.println("No repeated element found");
    }
}
