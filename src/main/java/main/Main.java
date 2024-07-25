package main;

import entity.Conta;
import entity.ContaCorrente;
import entity.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();
        Conta cc = new ContaCorrente();

        cp.depositar(200);
        cp.imprimirExtrato();
        cp.sacar(50);
        cp.imprimirExtrato();

        cc.depositar(300);
        cc.imprimirExtrato();
        cc.sacar(100);
        cc.imprimirExtrato();
        cc.transferir(50, cp);

        cp.imprimirExtrato();
        cc.imprimirExtrato();

    }
}
