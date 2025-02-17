public class getter_setters_func {
    public class std1{
       public String name;
    private int roll_no=78;
    double percent;
    public int getRollno(){
        return roll_no;
    }
    }
    public static void main(String[] args) {
      std1 sc=new std1();
      sc.name="Rohan";
      sc.percent=94;
    //   sc.roll_no=4;  
    System.out.println(sc.name);
    // System.out.println(getRollno());
    }
}
