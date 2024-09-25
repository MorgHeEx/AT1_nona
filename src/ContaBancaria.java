public class ContaBancaria {
  
  private String numeroConta;
  private double saldo;

  public ContaBancaria(String numeroConta, double saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  //depositar
  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido. Deve ser um número positivo.");
    } else {
      this.saldo += valor;
      System.out.println("Depósito realizado com sucesso!");
      System.out.println("Novo saldo: " + this.saldo);
    }
  }

  //sacar
  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido. Deve ser um número positivo.");
    } else if (this.saldo < valor) {
      System.out.println("Saldo insuficiente.");
    } else {
      this.saldo -= valor;
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Novo saldo: " + this.saldo);
    }
  }
  
  //saldo
  public double getSaldo() {
    return this.saldo;
  }

}