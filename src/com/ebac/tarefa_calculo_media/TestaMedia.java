package com.ebac.tarefa_calculo_media;

import java.util.ArrayList;
import java.util.List;

public class TestaMedia{
	
	public static void main(String[] args) {
		
		Media media = new Media();
		List<Double> listaNotas = new ArrayList<>();
		listaNotas.add(10.0);
		listaNotas.add(5.0);
		listaNotas.add(7.5);
		double calculaMedia = media.calculaMedia(listaNotas);
		System.out.println(calculaMedia);
		
	}
}