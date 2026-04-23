package model;
import java.util.ArrayList;
import java.util.List;


public class Venda {

    private int id_Venda;

    private int PrecoTotal;
    private Produto produto;
    private Cliente cliente; 

    public Venda(int id_Venda , Produto produto , int PrecoTotal , Cliente cliente){
        
        this.id_Venda = id_Venda;
        this.PrecoTotal = PrecoTotal;
        this.produto = produto;
        this.cliente = cliente;
    }


    
}
