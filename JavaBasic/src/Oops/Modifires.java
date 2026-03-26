package Oops;
class Default{
    int a=10; // default modifier
}
class Private{
    private int a=10; // private  modifier
}class Protected{
    protected int a=10; // private  modifier
}
class test extends Protected{
     int a=super.a; // prtected  modifier
    public void print(){
        System.out.println((this.a));
    }
}
public class Modifires {
    public static  void main(String[] args){
        Private apple = new Private();
        // private cant be accessable
        //int b = apple.a;
        test apple2 = new test();
        apple2.print();
    }
}
