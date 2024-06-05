public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Leonardo Hossary de Sousa"; //variável do tipo String(texto)

        System.out.println(nomeCompleto);

        double salarioMinimo = 1400.50; //variavel do tipo Duplo(aceita números fracionados)

        System.out.println(salarioMinimo);

        short numeroCurto = 1; //variável do tipo Inteiro que aceita valores até 32.000
        int numeroNormal = numeroCurto; //variável do tipo inteiro que aceita valores acima de 32.000
        short numeroCurto2 = (short) numeroNormal; //fazendo variável do tipo Short aceitar variável do tipo int

        System.out.println(numeroCurto2);

        int numero = 5;

        System.out.println(numero);
        
        numero = 10; //mostrando que variável do tipo inteiro pode ser alterada
        
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //usando o "final" para fazer uma constante imutável

        System.out.print(VALOR_DE_PI);

        long cpf = 12345678900L; //variável do tipo longo finaliza com o "L"

        System.out.println(cpf);

        boolean verdadeiro = true;

        System.out.print(verdadeiro);

    }
}
