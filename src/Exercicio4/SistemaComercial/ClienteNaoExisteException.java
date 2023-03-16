package Exercicio4.SistemaComercial;

public class ClienteNaoExisteException extends Exception{
    public ClienteNaoExisteException(String msg){
        super(msg);
    }
}
