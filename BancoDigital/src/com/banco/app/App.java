package com.banco.app;

import com.banco.ContaCorrente;
import com.banco.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345");
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890");

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
    }
}