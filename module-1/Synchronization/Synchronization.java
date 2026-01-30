/* Synchronization in Java :
	Synchronization in java is the capability to control the access of multiple threads to any shared resource.
	Java Synchronization is better option where we want to allow only one thread to access the shared resource.
	The synchronization is mainly used to
		1.To prevent thread interference.
		2.To prevent consistency problem
	
Concept of Lock in Java: 
	Synchronization is built around an internal entity known as the lock or monitor. 
	Every object has an lock associated with it. 
	By convention, a thread that needs consistent access to an object's fields has to acquire the object's 
	lock before accessing them, and then release the lock when it's done with them.
	
	
Java synchronized method :	
	If you declare any method as synchronized, it is known as synchronized method.
	Synchronized method is used to lock an object for any shared resource.
	When a thread invokes a synchronized method, it automatically acquires the lock for that object and 
	releases it when the thread completes its task.
	
Synchronized block in java :
	Synchronized block can be used to perform synchronization on any specific resource of the method.
	Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use
	synchronized block.
	If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.	
	Synchronized block is used to lock an object for any shared resource.
	Scope of synchronized block is smaller than the method.
	
-------------------------------------------------------------------------------------------------------

Deadlock in java :
	Deadlock is a situation in Java where two or more threads are permanently blocked, each waiting for a 
	lock held by another thread.
	
	
Inter-thread communication in Java :
	Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with 
	each other.
	Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical 
	section and another thread is allowed to enter (or lock) in the same critical section to be executed.
	It is implemented by following methods of Object class:
		wait()
		notify()
		notifyAll()	
	
wait() method :
	Causes current thread to release the lock and wait until either another thread invokes the notify() method 
	or the notifyAll() method for this object, or a specified amount of time has elapsed.
	The current thread must own this object's monitor, so it must be called from the synchronized method only 
	otherwise it will throw exception.	
	
notify() method : 
	Wakes up a single thread that is waiting on this object's monitor.
	If any threads are waiting on this object, one of them is chosen to be awakened. 
	The choice is arbitrary and occurs at the discretion of the implementation.	
	
notifyAll() method : 
	Wakes up all threads that are waiting on this object's monitor. */