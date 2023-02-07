package com.mhsb.relatorioJasper;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mhsb.relatorioJasper.model.Prova;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Service
public class RelatorioService {
	
	public ResponseEntity<String> gerarPDF(HttpServletRequest request, @RequestBody Prova prova) throws FileNotFoundException, JRException{

//		final ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//		System.out.println("***abaixo***");
//		System.out.println(servletContext);
		
		//File arquivo = ResourceUtils.getFile("classpath:relatoriousuarios.jrxml");
		InputStream relatorioProva = Prova.class.getResourceAsStream("/relProva.jasper");
		
		
		InputStream subRelatorioMateria = Prova.class.getResourceAsStream("/relMateria.jasper");
		JasperReport relatorioMateria = (JasperReport)JRLoader.loadObject(subRelatorioMateria);
		
		InputStream subRelatorioQuestao = Prova.class.getResourceAsStream("/relQuestao.jasper");
		JasperReport relatorioQuestao = (JasperReport)JRLoader.loadObject(subRelatorioQuestao);
		
		InputStream subRelatorioAlternativa = Prova.class.getResourceAsStream("/relatorioAlternativa.jasper");
		JasperReport relatorioAlternativa = (JasperReport)JRLoader.loadObject(subRelatorioAlternativa);
		
//		JasperReport jasper = JasperCompileManager.compileReport(arquivo);
		
//		InputStream suprepo = getClass().getResourceAsStream("LinuxTest_subreport1.jasper");
//		JasperReport subJasperReport = (JasperReport)JRLoader.loadObject(suprepo);
		
		List<Prova> listaProva = new ArrayList<Prova>();
		listaProva.add(prova);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listaProva);
		byte[] btPDF;
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("relatorioMateria", relatorioMateria);
		parameters.put("relatorioQuestao", relatorioQuestao);
		parameters.put("relatorioAlternativa", relatorioAlternativa);
		
		JasperPrint print = JasperFillManager.fillReport(relatorioProva, parameters, dataSource);
		
		btPDF = JasperExportManager.exportReportToPdf(print);
		
		//convertendo de byte para binário de base 64
		StringBuilder sb = new StringBuilder();
		sb.append(DatatypeConverter.printBase64Binary(btPDF));

		String resposta = sb.toString();
		
		return ResponseEntity.ok(resposta);
				
	}

}
