package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	//Thread-safe
	//default size 10, newCapacity = def cap * def cap; or if you gave incrementalcap then newcap = defcap + incremacap;
	public static void main(String[] args) {
		Vector v= new Vector();
		Vector v1 = new Vector<>(1000);		//Vector(int initialCap)
		Vector v2 = new Vector<>(1000,10);	//Vector(int initialCap, int incrementalCap)
		//Vector v3 = new Vector<>(Collection c);
		v.addElement("A");
		v.addElement("C");
		v.add(1,"B");
		System.out.println(v);
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement());
		}
		System.out.println();
		Iterator i = v.iterator();
		System.out.println(i.getClass().getName());
		ListIterator li = v.listIterator();
		System.out.println(li.getClass().getName());
		v.remove("A");
		v.removeElement("B");
		v.removeElementAt(1);
		v.get(1);
		v.elementAt(1);
		v.firstElement();
		v.lastElement();
		v.size();
		v.capacity();
		v.elements();		//Enumaration:: To get ele's 1 by 1
		System.out.println(v);
		
		
		

		v.removeAllElements();
	}

}
