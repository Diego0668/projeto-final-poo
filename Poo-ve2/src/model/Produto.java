package model;
import java.util.ArrayList;
import java.util.List;


public class Produto {
    

    private int id_produto;
    private String status;
    private int dataValidade;
    private String TipoProd;
    private String NomeProd;
    private int quantidade;
    private int preco;



    public Produto(int id_produto, String status, int dataValidade , String TipoProd , String NomeProd , int quantidade , int preco){
        
        this.id_produto = id_produto;
        this.status = status;
        this.dataValidade = dataValidade;
        this.TipoProd = TipoProd;
        this.NomeProd = NomeProd;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    
}
