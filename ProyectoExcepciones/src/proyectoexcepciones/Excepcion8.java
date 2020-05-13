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
class Ex8 extends Exception {
	private String msg;
	Ex8(String msg) {
		super(msg);
		System.out.println("Exception4()");
		this.msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception4: " + msg);
	}
}

class Prueba8 {
	public static void funcion() throws Ex8 {
		System.out.println("f()");
		throw new Ex8("Ouch from f()");
	}
}

public class Excepcion8 {
    public static void main(String[] args) {
		try {
			Prueba8 t = new Prueba8();
			t.funcion();	
		} catch(Ex8 e) {
			System.err.println("Caught Exception4");
			e.printStackTrace();
			e.showS();
		} 
	}	
}
