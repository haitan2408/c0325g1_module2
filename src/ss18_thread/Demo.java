package ss18_thread;

public class Demo extends Thread{
    String name;
    public Demo() {
    }

    public Demo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =0; i< 10000; i++) {
            System.out.println(i +" "+ name);

        }
    }

    public static void main(String[] args) {
        Demo thread = new Demo("Nam");
        Demo thread1 = new Demo("Quân");
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("hello");

    }
}
