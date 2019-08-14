package com.nt.test;

import com.nt.singleton.Printer;

public class PrintServlet implements Runnable {

	@Override
	public void run() {
		Printer p1 = null,p2=null;
		try {
			p1=Printer.INSTANCE;
			Thread.sleep(20000);
			// get printer class object
			p2 = Printer.INSTANCE;
			System.out.println(Thread.currentThread().getName());
			System.out.println("p1==p2?"+(p1==p2));
			System.out.println(p1.hashCode()+"  "+p2.hashCode());
		} //try
		catch (Exception e) {
			e.printStackTrace();
		}//catch
	}// run
}// class
