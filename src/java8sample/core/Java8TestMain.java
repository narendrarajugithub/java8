	package java8sample.core;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;


public class Java8TestMain {

	public void sayhellow(SayHellow helo) {
		helo.sayhellow();
	}
	public static void main(String[] args) {
	
		Java8TestMain sam=new Java8TestMain();
		
		 String name="narendra";
		SayHellow	shellofb=	()->System.out.println("hi "+name);
		SayHellowImpl hel=new SayHellowImpl();
		//passing expression as method arg
		sam.sayhellow(shellofb);
		//executing lembda expression implementation with functional interface method 
		hel.sayhellow();
	}

}
