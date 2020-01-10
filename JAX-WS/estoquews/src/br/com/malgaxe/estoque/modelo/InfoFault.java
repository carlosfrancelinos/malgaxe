package br.com.malgaxe.estoque.modelo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private Date dataErro;
	private String mensagem;
	
	public InfoFault(String mensagem, Date dataErro) {
		super();
		this.dataErro = dataErro;
		this.mensagem = mensagem;
	}
	
	

	public InfoFault() {
		
	}



	public Date getDataErro() {
		return dataErro;
	}

	public void setDataErro(Date dataErro) {
		this.dataErro = dataErro;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}	

}
