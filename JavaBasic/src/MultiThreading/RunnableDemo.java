package MultiThreading;

class Demo implements Runnable {
    @Override
    public void run() {
        System.out.println("hi");
    }
}

public class RunnableDemo
{
    public static void main(String[] args){
        Runnable r = new Demo();
        Thread t = new Thread(r);
        t.start();
    }
}
