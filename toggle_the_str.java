import java.util.*;

public class toggle_the_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       StringBuilder str= new StringBuilder(sc.nextLine());
       System.out.println(str);
for (int i=0;str.length()>i;i++){
boolean flag=true;
char ch=str.charAt(i);
if (ch==' ')
continue;
int asci=(int)ch;
if (asci>=97)
flag=false;
if (flag==true){
    asci+=32;  //for Capital letter
    char x=(char)asci;
str.setCharAt(i,x);

}
else {
    asci-=32;
    char x=(char)asci;
    str.setCharAt(i,x);
}
}
System.out.println(str);
    }
}
