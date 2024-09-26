package model;

import java.time.LocalDate;

/**
 * Representa uma pessoa, fornecendo informações básicas como nome, sobrenome e data de nascimento.
 * Esta classe é abstrata e deve ser estendida por outras classes que implementem o método idade().
 *
 * Author: Lucas Jardim
 */
public abstract class Pessoa {
    private String nome;          // O nome da pessoa
    private String sobrenome;     // O sobrenome da pessoa
    private LocalDate nascimento; // A data de nascimento da pessoa

    /**
     * Retorna a idade da pessoa.
     * Este método deve ser implementado pelas subclasses.
     *
     * @return a idade da pessoa em anos
     */
    public abstract Integer idade();

    /**
     * Retorna o nome da pessoa.
     *
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome o nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o sobrenome da pessoa.
     *
     * @return o sobrenome da pessoa
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     *
     * @param sobrenome o sobrenome a ser definido
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Retorna a data de nascimento da pessoa.
     *
     * @return a data de nascimento da pessoa
     */
    public LocalDate getNascimento() {
        return nascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     *
     * @param nascimento a data de nascimento a ser definida
     */
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Retorna uma representação em string da pessoa, incluindo nome, sobrenome e data de nascimento.
     *
     * @return uma string representando a pessoa
     */
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", nascimento=" + nascimento + "]";
    }
}
