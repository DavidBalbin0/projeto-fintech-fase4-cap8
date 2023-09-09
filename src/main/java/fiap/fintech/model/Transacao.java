package fiap.fintech.model;

import java.util.Date;

public abstract class Transacao {

    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private String data;

    public Transacao(int id, String nome, String descricao, double valor, String data) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return "Transacao [nome = " + nome + " descricao=" + descricao + ", valor=" + valor + " Data = "+ data +" ]";
    }

}
