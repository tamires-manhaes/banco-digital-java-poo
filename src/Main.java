//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco("Banco de Tamires");
    Cliente cliente = new Cliente("Tamires", "123.456.789-00", "tamires@email.com");
    Cliente outroCliente = new Cliente("Maic", "123.465.645-99", "maic@email.com");

    Conta contaCorrente = new ContaCorrente(cliente);
    Conta contaPoupanca = new ContaPoupanca(outroCliente);

    banco.addConta(contaCorrente);
    banco.addConta(contaPoupanca);

    contaCorrente.depositar(1200);
    contaPoupanca.depositar(1250);

    contaPoupanca.transferir(contaCorrente, 50);

    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();
  }
}