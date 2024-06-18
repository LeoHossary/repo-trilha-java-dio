package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
  public void adicionarLancheNoBalcao() {
    System.out.println("ADICONANDO LANCHE NATURAL NO BALCÃO");
  }
  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCÃO");
  }
  public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }
  public void prepararLanche() {
    System.out.println("PREPARANDO LANCHE");
  }
  public void prepararVitamina() {
    System.out.println("PREPARANDO VITAMINA");
  }
  public void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }
  public void selecionarIngedientesLanche() {
    System.out.println("SELECIONANDO O PÃO, SALADA, CARNE E QUEIJO");
  }
  public void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO FRUTA, LEITE E AÇUCAR");
  }
  public void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }
  public void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
  }
  public void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E OVO NA CHAPA");
  }
  public void pedirParaTrocarGas(Atendente meuAmigo) {
    meuAmigo.trocarGas();
  }
  public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }
  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
