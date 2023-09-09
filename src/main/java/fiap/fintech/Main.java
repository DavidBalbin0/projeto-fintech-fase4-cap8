package fiap.fintech;

import fiap.fintech.model.*;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       PessoaFisica cliente1 = new PessoaFisica("12345678900", "david",
               "senha", "jd sta rosa", "nova odessa", "sp");

       PessoaJuridica cliente2 = new PessoaJuridica("121234567/000198", "FIAP",
               "senha", "Vila mariana", "SP", "SP");

       Conta conta  = new Conta(01);
       Conta conta2 = new Conta(02);

        Objetivo objetivo = new Objetivo(10000.00, "Viagem", "20/12/2023");
        Objetivo objetivo2 = new Objetivo(5000.00, "fundo emergencial", "31/09/2023");
        objetivo.adicionarSaldo(500.00);
        objetivo.retirarSaldo(250.00);
        objetivo2.adicionarSaldo(500.00);

       cliente1.adicionarConta(conta);
       cliente2.adicionarConta(conta2);

       cliente1.addObjetivo(objetivo);
       cliente1.addObjetivo(objetivo2);

       Transacao receita1 = new Receita(1, "salário", "recebimento", 4000.00, "08/09/2023");
       Transacao receita2 = new Receita(2, "investimento", "dividendos VALE11", 1500.00, "09/09/2023");
       Transacao despesa1 = new Despesa(1, "mercado", "compras do mes", 4001.00, "09/09/2023");
       Transacao despesa2 = new Despesa(1, "FIAP", "mensalidade", 1250.00, "05/09/2023");

       Transacao receita3 = new Receita(3, "mensalidade", "mensalidade joel", 1250.00, "05/09/2023");
       Transacao receita4 = new Receita(4, "mensalidade", "mensalidade david", 1250.00, "06/09/2023");
       Transacao receita5 = new Receita(5, "mensalidade", "mensalidade lucas", 1250.00, "07/09/2023");

       conta.adicionarTransacao(receita1);
       conta.adicionarTransacao(receita2);
       conta.adicionarTransacao(despesa1);
       conta.adicionarTransacao(despesa2);
       conta2.adicionarTransacao(receita3);
       conta2.adicionarTransacao(receita4);
       conta2.adicionarTransacao(receita4);



       System.out.println(conta);
       System.out.println(conta2);
       System.out.println(cliente1);
       System.out.println(receita1);

    }
}