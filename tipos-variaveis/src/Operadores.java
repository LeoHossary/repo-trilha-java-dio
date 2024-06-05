public class Operadores {
  public static void main(String[] args) {
      //--------------------------demonstração de concatenação de strings

      String concatenacao = "?";

      System.out.println(concatenacao); // ?

      concatenacao = 1+1+1+"1"; 

      System.out.println(concatenacao); // 31

      concatenacao = 1+"1"+1+1;

      System.out.println(concatenacao); // 1111

      concatenacao = 1+"1"+1+"1";

      System.out.println(concatenacao); // 1111

      concatenacao = "1"+(1+1+1);

      System.out.println(concatenacao); // 13

      //---------------------------demonstração da alteração de valores de variaveis numerais

      int numero = 5; //numerais já são por convenção positivos sem precisar usar o valor "+".

      System.out.println(numero);

      numero = - numero; // o sinal "-" inverte o valor do numeral

      System.out.println(numero);

      numero = - numero;

      System.out.println(numero); //retornando o valor da variavel para positivo

      //------------------------em casos de repetição

      numero = numero + 2; //quando precisar adicionar valores à variável

      System.out.println(numero);

      numero++; //quando a adição é de apenas +1, pode-se abreviar dessa forma

      System.out.println(numero);

      System.out.println(numero++); //nesse caso impreme-se a variavel e depois adiciona-se +1 a ela.

      System.out.println(numero);

      System.out.println(++numero); //agora primeiro adiciona-se +1 e depois imprime a variável.

      System.out.println(numero--); // os mesmo casos porém decrementando "1";

      System.out.println(numero);
    
      System.out.println(--numero);

      //-----------------------inverter valores booleanos com "!"

      boolean variavel = true;

      System.out.println(!variavel); //imprimindo o valor contrário ao booleano sem alterar o valor propriamente dito

      variavel = !variavel; //inverter o valor do booleano

      System.out.println(variavel);
    }
}
