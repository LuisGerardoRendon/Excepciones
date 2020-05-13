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
public class Excepcion2 {
    private static Integer i = null;	
	public static void main(String[] args) {
		try {
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Atrapada por NullPointerException");
			e.printStackTrace();
		} 
		try {
			i = 10;
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Atrapada por NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("Finalizo correctamente");
		}
	}	
}
