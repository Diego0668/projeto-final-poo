package model;
import java.util.ArrayList;
import java.util.List;


public class Venda {

    private int id_Venda;

    private double precoTotal;
    private Produto produto;
    private Cliente cliente; 

    public Venda(int id_Venda , Produto produto , double precoTotal , Cliente cliente){
        
        this.id_Venda = id_Venda;
        this.precoTotal = precoTotal;
        this.produto = produto;
        this.cliente = cliente;
        this.calcularTotal();
    }

    public void calcularTotal(){
    this.precoTotal = this.produto.getPreco() * this.produto.getQuantidade();    

}


    
}
