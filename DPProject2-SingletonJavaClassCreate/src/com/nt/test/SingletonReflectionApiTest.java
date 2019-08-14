package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.singleton.Printer1;

public class SingletonReflectionApiTest {

	public static void main(String[] args) {
		Class c=null;
		Constructor[] cons=null;
		Printer1 p1=null,p2=null;
		try {
		//load and get singleton java class
		c=Class.forName("com.nt.singleton.Printer1");
		//get all constructor of that singleton java class
		cons=c.getDeclaredConstructors();
		//change private access of singleton java class constructor
		cons[0].setAccessible(true);
		//create singleton java class object by using constructor
		p1=Printer1.getInstance();
		//create 2nd object of singleton java class by using reflection api concept
		p2=(Printer1) cons[0].newInstance();

		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.hashCode()+"   "+p2.hashCode());

		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main method
}//class
