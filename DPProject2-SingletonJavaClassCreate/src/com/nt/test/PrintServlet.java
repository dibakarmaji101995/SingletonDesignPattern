package com.nt.test;

import com.nt.singleton.Printer;

public class PrintServlet implements Runnable{

	@Override
	public void run() {
		Printer p1=null;
		//get printer class object
		p1=Printer.getInstance();
		System.out.println("Print hashCode of object::"+p1.hashCode());
	}//run
}//class
