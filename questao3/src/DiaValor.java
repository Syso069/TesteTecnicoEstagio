public class DiaValor {
    private int dia;
    private double valor;


    public DiaValor (int dia, double valor){
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}