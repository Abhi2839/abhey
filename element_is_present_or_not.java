import java.util.Scanner;
public class element_is_present_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int arr[]=new int[n];
        // int key=sc.nextInt();
int freq[]=new int [100000000];
for (int i=0;n>i;i++){
    arr[i]=sc.nextInt();
    freq[arr[i]]++;
}

System.out.println("Enter number of queries");
int q=sc.nextInt();
while (q>0) {
    System.out.println("enter the element to be searched");
    int x=sc.nextInt();
    if(freq[x]>0){
        System.out.println(x+" is found ");
    }
    else
    System.out.println(x+" not found");
    q--;
}
    }
}
