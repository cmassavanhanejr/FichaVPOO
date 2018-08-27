/**
 * 
 */
package view;

import java.util.Vector;

import javax.swing.JOptionPane;

import model.Estudante;

/**
 * aplicação que consiga ler o número total de estudantes de uma determinada turma, 
 * de seguida peça o nome e as 3 notas dos testes feitos por cada estudante da turma.
 * A aplicação irá ler e calcular e exibir a média das notas da turma. 
 * E em seguida deve mostrar o estudante 
 * ou estudantes que possuem a melhor média (no caso de empate).
 * @author Carlos Massavanhane
 * @version 1.0
 * 
 */
public class Executavel2 {

	/**
	 * Atributo que ira receber estudantes de uma determinada turma
	 */
	public static Vector<Estudante> estudantes;
	
	/**
	 * constructor padrao
	 */
	public Executavel2() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the estudantes
	 */
	/*public Vector<Estudante> getEstudantes() {
		return estudantes;
	}*/

	/**
	 * @param estudantes the estudantes to set
	 */
	/*public void setEstudantes(Vector<Estudante> estudantes) {
		this.estudantes = estudantes;
	}*/
	
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//Executavel e=new Executavel();
		
		//Recebendo via teclado o numero estudantes da turma
		int nEstudantes=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero de estudantes da turma"));
		String nome="";
		Vector<Double> notas=new Vector<>(3);
		
		//Chamando metodo para adicionar estudantes
		Executavel2.adicionarEstudantes(nEstudantes, nome, notas);
		
		//Chamando metodo para imprimir estudantes
		Executavel2.imprimirMedias(nEstudantes);
		
		//Chamando metodo para imprimir estudante com melhor media
		Executavel2.imprimirMelhorEstudante(nEstudantes);
	}
	
	/**
	 * 
	 * @param nEstudantes
	 */
	public static void imprimirMelhorEstudante(int nEstudantes) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo para achar melhor estudante de acordo com sua media!!!
	 * @param nEstudantes
	 * @param medias
	 * @return
	 */
	public Vector<Estudante> acharMelhorEstudante(int nEstudantes, Vector<Double> medias){
		return null;
		
	}


	/**
	 * Metodo estatico para adicionar dados do estudante de cada turma
	 * @param nEstudantes
	 * @param nome
	 * @param notas
	 */
	public static void adicionarEstudantes(int nEstudantes, String nome, Vector<Double> notas) {
		for(int i=0;i<nEstudantes;i++) {
			nome=JOptionPane.showInputDialog("Introduza o seu nome: ");
			for(int j=0; j<notas.size(); j++) {
				notas.add(Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota")));
			}
			Executavel2.estudantes.add(new Estudante(nome, notas));
		}
	}
	
	
	/**
	 * Media para calcular medias
	 * @param nEstudantes
	 * @param medias
	 */
	public static void imprimirMedias(int nEstudantes) {
		String medias="";
		//Ciclo para chamar metodo imprimir medias de estudantes cadastrados
		for(int i=0;i<nEstudantes;i++) {
			medias= "A media do estudante " + estudantes.get(i).getNome() +" eh " + calcularMedias(nEstudantes).get(i) +"\n";
		}
		JOptionPane.showMessageDialog(null,medias);
	}
	
	/**
	 * Metodo para calcular as medias
	 * @param nEstudantes
	 * @return
	 */
	public static Vector<Double> calcularMedias(int nEstudantes){
		Vector<Double> medias=new Vector<>();
		double media=0;
		for(int i=0; i<nEstudantes;i++) {
			media=0;
			for(int j=0; j<3;j++) {
				media=media + estudantes.get(i).getNotas().get(j);
			}
			media=media/3;
			medias.add(media);
		}
		
		return medias;
	}

}
