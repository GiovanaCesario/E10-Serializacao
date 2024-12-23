package cliente;

import java.util.Date;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    private int numFuncionarios;

    private String setor;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public double cauculaTaxas() {
        return 20;
    }

    @Override
    public String toString() {
        return  "cnpj=" + cnpj + '\n' +
                "numFuncionarios=" + numFuncionarios + '\n'  +
                "setor=" + setor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) o;
            return this.cnpj.equals(pj.getCnpj());
        }
        return false;
    }

    @Override
    public boolean autenticar(String chave) {
        return this.cnpj.equals(chave);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}

