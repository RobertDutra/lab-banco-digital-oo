package entity;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Etrato Conta Poupança ===");
        super.imprimirInfoComuns();
    }
}
