package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private String codigo;
	private String formacao;
	private float horaAula;
	private int quantidadeAula;
	private ArrayList<Disciplina> disciplina;
	
	
	public float calcularPagamento() {
		return 0;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getHoraAula() {
		return horaAula;
	}
	public void setHoraAula(float horaAula) {
		this.horaAula = horaAula;
	}
	public int getQuantidadeAula() {
		return quantidadeAula;
	}
	public void setQuantidadeAula(int quantidadeAula) {
		this.quantidadeAula = quantidadeAula;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
