package model;

public class Cliente extends Pessoa {


    private int id_cliente;
    private int telefone;

    public Cliente(int id_cliente , String nome, int telefone, int cpf) {

        super(nome, cpf);

        this.id_cliente = id_cliente;
        this.telefone = telefone;
    }

    public Venda efetuarCompra(int idVenda, Produto produto) {

        Venda novaVenda = new Venda(idVenda, produto, this);

        return novaVenda;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente [id_cliente=" + id_cliente + ", telefone=" + telefone + "]";
    }
}