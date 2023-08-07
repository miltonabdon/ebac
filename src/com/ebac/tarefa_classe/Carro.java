package com.ebac.tarefa_classe;

/**
 * @author miltonjunior
 */
public class Carro {

	private String modelo;
	private Integer velocidade;
	private Float motor;
	private boolean liga;

	public Carro(String modelo, Float motor) {
		this.modelo = modelo;
		this.velocidade = 0;
		this.motor = motor;
		this.liga = false;
	}
	
	/**
	 * 
	 * @return
	 */
	protected boolean liga() {
		return !liga;
	}
	
	/**
	 * 
	 * @deprecated 
	 * @see utilizar metodo liga() 
	 */
	protected boolean power() {
		return true;
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
