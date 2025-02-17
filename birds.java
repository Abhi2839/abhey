public class  lambda_expression{
   public static void main(String[] args) {
    // anonyms fucntion
    // birds eagle=new birds(){
    //  public void fly(){
    //         System.out.println("Eagle can fly");
    //     }
    // };  // anonyms func
    // eagle.fly();
//lamba expression or arrow function
    birds eagle=() ->{
    System.out.println("Eagle can fly");
      }; 
       eagle.fly();
   }
}
@FunctionalInterface
 public interface birds {
void fly();}
// anonmyms function means without name
// public class functional_interface {
    
// }
// lamda function
// public class functional_interface {
    
// }


