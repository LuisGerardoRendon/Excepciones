/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexcepciones;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 *
 * @author ALDO
 */

class Oops1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops1() { 
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString()); 		
	}
}

class Oops2 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops2() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
	} 
}

public class Excepcion6 {
    static void funcion() throws Oops1, Oops2 {
		throw new Oops1();
	}
	static void funcion2() throws Oops2 {
		throw new Oops2();
	}
	public static void main(String[] args) {
		try {
			funcion();
		} catch(Exception Oops1) {}
		try {
			funcion2();
		} catch(Exception Oops2) {}
	}
}
