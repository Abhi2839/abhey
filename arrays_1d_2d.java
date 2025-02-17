import java.util.*;

public class arrays_1d_2d {

   static void print(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for (int i=0;n>i;i++){
            for (int j=0;m>j;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[][]=new int [n][m];
            int arr1[][]=new int [n][m];
        for (int i=0;n>i;i++){
            for (int j=0;m>j;j++){
                int b=sc.nextInt();
                arr[i][j]=b;
            }
        }
        for (int i=0;n>i;i++){
            for (int j=0;m>j;j++){
                int b=sc.nextInt();
                arr1[i][j]=b;
            }
        }
    print(arr);
    print(arr1);
        }
}
