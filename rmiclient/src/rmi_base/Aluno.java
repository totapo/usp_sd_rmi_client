package rmi_base;

import java.io.Serializable;
import java.util.List;

public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private long id;
	private List<Double> notas;
	
	public Aluno(String n, long i, List<Double> no) {
		nome=n;
		id=i;
		notas=no;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
