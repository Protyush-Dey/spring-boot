package Interface;

public interface MEMAL {
    void Eat();
    void Leg();
    default void Hi(){
        System.out.println("hi");
    }
}
