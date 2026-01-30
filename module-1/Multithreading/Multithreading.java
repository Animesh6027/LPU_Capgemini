/* 
Multithreading:
    Multithreading in java is process of executing multiple threads simultaneously.
    Thread is a lightweight sub-process, the smallest unit of processing.
    Threads are independent, so if there occurs exception in one thread, it doesn't affect others.
    Multiprocessing and multithreading are used to achieve multitasking.
    But we use multithreading instead of multiprocessing because threads share the common memory area. They don't 
    allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
    Java multithreading is mostly used in games, animations, etc.

Advantages of multithreading:
    1. It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
    2. You can perform many operations together so it saves time.
    3. Threads are independent so it doesn't affect other threads if exception occur in a single thread.

Multitasking: 
    It is process of executing multiple tasks simultaneously.
    We use multitasking to utilize CPU efficiently.
    It is achieved by two ways:
        Process-based multitasking(multiprocessing)
        Thread-based multitasking(multithreading)

Process-based multitasking:
    Each process has its own address memory i.e each process allocates separate memory area.
    Process is heavyweight.
    Cost of communication between processes is high.

Thread-based multitasking:
    Threads share common address space.
    Thread is lightweight.
    Cost of communication between threads is low.

Life cycle of a Thread (Thread States):
    1. New
    2. Runnable
    3. Running
    4. Non-Runnable (Blocked)
    5. Terminated

    The life cycle of a thread is controlled by JVM.

1. New: 
    The thread is in new state if you create an instance of Thread class but before invocation of start() method.
2. Runnable:
    When you invoke the start() method, the thread enters into runnable state, but the thread scheduler has not selected it to be in the running thread.
3. Running:
    The thread is in running state if the thread scheduler has selected it.
4. Non-Runnable (Blocked):
    This is the state whem the thread is still alive, but is currently not eligible to run
5. Terminated:
    A thread is in terminated or dead state when its run() method exits.

How to create thread?
    1. By extending Thread class
    2. By implementing Runnable interface.

Thread class:
    The Thread class provides constructors and methods to create and perform operations on a thread.
    Thread class extends Object class and implements Runnable interface.

Commonly used Constructors of Thread class:
    Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r, String name)

Commonly used Methods of Thread class:
    1. public void run(): It is used to perform the action for the thread.
    2. public void start(): It is used to start the execution of the thread. The JVM calls the run() method of the thread.
    3. public void sleep(long millisecond): It is used to pause the execution of the thread for the specified        milliseconds.
    4. public void join(): It is used to wait for a thread to die.
    5. public void join(long millisecond): It is used to wait for a thread to die for the specified milliseconds.
    6. public int getPriority(): It is used to get the priority of the thread.
    7. public int setPriority(int priority): changes the priority of the thread.
    8. public string getName(): It is used to get the name of the thread.
    9. public void setName(String name): It is used to set the name of the thread.
    10. public Thread currentThread(): returns the reference of currently executing thread.
    11. public int getId(): It is used to get the ID of the thread.
    12. public Thread.State getState(): It is used to get the state of the thread.
    13. public boolean isAlive(): It is used to check whether the thread is alive or not.
    14. public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
    15. public void suspend(): is used to suspend the thread(depricated).
    16. public void resume(): is used to resume the suspended thread(depricated).
    17. public void stop(): is used to stop the thread(depricated).
    18. public boolean isDaemon(): It is used to check whether the thread is daemon or user thread.
    19. public void setDaemon(boolean isDaemon): It is used to set the thread as daemon or user thread.
    20. public void interrupt(): interrupts the thread.
    21. public boolean isInterrupted(): test if the thread is interrupted or not.
    22. public static boolean interrupted(): tests if the current thread has been interrupted.

Runnable interface:
    The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
    The class must define a method of no arguments called run().

    public void run(): is used to perform action on thread.

Thread Scheduler:
    Thread scheduler in java is the part of JVM that decides which thread should run.
    There is no guarantee that which runnable thread will be selected to run by the thread scheduler.
    Only one thread at a time can run in a single process.



*/

public class Multithreading extends Thread{
    public void run(){
        System.out.println("Created thread using class...");
        System.out.println("Thread is running...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
    }
    public static void main(String[] args) {
        Multithreading t = new Multithreading();
        t.start();
    }    
}
