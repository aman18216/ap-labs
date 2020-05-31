package fibonacitest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class producer implements Runnable{
	private LinkedList<Integer> queue;
	private Thread thr;
	private int queuesize;
	fibo1 fi;
    public producer(LinkedList<Integer> q) {
        setQueue(q);
        thr = new Thread(this,"producer");
        thr.start();
    }
	@Override
	public void run(){
		 int n =0;
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++)
	    {
	        try
	        {
	            fi.fib(i);
	        } catch (Exception e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
		
	}
	public LinkedList<Integer> getQueue() {
		return queue;
	}
	public void setQueue(LinkedList<Integer> queue) {
		this.queue = queue;
	}
	
}
class consumer implements Runnable{
	private LinkedList<Integer> queue;
	private Thread thr;
	fibo1 fg;
	public consumer(LinkedList<Integer> q) {
        setQueue(q);
        thr = new Thread(this,"consumer");
        thr.start();
    }
	public LinkedList<Integer> getQueue() {
		return queue;
	}
	public void setQueue(LinkedList<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
			int i=0;
				fg.fib(i);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}

class fibo1{
	private final static LinkedList<Integer> queue;
	private fibo1(LinkedList<Integer> queue, int queuesize) {
		this.queue = queue;
		this.queuesize = queuesize;
	}

	public fibo1() {
		// TODO Auto-generated constructor stub
	}

	private final static int queuesize;
	private static  Condition notEmpty = Lock.newCondition();
	private static Map<String, fibo1> instances =new HashMap<String, fibo1>();
	
	public synchronized static fibo1 getInstance(int x, int y)
	{
		String key = x + ", " + y;
		if (!instances.containsKey(key)) { 
			instances.put(key, new fibo1());
		}
		return instances.get(key);
	}
	
	
	public synchronized static int fib(int m) {
		//synchronized(queue) {
			if (queue.size() == queuesize) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (queue.size() == 0) {
				notEmpty.wait();
			}
			else if (m==0 || m==1) {
				queue.add(m);
			}
			else {
				//queue.add(queue.get(m-1)+queue.get(m-2));
			}
			queue.notifyAll();
			//queue.notifyAll();
		//return m;
		
		
	}
	public static LinkedList<Integer> getQueue() {
		return queue;
	}

	public static void setQueue(LinkedList<Integer> queue) {
		fibo1.queue = queue;
	}

	public static int getQueuesize() {
		return queuesize;
	}

	public static void setQueuesize(int queuesize) {
		fibo1.queuesize = queuesize;
	}
}
public class fibo {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList();
		Thread p1  = new Thread(new producer(queue));
		Thread c1 = new Thread(new consumer(queue));
		fibo1 ft  = new fibo1();
		
		p1.start();
		c1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for( i=0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		arr[i] = ft.fib(arr[i]);
		System.out.println(arr[i]);
	}
}
