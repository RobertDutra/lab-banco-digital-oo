package entity;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Etrato Conta Corrente ===");
        super.imprimirInfoComuns();
    }
}
