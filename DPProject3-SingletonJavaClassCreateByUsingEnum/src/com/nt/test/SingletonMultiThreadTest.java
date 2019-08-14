package com.nt.test;

public class SingletonMultiThreadTest {

	public static void main(String[] args) {
		PrintServlet servlet=null;
		Thread th1=null,th2=null,th3=null,th4=null,th5=null;
		//create PrintServlet class object
		servlet=new PrintServlet();
		//create thread class object
		th1=new Thread(servlet);
		th2=new Thread(servlet);
		th3=new Thread(servlet);
		th4=new Thread(servlet);
		th5=new Thread(servlet);
		
		th1.setPriority(10);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}//main method
}//class
