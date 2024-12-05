package conta;

import cliente.Cliente;

public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) throws IllegalArgumentException{

        if (limite > 500 || limite < 0)
            throw new IllegalArgumentException("Limite fora dos parametros de uma conta universitaria (< 0 ou > 500)");

        super.limite = limite;
    }

    @Override
    public double cauculaTaxas() {
        return 0;
    }
}

