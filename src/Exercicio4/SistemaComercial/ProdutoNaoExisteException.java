package Exercicio4.SistemaComercial;

public class ProdutoNaoExisteException extends Exception{
    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
