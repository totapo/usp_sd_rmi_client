package rmi_base;

import java.io.Serializable;

public class Materia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome, descricao, codigo;
	
	public Materia(String nome, String descricao, String codigo) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
