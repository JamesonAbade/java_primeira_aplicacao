import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner capturaTeclado = new Scanner(System.in); //Biblioteca API que captura interação do teclado
        System.out.println("Digite seu filme Favorito");
        String filme = capturaTeclado.nextLine(); //vai capturar o que digitei e armazenar na variável filme
        System.out.println("Qual ano de Lançamento? ");
        int anoDeLancamento = capturaTeclado.nextInt();
        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = capturaTeclado.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
