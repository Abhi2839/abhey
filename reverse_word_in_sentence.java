import java.util.*;

public class reverse_word_in_sentence {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String ans="";//empty str to store
    StringBuilder s =new StringBuilder("");
    String ss="";
    for (int i=0;str.length()>i;i++){
      char ch=str.charAt(i);
      if (ch!=' '){
        s.append(ch);
        ss+=ch;
      }
      else{
        s.reverse();
        ans+=s;
        ans+=" ";
        s=new StringBuilder();// to delete the current content of str
      
      }
    }
    s.reverse();
    ans=ans+s;
    System.out.println(ans);

  }
}