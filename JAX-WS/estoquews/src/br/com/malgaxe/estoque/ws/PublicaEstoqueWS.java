package br.com.malgaxe.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	public static void main(String[] args) {
		EstoqueWS implementacaoEstoqueWs = new EstoqueWS();
		String URL = "http://localhost:8080/estoquews";
		
		System.out.println("Estoque rodando: "+ URL);
		
		//associando URL com a implementação
		Endpoint.publish(URL, implementacaoEstoqueWs);

	}

}
