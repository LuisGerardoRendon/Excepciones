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
public class Excepcion5 {
    private static int[] arreglo = new int[2];
	static int x = 5;	
	public static void main(String[] args) {
		while(true) {
			try {
				arreglo[x] = 1;
				System.out.println(arreglo[x]);
				break;	
			} catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(
					"Atrapado por ArrayIndexOutOfBoundsException");
					e.printStackTrace();
				x--;
			} finally {
				System.out.println("Ya se termino?");		
			}
		}
		System.out.println("Termina");
	}	
}
