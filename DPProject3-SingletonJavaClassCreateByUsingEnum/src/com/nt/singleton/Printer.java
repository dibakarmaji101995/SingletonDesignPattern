package com.nt.singleton;

public enum Printer {
	INSTANCE;

	// Business method
	public void write(String msg) {
		System.out.println(msg);
	}
	   public Object myClone() throws CloneNotSupportedException {
		  return super.clone();
	   }
   

}
