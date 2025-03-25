public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        // A convenção é que variáveis sejam escritas em camelCase
        // Exemplo: salarioMinimo, valorTotal, numeroDeAlunos
        // O Java é case sensitive, ou seja, ele diferencia letras maiúsculas de minúsculas

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2  = (short) numeroNormal;
        // o numeroCurto2 vai receber o valor de numeroNormal (= 1), mas como ele é short, é necessário fazer um cast = (short).
        // Caso o valor de numeroNormal fosse maior que o valor máximo de short, haveria perda de informação.


        int numero = 5;
        numero = 10;
        // O valor de numero foi alterado de 5 para 10, pois variaveis podem ser reatribuídas. 
        // O valor de uma variável pode ser alterado quantas vezes forem necessárias.

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
        // O valor de VALOR_DE_PI não pode ser alterado, pois foi declarado como final. 
        // "final" é uma palavra reservada que indica que o valor da variável não pode ser alterado, ou seja, ela é constante.

        System.out.print(VALOR_DE_PI);

    }
}
