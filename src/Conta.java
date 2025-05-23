public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor){
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor){
    this.saldo += valor;
  }

  @Override
  public void transferir(Conta destino, double valor){
    this.sacar(valor);
    destino.depositar(valor);
  }

  public double getSaldo() {
    return saldo;
  }

  public int getNumero() {
    return numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}
