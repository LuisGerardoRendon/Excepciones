/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexcepciones;

/**
 *
 * @author ALDO
 */
class Ex4 extends Exception {
	private String msg;
	Ex4(String msg) {
		super(msg);
		System.out.println("Exception4()");
		this.msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception4: " + msg);
	}
}

public class Excepcion4 {
    public static void funcion() throws Ex4 {
		System.out.println("f()");
		throw new Ex4("Ouch from f()");
	}
	public static void main(String[] args) {
		try {
			funcion();	
		} catch(Ex4 e) {
			System.err.println("Caught Exception4");
			e.printStackTrace();
			e.showS();
		} 
	}	
}
