package main;

import cliente.*;
import conta.*;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 36, 'm');

        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                new Date(), "000.00000.0000/0001", 25, "Comércio");

        Conta conta1 = new ContaCorrente(1234, joao, 0, 1500);
        Conta conta2 = new ContaPoupanca(12121, lojinha, 10000, 100);
        Conta conta3 = new ContaUniversitaria(23234, lojinha, 345, 100);

        try {
            conta1.serializar(0001);
            System.out.println("Conta serializada com sucesso.");

        } catch (IOException e) {
            System.err.println("Erro ao serializar o objeto Conta.");
            System.err.println(e.getMessage());
        }

        try {
            Conta novaConta1 = Conta.deserializar(0001, 1234);

            System.out.println("Conta desserializada com sucesso.");
            System.out.println(novaConta1);

        } catch (IOException | ClassNotFoundException e) {

            System.err.println("Erro ao desserializar o objeto Aluno.");
            System.err.println(e.getMessage());
        }

    }
}