
public class ThreadJoin extends Thread{
    public void run(){
        System.out.println("Created thread using class...");
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
        
    public static void main(String[] args) {
        ThreadJoin t = new ThreadJoin();
        try{
            t.start();
            t.join();
        } catch (InterruptedException e) {}
        System.out.println("Main thread is running...");
    }
}    


