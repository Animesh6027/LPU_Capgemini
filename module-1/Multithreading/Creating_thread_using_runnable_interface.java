
public class Creating_thread_using_runnable_interface implements Runnable{
    public void run(){
        System.out.println("Created thread using runnable interface...");
    }
    public static void main(String[] args) {
        Creating_thread_using_runnable_interface obj = new Creating_thread_using_runnable_interface();
        Thread t = new Thread(obj);
        t.start();
    }
}
