package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Funcionario extends Pessoa{

    private String id_func;
    private String nome;
    private String cargo;
    private String senha; 
    private List<Produto> estoque;



    public Funcionario (int nome, String cpf, String id_func, String cargo, String senha){
        
        super(cpf, nome);
        this.id_func = id_func;
        
        this.cargo = cargo;
        this.senha = senha;
        this.estoque = new ArrayList<>();

    }
   

    public void CadastrarProd(int id_produto, String status,String dataValidade, String tipoProd, String nomeProd, int quantidade,double preco){

        List<Produto> estoque = new ArrayList<>();

        // Criando alguns produtos
        Produto p1 = new Produto(1, "Ativo", "2026", "Alimento", "Arroz", 10, 25);
        Produto p2 = new Produto(2, "Ativo", "2027", "Limpeza", "Detergente", 5, 5);
        Produto p3 = new Produto(
             1,
             "Ativo",
             "02-2027", 
             "Whisky", 
             "Whisky 2",
             20, 
             90);
    
    }

    public void ListarProd(String nomeProd){
        System.out.println("Nome: " + nomeProd);

    }
    
    public void cadastrarProd(int id_produto, String status, int dataValidade, String tipoProd, String nomeProd, int quantidade, double preco) {

        Produto novoProduto = new Produto(id_produto, status, dataValidade, tipoProd, nomeProd, quantidade, preco);

        this.estoque.add(novoProduto);

        System.out.println("Produto" + nomeProd +" cadastrado com sucesso pelo funcionário "+ this.nome);
    }

    


    public static void Logar(List<Funcionario> lista) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do usuario:");
    String nomeDigitado = scanner.nextLine();

    System.out.println("Digite a senha:");
    String senhaDigitada = scanner.nextLine();

    boolean autenticado = false;

    for (Funcionario f : lista) {

        if (nomeDigitado.equals(f.getNome()) && senhaDigitada.equals(f.getSenha())){
            System.out.println("Login realizado com sucesso! Bem-vindo, " + f.nome);
            autenticado = true;
            break; 
        }
    }

    if (!autenticado) {
        System.out.println("Usuário ou senha incorretos.");
    }
}

    public String getNome() {
        return this.nome;        
    }
    public String getSenha(){
        return this.senha;
    }
     public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Produto> estoque) {
        this.estoque = estoque;
    }


    
}