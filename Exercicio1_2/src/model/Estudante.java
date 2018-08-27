/**
 * 
 */
package model;

import java.util.Vector;

/**
 * Classe contendo atributos e funcionalidades do Estudante
 * @author Carlos Massavanhane
 * @version 1.0
 */
public class Estudante {

	private String nome;
	private Vector<Double> notas;
	

	/**
	 * construtor padrao
	 */
	public Estudante() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor que recebe nome e as notas do estudante
	 * @param nome
	 * @param notas
	 */
	public Estudante(String nome, Vector<Double> notas) {
		this.nome=nome;
		this.notas=notas;
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the notas
	 */
	public Vector<Double> getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(Vector<Double> notas) {
		this.notas = notas;
	}

}
