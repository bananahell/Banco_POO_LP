
public class ContaBonificada extends Conta {

  private double bonus;

  public ContaBonificada(String numero, Cliente cliente) {
    super(numero, cliente);
  }

  public void renderBonus() {
    super.creditar(this.bonus);
    this.bonus = 0;
  }

  public double getBonus() {
    return this.bonus;
  }

  public void creditar(double valor) {
    this.bonus = this.bonus + (valor * 0.01);
    super.creditar(valor);
  }

}