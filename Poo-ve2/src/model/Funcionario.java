
package model;
import java.util.ArrayList;
import java.util.List;


public class Funcionario {

    private int id_func;
    private String nome;
    private String cargo;
    private String senha;
    private int cpf; 

    public Funcionario (int id_func , String nome , String cargo , String senha , int cpf){
        
        this.id_func = id_func;
        this.nome = nome;
        this.cargo = cargo;
        this.senha = senha;
        this.cpf = cpf;

    }


    
}