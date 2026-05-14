package model;
import java.util.ArrayList;
import java.util.List;


public class Produto {
    

    private int id_produto;
    private String status;
    private String dataValidade;
    private String tipoProd;
    private String nomeProd;
    private int quantidade;
    private double preco;
    



    public Produto(int id_produto, String status, String dataValidade , String tipoProd , String nomeProd , int quantidade , double preco){
        
        this.id_produto = id_produto;
        this.status = status;
        this.dataValidade = dataValidade;
        this.tipoProd = tipoProd;
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getIdProduto(){
        return id_produto;
    }

    public String getStatus(){
        return status;
    }

    public String getDataValidade(){
        return dataValidade;

    }
    public String getTipoProd(){
        return tipoProd;
    }

    public String getNomeprod(){
        return nomeProd;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco() {
		return preco;
	}

    
}
