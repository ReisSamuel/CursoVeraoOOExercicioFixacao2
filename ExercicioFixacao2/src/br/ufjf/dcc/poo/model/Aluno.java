package br.ufjf.dcc.poo.model;

public class Aluno extends Pessoa {
	private String matricula;
	private float mensalidade;
	private float bolsa;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
