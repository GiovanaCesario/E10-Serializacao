package conta;

import cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) throws IllegalArgumentException{

        if (limite < -100)
            throw new IllegalArgumentException("Limite fora dos parametros de uma conta corrente (< -100)");

        super.limite = limite;
    }

    @Override
    public double cauculaTaxas() {
        return getDono().cauculaTaxas();
    }
}
