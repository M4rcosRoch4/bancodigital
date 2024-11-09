package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");

        Conta cc = new ContaCorrente(marcos);
        Conta cp = new ContaPoupanca(marcos);

        cc.depositar(100);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
