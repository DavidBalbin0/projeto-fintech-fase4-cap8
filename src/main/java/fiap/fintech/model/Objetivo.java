package fiap.fintech.model;

public class Objetivo {
    private double meta;
    private  String nomeObjetivo;
    private String data;
    private double saldo;

    public Objetivo(double meta, String nomeObjetivo, String data) {
        this.meta = meta;
        this.nomeObjetivo = nomeObjetivo;
        this.data = data;
    }

    public double calcularProgresso(){
        return  (saldo / meta ) * 100;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }
    public void retirarSaldo(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return  "Objetivo [meta= "+meta+", objetivo= "+nomeObjetivo+"," +
                " data= "+data+" , saldo= "+saldo+" , progresso= "+calcularProgresso()+"% ]";
    }
}
