package br.com.karanalpe.integrando.sb.jsf.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexMB {
	
	public String imprimirMensagem() {
		return "Olá JSF";
	}

}
