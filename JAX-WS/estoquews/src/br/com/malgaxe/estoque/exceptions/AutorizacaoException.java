package br.com.malgaxe.estoque.exceptions;

import java.util.Date;

import javax.xml.ws.WebFault;

import br.com.malgaxe.estoque.modelo.InfoFault;

@WebFault(name="AutorizacaoFault" , messageName = "AutorizacaoFault")
public class AutorizacaoException extends Exception {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -1598278293722388468L;

	public AutorizacaoException(String mensagem) {
		super(mensagem);
	}
	
	public InfoFault getFaultInfo() {
		return new InfoFault("Token inválido", new Date());
	}
}
