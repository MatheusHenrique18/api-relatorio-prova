package com.mhsb.relatorioJasper.model;

import java.util.*;

public class Questao {

	private String descricaoQuestao;
	private List<Alternativa> listaAlternativas = new ArrayList<Alternativa>();
	
	public String getDescricaoQuestao() {
		return descricaoQuestao;
	}
	public void setDescricaoQuestao(String descricaoQuestao) {
		this.descricaoQuestao = descricaoQuestao;
	}
	public List<Alternativa> getListaAlternativas() {
		return listaAlternativas;
	}
	public void setListaAlternativas(List<Alternativa> listaAlternativas) {
		this.listaAlternativas = listaAlternativas;
	}
	
}
