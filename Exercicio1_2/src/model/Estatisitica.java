/**
 * 
 */
package model;

import java.util.Arrays;
import java.util.Vector;

/**
 * Classe contendo metodos estatisticos básicos para o projecto escola
 * @author Carlos Massavanhane
 * @version 1.0
 *
 */
public class Estatisitica {

	/**
	 * 
	 * Construtor padrao adquirido da superclasse Object
	 */
	public Estatisitica() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo para calcular a moda dos elementos no vector (elemento mais frequente)
	 * @param inteiros
	 * @param nElem
	 * @return moda
	 */
	public static int calcularModa(Vector<Integer> inteiros, int nElem) {
		for(int i=0;i<nElem; i++ ) {
			
		}
		return -1;
	}
	
	/**
	 * Metodo para calcular a mediana dos elementos no vector (elemento central).
	 * @param inteiros
	 * @param nElem
	 * @return mediana
	 */
	public static int calcularMediana(Vector<Integer> inteiros, int nElem) {
		
		for(int i=0;i<nElem; i++ ) {
					
		}
		return -1;
	}
	
	/**
	 * Metodo para calcular a media
	 * @param inteiros
	 * @param nElem
	 * @return media
	 */
	public static int calcularMedia(Vector<Integer> inteiros, int nElem) {
		int soma=0;
		for(int i=0;i<nElem; i++ ) {
			soma=soma+inteiros.get(i).intValue();
		}
		
		return soma/nElem;
	}
	
	 public static Vector<Integer> ordenar(Vector<Integer> inteiros) {
		 int aux;
		 for (int i = 0; i < inteiros.size(); i++)
         {
             for (int j = 0; j < inteiros.size(); j++)
             {
                 if (inteiros.get(i).intValue() < inteiros.get(j).intValue())
                 {
                     aux = inteiros.get(i).intValue();
                     inteiros.set(i, inteiros.get(j));
                     inteiros.set(j, aux) ;
                 }
             }
         }
		return inteiros;

   }

}
