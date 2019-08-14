package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonJavaClassTest {

	public static void main(String[] args)throws Exception {
		Printer p1=null,p2=null;
	//	Class.forName("com.nt.singleton.Printer");   //Egar instanciation
		//get singleton java class object
        p1=Printer.getInstance();
        p2=Printer.getInstance();
        System.out.println("(p1==p2)?"+(p1==p2));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode()+"    "+p2.hashCode());
	}//main method
}//class
