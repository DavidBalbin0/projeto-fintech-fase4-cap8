package fiap.fintech.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int id;
    private double saldo;
    private List<Transacao> transacoes = new ArrayList<>();




    public Conta(int id) {
        this.id = id;
    }

    public void adicionarTransacao(Transacao transacao) {
        if (transacao instanceof Despesa && Math.abs(transacao.getValor()) > this.saldo) {
            System.out.println("ERRO: A despesa não pode ser maior que o saldo");
        } else {
            transacoes.add(transacao);
            saldo += transacao.getValor();
        }

    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta [id=").append(id).append(", saldo=").append(saldo).append("]\n");
        if (!transacoes.isEmpty()) {
            sb.append("Transações: \n");
            for (Transacao transacao : transacoes) {
                sb.append(transacao).append("\n");
            }
        }

        return sb.toString();

    }
}
