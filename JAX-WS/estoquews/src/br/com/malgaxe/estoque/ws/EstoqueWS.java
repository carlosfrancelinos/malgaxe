package br.com.malgaxe.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.malgaxe.estoque.exceptions.AutorizacaoException;
import br.com.malgaxe.estoque.modelo.item.Filtro;
import br.com.malgaxe.estoque.modelo.item.Filtros;
import br.com.malgaxe.estoque.modelo.item.Item;
import br.com.malgaxe.estoque.modelo.item.ItemDao;
import br.com.malgaxe.estoque.modelo.item.ItemValidador;
import br.com.malgaxe.estoque.modelo.item.ListaItens;
import br.com.malgaxe.estoque.modelo.usuario.TokenDao;
import br.com.malgaxe.estoque.modelo.usuario.TokenUsuario;

@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	@WebMethod(operationName = "todosOsItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name = "item")
	@RequestWrapper(localName="listaItem")
	public ListaItens getItens(@WebParam(name ="filtros")Filtros filtros){
		System.out.println("Chamando getItens()");
		List<Filtro> lista = filtros.getLista();
		List<Item> result = dao.todosItens(lista);
		return  new ListaItens(result);
	}
	
	@WebMethod(operationName = "CadastrarItem")
	public Item cadastrarItem(@WebParam(name="tokenUsuario", header = true) TokenUsuario token, @WebParam(name="item") Item item) throws AutorizacaoException {
		
		System.out.println("Cadastrando "+ item + ", " + token);
		
		if(!new TokenDao().ehValido(token))
			throw new AutorizacaoException("Autorizacao falhou");
		
		new ItemValidador(item).validate();
		
		this.dao.cadastrar(item);		
		
		return item;
	}

}
