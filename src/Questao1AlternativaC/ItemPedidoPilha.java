package Questao1AlternativaC;

class ItemPedidoPilha {
    private Double[] valor = new Double[10];
    private Integer[] quantidade = new Integer[10];
    private Produto[] produto = new Produto[10];
    private int topo;
    private int tam_max;

    public ItemPedidoPilha(int n) {
        valor = new Double[n];
        quantidade = new Integer[n];
        produto = new Produto[n];
        topo = 0;
    }
    
}

