package rmi_base;

import java.io.Serializable;
import java.util.List;

public class Resultado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Turma t;
	private List<Aluno> aprovados, reprovados, recuperacao;
	private double mediaTurma;
	
	public Resultado(Turma t, List<Aluno> apr, List<Aluno> repr, List<Aluno> rec, double media) {
		mediaTurma = media;
		aprovados=apr;
		reprovados = repr;
		recuperacao = rec;
		this.t= t;
	}

	public Turma getT() {
		return t;
	}

	public void setT(Turma t) {
		this.t = t;
	}

	public List<Aluno> getAprovados() {
		return aprovados;
	}

	public void setAprovados(List<Aluno> aprovados) {
		this.aprovados = aprovados;
	}

	public List<Aluno> getReprovados() {
		return reprovados;
	}

	public void setReprovados(List<Aluno> reprovados) {
		this.reprovados = reprovados;
	}

	public List<Aluno> getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(List<Aluno> recuperacao) {
		this.recuperacao = recuperacao;
	}

	public double getMediaTurma() {
		return mediaTurma;
	}

	public void setMediaTurma(double mediaTurma) {
		this.mediaTurma = mediaTurma;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
