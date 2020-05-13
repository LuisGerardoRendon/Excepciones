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
class Ex1 extends Exception{
    public Ex1(String msg){
        super(msg);
        System.out.println("Excepcion1");
    }
}

public class Excepcion1{
    public static void funcion() throws Ex1 {
		System.out.println("Lanzando mi excepcion desde funcion");
		throw new Ex1("desde Funcion");
	}
	public static void main(String[] args) {
		try {
			funcion();
		} catch(Ex1 e) {
			System.err.println("Ex1 atrapada");
			e.printStackTrace();
		} finally {
			System.out.println("Fin");
		}
		
	}	
}
