package model;

import java.time.LocalDate;

/**
 * Author: Lucas Jardim
 */
public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;

    public abstract Integer idade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", nascimento=" + nascimento +"]";
    }


}
