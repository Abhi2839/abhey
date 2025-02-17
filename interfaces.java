public class interfaces {
    public static void main(String[] args) {
        queen q=new queen();
        q.move();
    }
}

// interface is a blueprint of a class
// multiple inheritance
// inherited through implement keyword instead of extends that used in class
// all methods are public ,abstract and without implementation
// used to achieve total abstraction
// variable used in interface are final,public,static

 interface chess {
void move();// by default it is public and abstract   
}
// class class_name implement interface_1,interface2,..
class queen implements chess{
  public  void move(){ //public keyword is necessary as defaukt is bydefault access modifier
        System.out.println("Up,down,right,left,diagonal(in 4 dirn)");
    }
}


class rook implements chess{
    public  void move(){ //public keyword is necessary as defaukt is bydefault access modifier
          System.out.println("Up,down,right,left");
      }
  }

  class king implements chess{
    public  void move(){ //public keyword is necessary as defaukt is bydefault access modifier
          System.out.println("Up,down,right,left,diagonal(single step)");
      }
  }