public class ImprimeNaTela {
    public void exibeNaTela(double maiorValor, double menorValor, int diaValorMaior, int diaMenorValor, int somaDias) {
        System.out.println("Maior valor: " + String.format("%.2f", maiorValor) + " dia: " + diaValorMaior);
        System.out.println("Menor valor: " + String.format("%.2f", menorValor) + " dia: " + diaMenorValor);
        System.out.println("Dias maior que faturamento mensal: " + somaDias + " dias.");
    }
}
