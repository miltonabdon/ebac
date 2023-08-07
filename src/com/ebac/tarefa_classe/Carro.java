package com.ebac.tarefa_classe;

public class Carro {

	private String modelo;
	private Integer velocidade;
	private Float motor;

	public Carro(String modelo, Float motor) {
		this.modelo = modelo;
		this.velocidade = 0;
		this.motor = motor;
	}

	protected String acelera() {

		return "A velocidade agora é de: " + velocidade++;

	}

	protected String desacelera() {

		return "A velocidade agora é de: " + velocidade--;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public Float getMotor() {
		return motor;
	}

	public void setMotor(Float motor) {
		this.motor = motor;
	}

}
