package Questao1_AlternativaB;
public class ItemPedidoListaDuplamenteEncadeada {
    double valor;
    int quantidade;
    Produto produto;
    ItemPedidoListaDuplamenteEncadeada proximo;
    ItemPedidoListaDuplamenteEncadeada anterior;

    public ItemPedidoListaDuplamenteEncadeada(double vl, int qtd, Produto prd){
        this.valor = vl;
        this.quantidade =  qtd;
        this.produto = prd;
        this.proximo = null;
        this.anterior = null;
    }
}
