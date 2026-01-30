
public class Sleep_RunThread {
    public void run(){
        
        try {
            System.out.println(Thread.currentThread().getName() + " is sleeping for 2 seconds");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has awakened");
        } catch (InterruptedException e) {}
    }
}
