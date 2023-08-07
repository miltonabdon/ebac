package com.ebac.tarefa_calculo_media;

import java.util.List;

/**
 * @author miltonjunior
 */
public class Media {

	private Double media;
	private Double nota;

	public Media() {
		this.nota = 0.0;
	}

	protected double calculaMediaQuatroNotas(double nota1, double nota2, double nota3, double nota4) {

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;

	}

	/**
	 * 
	 * @param notas
	 * @return
	 * @deprecated
	 * @see para essa aula utilizar o calculaMediaQuatroNotas
	 */
	protected double calculaMedia(List<Double> notas) {

		notas.forEach(n -> {
			nota += n;
		});

		media = nota / notas.size();

		return media;
	}

}
