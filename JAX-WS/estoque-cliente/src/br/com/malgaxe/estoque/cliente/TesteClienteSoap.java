package br.com.malgaxe.estoque.cliente;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TesteClienteSoap {
	
	public static void main(String[] args) throws MalformedURLException {
		primeiraChamada();
		segundaChamada();		
	}
	
	private static void segundaChamada() throws MalformedURLException {
		URL url = new URL("http://localhost:8080/estoquews?wsdl");
		QName qName = new QName("http://ws.estoque.malgaxe.com.br/", "EstoqueWSService");
		
		Service service = Service.create(url,qName);
		
		EstoqueWS cliente = service.getPort(EstoqueWS.class);
		
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		ListaItem listaItem = new ListaItem();
		
		listaItem.setFiltros(filtros);
		
		Itens listaItens = cliente.todosOsItens(listaItem);
		
		listaItens.getItem().item.forEach(i -> System.out.println(i.getNome()));
	}

	private static void primeiraChamada() {
		EstoqueWS cliente = new EstoqueWSService().getEstoqueWSPort();
		System.out.println(cliente);
		
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		ListaItem listaItem = new ListaItem();
		
		listaItem.setFiltros(filtros);
		
		Itens listaItens = cliente.todosOsItens(listaItem);
		
		System.out.println("Resposta do serviço: "+ listaItens);
	}

}
