package model;
import java.util.ArrayList;
import java.util.List;


public class Funcionario {

    private int id_func;
    private String nome;
    private String cargo;
    private String senha;
    private int cpf; 
    private Produto produto;


    public Funcionario (int id_func , String nome , String cargo , String senha , int cpf, Produto produto){
        
        this.id_func = id_func;
        this.nome = nome;
        this.cargo = cargo;
        this.senha = senha;
        this.cpf = cpf;
        this.produto = produto;

    }
   

    public void CadastrarProd(int id_produto, String status,int dataValidade, String tipoProd, String nomeProd, int quantidade,double preco){

        List<Produto> estoque = new ArrayList<>();

        // Criando alguns produtos
        Produto p1 = new Produto(1, "Ativo", 2026, "Alimento", "Arroz", 10, 25);
        Produto p2 = new Produto(2, "Ativo", 2027, "Limpeza", "Detergente", 5, 5);
    
    
    }

    public void ListarProd(String nomeProd){
        System.out.println("Nome: " + nomeProd);

    }


    
}