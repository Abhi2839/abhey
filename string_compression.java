import java.util.*;
public class string_compression {
public static void main(String[] args) {
        String str="aaaabbbbcddee";
        String ans=""+str.charAt(0);
        int count=1;
        for (int i=1;str.length()>i;i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else
            {
                if(count>1)
                ans+=count;

                ans+=curr;
                count=1;
            }
            // System.out.println(ans);
        }
        ans+=count;
        System.out.println(ans);
    }
}