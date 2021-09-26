package com.mhsb.relatorioJasper.model;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	private String nomeMateria;
	private List<Questao> listaQuestoes = new ArrayList<Questao>();
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	public List<Questao> getListaQuestoes() {
		return listaQuestoes;
	}
	public void setListaQuestoes(List<Questao> listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}
	
}
