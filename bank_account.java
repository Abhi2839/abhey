import java.util.Scanner;

public class bank_account {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String name=sc.next();
       int bal=sc.nextInt();
    String city=sc.next();
        bankacc bnkacc=new bankacc(name,bal,city);
        bnkacc.display();
        System.out.println("Enter the 1 for depoist and 2 for withdrawing");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the amount to be deposited");
            int amount=sc.nextInt();
            bnkacc.depoist(amount);
        }
        else if (choice==2){
            System.out.println("Enter the amount to withdraw");
            int amount=sc.nextInt();
            bnkacc.withdraw(amount);
        }
        
        bnkacc.display();
    }
}

class bankacc{
private String name;
private int acc_bal;
public String city;
public bankacc(String name, int acc_bal,String city){
    this.name=name;
    this.acc_bal=acc_bal;
    this.city=city;
}
void withdraw(int amount_withdrwan){
    if (this.acc_bal>amount_withdrwan){
    this.acc_bal=acc_bal-amount_withdrwan;
        System.out.println("Updated bal after withdrawing "+this.acc_bal);
}
    else
    System.out.println("Amount is less");
}
void depoist(int amt_depoi){
    this.acc_bal=acc_bal+amt_depoi;
    System.out.println("Updated bal after depoist "+this.acc_bal);
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("City: "+city);
    System.out.println("Acc Bal: "+acc_bal);
}
}
