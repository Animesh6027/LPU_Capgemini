/* Java Thread Pool :
	Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
	In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled
	out and assigned a job by the service provider. After completion of the job, thread is contained in the 
	thread pool again.	
	Better performance It saves time because there is no need to create new thread.
	It is used in Servlet and JSP where container creates a thread pool to process the request.
	
---------------------------------------------------------------------------------------------------
In a thread pool, we do NOT create threads directly.
We create a pool, and the pool creates & manages threads.

ExecutorService pool = Executors.newFixedThreadPool(3);
Pool created
3 threads are created internally
Threads are ready and waiting


In Java thread pools, execute() is needed to submit a task to the pool so that a worker thread can run it.
execute() sends a task to the thread pool
The thread pool decides WHICH thread will run it
You do not create or start threads manually
*/


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(
            "Task " + taskId +
            " executed by " +
            Thread.currentThread().getName()
        );
    }
}

public class Threadpool {

    public static void main(String[] args) {

        // Create thread pool of size 3
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {
            service.execute(new Task(i));
        }

        // Shutdown pool
        service.shutdown();
    }
}