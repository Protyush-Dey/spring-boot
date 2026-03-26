package Interface;

interface  Demo{
    int a = 10; // public, static and final
    void display(); //abstruct and public
}

public class InterfaceDemo implements Demo {
    @Override
    public void display() {
        System.out.println("hi");
    }
}
