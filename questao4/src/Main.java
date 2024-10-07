public class Main {
    public static void main(String[] args){
        String[] estados = {"sp", "rj", "mg", "es", "outros"};
        double[] valores = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        double soma = 0;
        for (double valor : valores){
            soma += valor;
        }

        for (int i = 0; i < valores.length; i++){
            double porcentagem = (valores[i] / soma) * 100;
            System.out.println(estados[i] + ": " + String.format("%.2f", porcentagem) + "% \n");
        }
    }
}
