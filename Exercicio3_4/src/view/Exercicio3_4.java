/**
 * 
 */
package view;

import java.util.Vector;

/**
 * Classe que possui metodos/algoritmos dos exercicios 3 e 4
 * @author Carlos Massavanhane
 *
 */
public class Exercicio3_4 {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Dados dois vetores quaisquer de booleanos compare-os 
	 * e informe se ambos s�o id�nticos, 
	 * para serem id�nticos os vetores devem possuir o mesmo tamanho 
	 * e os mesmos elementos em cada posi��o.
	 * @param vectorA
	 * @param vectorB
	 * @return
	 */
	@SuppressWarnings("unused")
	public boolean verificarIdenticos(Vector<Boolean> vectorA, Vector<Boolean> vectorB) {
		//Verificando se tem mesmo tamanhos
		if(vectorA.size()==vectorB.size()) {
			//Percorrendo todos elementos dos vectores em causa
			for(int i=0; i<vectorA.size();i++) {
				//Verificando se os elementos em cada posicao deles sao identicos
				if(vectorA.get(i).booleanValue()==vectorB.get(i).booleanValue())
					return true;
				return false;
			}
		}
		return false;
	}
	
	/**
	 * algoritmo para ordenar um vetor da seguinte forma, 
	 * o algoritmo identifica o maior valor 
	 * e o coloca na �ltima posi��o livre de um outro vetor. 
	 * Na pr�xima itera��o este valor � descartado,
	 * repetindo at� n�o sobrarem mais valores.
	 * @param v
	 * @return
	 */
	public Vector<Integer> ordenarVector(Vector<Integer> vector){
		int aux=0;
		for(int i=0;i<vector.size();i++) {
			for(int j=0; i<vector.size();j++) {
				if(vector.get(i).intValue()<vector.get(j).intValue()) {
					//aux=
				}	
			}
			
		}
		return null;
		
	}

}
