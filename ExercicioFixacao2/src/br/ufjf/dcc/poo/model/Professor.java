package br.ufjf.dcc.poo.model;

public class Professor extends Pessoa {
	private String codigo;
	private String formacao;
	private float horaAula;
	private int quantidadeAula;
	
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
	
}
