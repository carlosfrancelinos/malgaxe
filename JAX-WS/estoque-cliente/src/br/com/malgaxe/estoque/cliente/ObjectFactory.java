
package br.com.malgaxe.estoque.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.malgaxe.estoque.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "AutorizacaoFault");
    private final static QName _ListaItem_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "listaItem");
    private final static QName _ListaItens_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "listaItens");
    private final static QName _Item_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "item");
    private final static QName _Itens_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "itens");
    private final static QName _TokenUsuario_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "tokenUsuario");
    private final static QName _CadastrarItemResponse_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "CadastrarItemResponse");
    private final static QName _Filtros_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "filtros");
    private final static QName _CadastrarItem_QNAME = new QName("http://ws.estoque.malgaxe.com.br/", "CadastrarItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.malgaxe.estoque.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Itens }
     * 
     */
    public Itens createItens() {
        return new Itens();
    }

    /**
     * Create an instance of {@link InfoFault }
     * 
     */
    public InfoFault createInfoFault() {
        return new InfoFault();
    }

    /**
     * Create an instance of {@link ListaItem }
     * 
     */
    public ListaItem createListaItem() {
        return new ListaItem();
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link CadastrarItem }
     * 
     */
    public CadastrarItem createCadastrarItem() {
        return new CadastrarItem();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link CadastrarItemResponse }
     * 
     */
    public CadastrarItemResponse createCadastrarItemResponse() {
        return new CadastrarItemResponse();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "AutorizacaoFault")
    public JAXBElement<InfoFault> createAutorizacaoFault(InfoFault value) {
        return new JAXBElement<InfoFault>(_AutorizacaoFault_QNAME, InfoFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "listaItem")
    public JAXBElement<ListaItem> createListaItem(ListaItem value) {
        return new JAXBElement<ListaItem>(_ListaItem_QNAME, ListaItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "itens")
    public JAXBElement<Itens> createItens(Itens value) {
        return new JAXBElement<Itens>(_Itens_QNAME, Itens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "tokenUsuario")
    public JAXBElement<TokenUsuario> createTokenUsuario(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_TokenUsuario_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "CadastrarItemResponse")
    public JAXBElement<CadastrarItemResponse> createCadastrarItemResponse(CadastrarItemResponse value) {
        return new JAXBElement<CadastrarItemResponse>(_CadastrarItemResponse_QNAME, CadastrarItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.malgaxe.com.br/", name = "CadastrarItem")
    public JAXBElement<CadastrarItem> createCadastrarItem(CadastrarItem value) {
        return new JAXBElement<CadastrarItem>(_CadastrarItem_QNAME, CadastrarItem.class, null, value);
    }

}
