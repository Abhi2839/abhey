import java.util.Scanner;

public class second_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}
int max=Integer.MIN_VALUE;
int second_max=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if (arr[i]>max)
max=arr[i];
}
System.out.println("Maximum element "+max);
for(int i=0;n>i;i++){
    if (arr[i]>second_max && arr[i]!=max){
        second_max=arr[i];
    }
}
System.out.println("Second max element: "+second_max);
        
    }
}
