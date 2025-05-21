//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Cliente eu = new Cliente();
    Cliente outro = new Cliente();
    outro.setNome("Outro");
    eu.setNome("Tamires");

    Conta contaCorrente = new ContaCorrente(eu);
    contaCorrente.depositar(200);
    Conta contaPoupanca = new ContaPoupanca(outro);
    contaPoupanca.depositar(250);

    contaPoupanca.transferir(contaCorrente, 100);

   contaCorrente.imprimirExtrato();
   contaPoupanca.imprimirExtrato();
  }
}