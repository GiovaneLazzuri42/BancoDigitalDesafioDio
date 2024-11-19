# Sistema Bancário em Java

Este projeto é uma implementação simples de um sistema bancário em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite a criação de contas bancárias do tipo Corrente e Poupança, além de realizar operações básicas como depósito, saque e transferência entre contas.

## Estrutura do Projeto

O projeto é organizado em pacotes para melhor modularização:
com.banco ├── Conta.java # Classe abstrata que define a estrutura básica de uma conta bancária. ├── ContaCorrente.java # Classe que representa uma conta corrente. ├── ContaPoupanca.java # Classe que representa uma conta poupança. com.banco.app └── App.java # Classe principal que executa o programa e realiza operações de teste.

## Funcionalidades

- **Depósito**: Permite adicionar um valor ao saldo da conta.
- **Saque**: Permite retirar um valor do saldo da conta, desde que haja saldo suficiente.
- **Transferência**: Permite transferir um valor de uma conta para outra dentro da mesma instituição.

