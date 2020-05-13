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
public class Excepcion3 {
    private static int[] arreglo = new int[2];	
	public static void main(String[] args) {
		try {
			arreglo[2] = 3;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(
				"Atrapado por ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
	}	
}
