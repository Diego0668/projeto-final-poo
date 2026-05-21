package main;   

import model.Adega;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;

public class App {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario(1, "Diego", "Chefe", "123", null);
        Funcionario funcionario2 = new Funcionario(2, "Joao", "Chefe", "123", null);
        
        
        

    System.out.println("=== Login do Sistema ===");
    Funcionario.Logar();

    }
}
