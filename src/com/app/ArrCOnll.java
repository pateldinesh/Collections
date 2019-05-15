package com.app;

import java.util.TreeSet;

public class ArrCOnll {
	public static void main(String[] args) {
		TreeSet<Object> tr=new TreeSet<>();
		tr.add(12);
		tr.add(15);
		tr.add(17);
		System.out.println(tr.size());
		System.out.println();
		for(Object r:tr)	
			System.out.println(r);
	}
}