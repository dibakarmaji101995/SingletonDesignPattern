package com.nt.singleton;

import java.io.Serializable;

import com.nt.util.CommonsUtil;

public class Printer1 extends CommonsUtil{
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 7908573865L;
	private static Printer1 instance;
	private static boolean isInstance=false;

	/*
	 * static { //Egar Instanciation if(instance==null) instance=new Printer(); }
	 */

	private Printer1() throws InstantiationException {
		if(isInstance) {
			throw new InstantiationException();
		}
		isInstance=true;
		System.out.println("Printer::0-param constructor");
	}

	/*
	 * public static Printer getInstance() { //Egar Instanciation return instance; }
	 */

	/*
	 * public static synchronized Printer getInstance() { if(instance==null) {
	 * instance=new Printer(); } return instance; }//method
	 */
	public static Printer1 getInstance() throws InstantiationException {
		// using double null check concept
		if (instance == null) { // 1st null check
			System.out.println("Thread name::"+Thread.currentThread().getName());
			synchronized (Printer.class) {
				if (instance == null) { // 2nd null check
					try {
						Thread.sleep(5000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					instance = new Printer1();
				}

			} // Synchronized
		} // if
		return instance;
	}
	public  Object readResolve(){
		System.out.println("read Resolve(-)");
		return instance;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Not allow to create 2nd object");
	}
}// class
