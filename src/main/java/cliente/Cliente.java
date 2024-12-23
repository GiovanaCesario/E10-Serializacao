package cliente;

import interfaces.ITaxas;

import java.io.Serializable;
import java.util.Date;

public abstract class Cliente implements ITaxas, Serializable {

    final private static long serialVersionUID = 10001L;

    private String nome;

    private String endereco;

    private Date data;

    public Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }

    public abstract boolean autenticar(String chave);

    public void imprimir() {
        System.out.println("CLIENTE INVALIDO!");
    }

    @Override
    public String toString() {
        return "nome = " + nome + '\n' +
                "endereco = " + endereco + '\n' +
                "data = " + data + '\n';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
