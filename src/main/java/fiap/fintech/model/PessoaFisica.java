package fiap.fintech.model;

public class PessoaFisica extends Cliente{
    private String cpf;
    public PessoaFisica(String cpf, String nome, String senha, String bairro, String cidade, String estado) {
        super(nome, senha, bairro, cidade, estado);
    }
}
