import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva uma palavra: ");

        Scanner palavraDigitada = new Scanner(System.in);
        String palavra = palavraDigitada.nextLine();
        String palavraAtual = "";

        for (int i = (palavra.length() - 1); i >= 0; i--){
            palavraAtual += palavra.charAt(i);
        }

        System.out.println(palavraAtual);
    }
}
