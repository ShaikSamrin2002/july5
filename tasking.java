SINGLE TASKING AND MULTI TASKING.....
SINGLE  :  AT A TIME PROCESSOR RUN ONLY ONE FILE..
MULTI  :   

\\\\\\\THREAD BY EXTEND METHOD....
public class Mythread extends Thread {
	public void run()
	{
		for (int i=1;i<10;i++)
		{
			System.out.println(i);
		}
	}
}

\\\\\\TEST CLASS
public class mttheraduse {

	public static void main(String[] args) {
		Mythread obj=new Mythread();
		
		Thread t=new Thread(obj);
		t.start();
		}
}

\\\\\\\\\BY IMPLEMENTS RUNNABLE METHOD
*****SINGLE TASKING
public class Mythread implement Runnable {
	public void run()
	{
		task1();
		task2();
		task3();
	}
	private void task1() {
		System.out.println("task1");
	}
		
	private void task2() {
		System.out.println("task2");
	}		
	private void task3() {
		System.out.println("task3");
 	}		
}

public class DEMOtheraduse {

	public static void main(String[] args) {
		
		DemoThread obj=new DemoThread(obj);
		t.start();
		}
}

O/P: 
TASK1
TASK2
TASK3

******MULTI TASKING
public class Multitasking implements Runnable {
	String str;
	public Multitasking(String str) {
		this.str=str;
	}
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(str+" : "+);
			try {
				Thread.sleep(2000);  //givivng 2 sec time to check and show seat
			}
			catch(Interruptedhandling ie) {
				ie.printStackTrace();
		}
	}
}
public Multitaskinguse {
	public static void main(String[] args) {
		Multitasking obj1= new multitasking("Checking the ticket");
		Multitasking obj2= new multitasking("Show the seat");

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		
		





















