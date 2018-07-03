package rmi_base;

import java.io.Serializable;

public class Professor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private long id;
	
	public Professor(String n, long i) {
		nome=n;
		id=i;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
