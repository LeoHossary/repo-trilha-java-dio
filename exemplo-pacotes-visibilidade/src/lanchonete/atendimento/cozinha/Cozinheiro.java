package lanchonete.atendimento.cozinha;

public class Cozinheiro {
  public void adicionarLancheNoBalcao() {
    prepararLanche();
    System.out.println("ADICONANDO LANCHE NATURAL NO BALCÃO");
  }
  public void adicionarSucoNoBalcao() {
    prepararVitamina();
    System.out.println("ADICIONANDO SUCO NO BALCÃO");
  }
  public void adicionarComboNoBalcao() {
    prepararCombo();
    System.out.println("ADICIONANDO COMBO NO BALCÃO");
  }
  private void prepararLanche() {
    selecionarIngedientesLanche();
    lavarIngredientes();
    fritarIngredientesLanche();
    System.out.println("PREPARANDO LANCHE");
  }
  private void prepararVitamina() {
    selecionarIngredientesVitamina();
    lavarIngredientes();
    baterVitaminaLiquidificador();
    System.out.println("PREPARANDO VITAMINA");

  }
  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }
  private void selecionarIngedientesLanche() {
    System.out.println("SELECIONANDO O PÃO, SALADA, CARNE E QUEIJO");
  }
  private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO FRUTA, LEITE E AÇUCAR");
  }
  private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }
  private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
  }
  private void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E OVO NA CHAPA");
  }
  void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }
  void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
