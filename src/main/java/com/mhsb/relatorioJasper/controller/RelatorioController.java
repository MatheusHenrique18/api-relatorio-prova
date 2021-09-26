package com.mhsb.relatorioJasper.controller;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhsb.relatorioJasper.RelatorioService;
import com.mhsb.relatorioJasper.model.Prova;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping(value = "/api/relatorio")
@CrossOrigin(origins = "*")
public class RelatorioController {

	@Autowired
	private RelatorioService relatorioService;
	
	@PostMapping(value = "/gerarPDF")
	private ResponseEntity<String> gerarPDF(HttpServletRequest request, @RequestBody Prova prova) throws FileNotFoundException, JRException{

		return relatorioService.gerarPDF(request, prova);
				
	}
	
}
