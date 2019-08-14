package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonCloneTest {

	public static void main(String[] args) throws InstantiationException {
		Printer p1=null,p2=null;
		//create singleton java class object
        p1=Printer.INSTANCE;
        //create 2nd object of singleton java class by using cloning concept
        try {
        p2=(Printer) p1.myClone();        //jvm throw java.lang.CloneNotSupportedException
        System.out.println("p1==p2?"+(p1==p2));
        System.out.println(p1.hashCode()+"   "+p2.hashCode());
        }
        catch(CloneNotSupportedException cnse) {
        	cnse.printStackTrace();
        }
	}

}
