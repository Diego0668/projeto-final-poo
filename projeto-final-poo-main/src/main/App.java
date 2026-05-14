package main;   

import java.util.ArrayList;
import java.util.List;

import model.Adega;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;

public class App {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario(1, "Diego", "Gerente", "123", null);
        Funcionario funcionario2 = new Funcionario(2, "Joao", "Gerente", "123", null);
        
        List<Funcionario> listaFunc = new ArrayList<>();
        listaFunc.add(funcionario1);
        listaFunc.add(funcionario2);

        
        

    System.out.println("=== Login do Sistema ===");
    Funcionario.Logar(listaFunc);

    

    }
}
