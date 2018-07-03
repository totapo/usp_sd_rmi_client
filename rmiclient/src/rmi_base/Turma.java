package rmi_base;

import java.io.Serializable;
import java.util.List;

public class Turma implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Aluno> alunos;
	private Professor professor;
	private Materia materia;
	
	public Turma(List<Aluno> alunos, Professor p, Materia m) {
		this.alunos = alunos;
		this.professor=p;
		this.materia = m;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
