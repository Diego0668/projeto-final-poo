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
    



    public Produto(int id_produto, String status, String dataValidade2 , String tipoProd , String nomeProd , int quantidade , double preco){
        
        this.id_produto = id_produto;
        this.status = status;
        this.dataValidade = dataValidade2;
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
    public void exibirProduto() {
    System.out.println("---------- PRODUTO ----------");
    System.out.println("ID: " + this.id_produto);
    System.out.println("Nome: " + this.nomeProd);
    System.out.println("Tipo: " + this.tipoProd);
    System.out.println("Preço: R$ " + this.preco);
    System.out.println("Estoque: " + this.quantidade + " unidades");
    System.out.println("-----------------------------");
}
    public void listarEstoque(List<Produto> estoque) {
    System.out.println("=== RELATÓRIO DE ESTOQUE ===");
    for (Produto p : estoque) {

        p.exibirProduto(); 
    }
}
@Override
public String toString() {

    return "Nome: " + nomeProd +", Tipo: " + tipoProd +", Quantidade: " + quantidade +", Preço: R$ " + preco;
}


    
}
