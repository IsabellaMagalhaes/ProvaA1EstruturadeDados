package Questao1_AlternativaA;

public class ItemPedidoListaEncadeada {
    double valor;
    int quantidade;
    Produto produto;
    ItemPedidoListaEncadeada proximo;

    public ItemPedidoListaEncadeada(double vl, int qtd, Produto prd){
        this.valor = vl;
        this.quantidade =  qtd;
        this.produto = prd;
        this.proximo = null;
    }
}
