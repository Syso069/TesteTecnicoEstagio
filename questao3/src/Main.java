import java.io.IOException;

public class Main {
    public void main() throws IOException {
        verificaMaiorEMenorValor();
    }

    public void verificaMaiorEMenorValor() throws IOException {
        LerJson lerJson = new LerJson();
        ImprimeNaTela imprimeNaTela = new ImprimeNaTela();

        double maiorValor = Double.MIN_VALUE;
        double menorValor = Double.MAX_VALUE;
        double somaMensal = 0;
        int diaValorMaior = 0;
        int diaValorMenor = 0;
        int somaDias = 0;

        for (DiaValor item : lerJson.diaValores) {
            if (item.getValor() > maiorValor) {
                maiorValor = item.getValor();
                diaValorMaior = item.getDia();
            }
            if (item.getValor() > 0 && item.getValor() < menorValor) {
                menorValor = item.getValor();
                diaValorMenor = item.getDia();
            }
            somaMensal += item.getValor();
        }
        somaMensal /= 30;

        for (DiaValor item : lerJson.diaValores) {
            if (item.getValor() > somaMensal) {
                somaDias++;
            }
        }
        imprimeNaTela.exibeNaTela(maiorValor, menorValor, diaValorMaior, diaValorMenor, somaDias);
    }
}