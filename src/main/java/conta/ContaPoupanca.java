package conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) throws IllegalArgumentException{

        if (limite > 1000 || limite < 100)
            throw new IllegalArgumentException("Limite fora dos parametros de uma conta poupanca (< 100 ou > 1000)");

        super.limite = limite;
    }

    @Override
    public double cauculaTaxas() {
        return 0;
    }
}

