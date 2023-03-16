package Exercicio4.SistemaComercial;

import java.util.*;

public class SistemaComercialMap implements SistemaComercial {
    private Map<String, Cliente> clientes;
    /** a chave do Map de clients é o identificador do cliente, obtido por getId()
     */
    private Map<String, Produto> produtos;

    public SistemaComercialMap() {
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }

    @Override //verifica existência de produto
    public boolean existeProduto(Produto produto) {
        return this.produtos.containsKey(produto.getCodigo());
    }

    @Override //pesquisa um produto baseado em seu código
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        if (this.produtos.containsKey(codigoProduto)) {
            return this.produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Não foi encontrado produto com o código " + codigoProduto);
    }

    @Override //cadastra um produto
    public boolean cadastraProduto(Produto produto) {
        if (existeProduto(produto)) {
            return false;
        } else {
            this.produtos.put(produto.getCodigo(), produto);
            return true;
        }
    }
    @Override //verifica existência de cliente no Hashmap
    public boolean existeCliente(Cliente cliente) {
        for(Cliente c: this.clientes.values()){
            if(c.getId().equals(cliente.getId())){
                return true;
            }
        }
        return false;
    }

    @Override //retorna um cliente baseado no seu ID
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        if(this.clientes.containsKey(id)) {
            return this.clientes.get(id);
        }
        throw new ClienteNaoExisteException("Cliente pesquisado não existe");
    }

    @Override //pesquisa produtos baseados na categoria
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        Collection<Produto> produtosDaCategoria = new ArrayList<>();

        for(Produto p: this.produtos.values()){
            if(p.getCategoria().equals(categoria)){
                produtosDaCategoria.add(p);
            }
        }
        return produtosDaCategoria;
    }
}
