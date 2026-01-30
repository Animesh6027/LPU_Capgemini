

public class ThreadSleep extends Thread{
    public void run(){
        System.out.println("Created thread using class...");
        System.out.println("Thread is running...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
    }
    public static void main(String[] args) {
        ThreadSleep t = new ThreadSleep();
        t.start();
    }    
}
