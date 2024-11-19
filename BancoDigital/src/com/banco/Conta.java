package com.banco;

public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " para a conta " + contaDestino.numero + " realizada com sucesso!");
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}