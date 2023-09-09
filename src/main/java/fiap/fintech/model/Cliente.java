package fiap.fintech.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String senha;
    private String bairro;
    private String cidade;
    private String estado;

    private Conta conta;

    private List<Objetivo> objetivos = new ArrayList<>();

    public Cliente(String nome, String senha, String bairro, String cidade, String estado) {

        this.nome = nome;
        this.senha = senha;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void adicionarReceita(){

    }

    public void adicionarDespesa(){

    }

    public void adicionarObjetivo(){

    }

    public void adicionarConta(Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Objetivo> getObjetivo() {
        return objetivos;
    }

    public void addObjetivo(Objetivo objetivo){
        this.objetivos.add(objetivo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente [");
        sb.append("nome='").append(nome).append("', ");
        sb.append("bairro='").append(bairro).append("', ");
        sb.append("cidade='").append(cidade).append("', ");
        sb.append("estado='").append(estado).append("', ");
        sb.append("Conta=").append(conta).append(", ");
        sb.append("Objetivos=").append(objetivos);
        sb.append("]");
        return sb.toString();
    }
}
