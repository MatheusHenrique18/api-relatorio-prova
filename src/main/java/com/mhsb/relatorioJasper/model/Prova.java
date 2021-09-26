package com.mhsb.relatorioJasper.model;

import java.util.ArrayList;
import java.util.List;

public class Prova {
	
	private String professor;
	private String descricaoProva;
	private List<Materia> listaMaterias = new ArrayList<Materia>();
	
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getDescricaoProva() {
		return descricaoProva;
	}
	public void setDescricaoProva(String descricaoProva) {
		this.descricaoProva = descricaoProva;
	}
	public List<Materia> getListaMaterias() {
		return listaMaterias;
	}
	public void setListaMaterias(List<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}
	
}
