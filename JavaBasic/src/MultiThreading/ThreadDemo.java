package MultiThreading;
class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i= 0 ; i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("child");
        }
    }
}
public class ThreadDemo {
    static void main(String[] args) {
        ThreadTest tr = new ThreadTest();
        tr.start();
        for(int i= 0 ; i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("main");
        }
    }

}
