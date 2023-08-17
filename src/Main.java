import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");


        int anoDeLancamento = 2022;

        boolean incluiNoPlano = true;
        double notaDoFilme = 8.1;
        //media calculada pelas 3 notas fornecidas

        double media = (int) (9.8 + 6.3 + 8.0) / 3;
        String sinopse;
        sinopse = """
                Filme: Top Gun: Maverick
                Filme estilo aventura
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        System.out.println("Media nota do Filme " + media);

        int classificacao;
        classificacao = (int) (media /2); //foi feito um cast 'implícito' para transformar o double em inteiro
        System.out.println("esse filme e de " + classificacao + " estrelas");

//        Scanner scanner = new Scanner(System.in); //Instância que solicita entrada do valor da temperatura
//        System.out.println("Digite a temperatura em Celsius");
//        int temperatura = scanner.nextInt();
//        int fahenheit = (int) ((temperatura * 1.8) + 32);
//        System.out.println("A temperatura em fahenheit é " + fahenheit);

//        String nome = "Maria";
//        int idade = 30;
//        double valor = 55.999;
//        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome , idade, valor));



    }
}