package Oops;
class Animal{
    public void talk(){
        System.out.println("talk");
    }
}
class Cat extends Animal{

}
public class Inhertence {
    public static void main(String[] args){
        Cat cat =new Cat();
        cat.talk();
    }
}
