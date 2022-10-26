package Questao1AlternativaC;

import Produto;

public class ItemPedidoPilha {
    private Double[] valor = new Double[10];
    private Integer[] quantidade = new Integer[10];
    private Produto[] produto = new Produto[10];
    private Integer topo = null;

    public void empilhar(Integer elemento) {

        if (topo == null) {
            topo = 0;
        }  else {
            topo = topo + 1;
        }

        elementos[topo] = elemento;
    }
}

