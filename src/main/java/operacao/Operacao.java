package operacao;

import interfaces.ITaxas;

import java.io.Serializable;
import java.util.Date;

public abstract class Operacao implements ITaxas, Comparable<Operacao>, Serializable {

    final private static long serialVersionUID = 10001L;

    private Date data;

    private char tipo;

    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s", this.data, this.tipo, this.valor);
    }

    @Override
    public int compareTo(Operacao o) {

        if (this.tipo == 'd' && o.tipo == 's')
            return -1;

        else if (this.tipo == 's' && o.tipo == 'd')
            return 1;

        else
            return 0;
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's')
            this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}