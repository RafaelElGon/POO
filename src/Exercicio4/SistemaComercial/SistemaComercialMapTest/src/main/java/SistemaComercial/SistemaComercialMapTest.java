package SistemaComercial;

import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaComercialMapTest {
    @Test
    public void CadastraProdutosTest(){
        SistemaComercialMap sysMap = new SistemaComercialMap();
        Produto p = new Produto("100", "comida", 2.0, 1, CategoriaProduto.ALIMENTO);


        Collection<Produto> alimentos = sysMap.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);

    }
}