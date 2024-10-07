import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Digite um número: ");

        Scanner recebeNumero = new Scanner(System.in);
        int numeroDigitado = recebeNumero.nextInt();
        int numeroAtual = 0;
        int proximoNumero = 1;
        boolean encontrei = false;

        while (numeroAtual <= numeroDigitado){

            if (numeroAtual == numeroDigitado){
                encontrei = true;
                break;
            }

            int soma = numeroAtual + proximoNumero;
            System.out.println(numeroAtual + " + " + proximoNumero + " = " + soma);
            numeroAtual = proximoNumero;
            proximoNumero = soma;
        }

        if (encontrei){
            System.out.println("\nO número: " + numeroDigitado + " pretence a sequência de Fibonacci!");
        }else{
            System.out.println("\nO número: " + numeroDigitado + " NÃO pretence a sequência de Fibonacci!");
        }
    }
}
