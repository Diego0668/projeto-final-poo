package model;

public class Venda {

    private int id_Venda;
    private double precoTotal;
    private Produto produto;
    private Cliente cliente;

    public Venda(int id_Venda, Produto produto, Cliente cliente){

        this.id_Venda = id_Venda;
        this.produto = produto;
        this.cliente = cliente;

        this.calcularTotal();
    }

    public void calcularTotal(){

        this.precoTotal = this.produto.getPreco() * this.produto.getQuantidade();

    }
    @Override
public String toString() {

    return "Venda ID: " + id_Venda + "\nCliente: " + cliente + "\nProduto: " + produto + "\nTotal: R$ " + precoTotal;
}
}