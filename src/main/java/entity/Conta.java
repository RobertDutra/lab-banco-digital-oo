package entity;

import interfaces.IConta;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.printf("Agência : %d%n", this.agencia);
        System.out.printf("Número : %d%n", this.numero);
        System.out.printf("Saldo : %.2f%n", this.saldo);
    }
}
