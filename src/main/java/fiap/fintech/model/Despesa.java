package fiap.fintech.model;

public class Despesa extends Transacao{

    public Despesa(int id, String nome, String descricao, double valor, String data) {
        super(id, nome, descricao, valor, data);
    }

    public void validarDespesas(){

    }

    @Override
    public double getValor() {
        return -super.getValor();
    }
}
