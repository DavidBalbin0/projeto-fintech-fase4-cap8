package fiap.fintech.model;

public class PessoaJuridica extends Cliente{


    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, String senha, String bairro, String cidade, String estado) {
        super(nome, senha, bairro, cidade, estado);
        this.cnpj = cnpj;
    }
}
