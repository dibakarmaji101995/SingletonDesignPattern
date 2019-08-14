 
package com.nt.singleton;

public class Printer {
	private static Printer instance;

	/*
	 * static { //Egar Instanciation if(instance==null) instance=new Printer(); }
	 */

	private Printer() {
		System.out.println("Printer::0-param constructor");
	}

	/*
	 * public static Printer getInstance() { //Egar Instanciation return instance; }
	 */

	/*
	 * public static synchronized Printer getInstance() { if(instance==null) {
	 * instance=new Printer(); } return instance; }//method
	 */
	public static Printer getInstance() {
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
					instance = new Printer();
				}

			} // Synchronized
		} // if
		return instance;
	}
}// class
