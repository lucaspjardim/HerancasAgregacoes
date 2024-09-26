import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("João");
        pf.setSobrenome("Silva");
        pf.setCpf("123.456.789-00");
        pf.setEnderecoCasa("Rua das Flores, 123, Bloco A, Ap 101");
        pf.setTelefonePessoal("(11) 98765-4321");
        pf.setNascimento(LocalDate.of(1990, 5, 15));

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa Exemplo");
        pj.setCnpj("12.345.678/0001-99");
        pj.setEndereco("Avenida Paulista, 1000, 10º Andar");
        pj.setTelefone("(11) 4000-3000");
        pj.setEmail("contato@empresaexemplo.com");

        printPessoa(pf);
        printPessoa(pj);
    }

    private static void printPessoa(Pessoa p) {
        System.out.println(p);
    }
}
