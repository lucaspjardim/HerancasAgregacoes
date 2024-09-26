package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Representa uma pessoa física, estendendo a classe abstrata Pessoa.
 * Inclui informações específicas, como CPF, endereço residencial e telefone pessoal.
 *
 * Author: Lucas Jardim
 */
public class PessoaFisica extends Pessoa {

    private String cpf;                // O CPF da pessoa física
    private String enderecoCasa;       // O endereço residencial da pessoa física
    private String telefonePessoal;    // O telefone pessoal da pessoa física

    /**
     * Construtor padrão da classe PessoaFisica.
     */
    public PessoaFisica() {
    }

    /**
     * Construtor da classe PessoaFisica com parâmetros para CPF, endereço e telefone.
     *
     * @param cpf           o CPF da pessoa física
     * @param enderecoCasa  o endereço residencial da pessoa física
     * @param telefonePessoal o telefone pessoal da pessoa física
     */
    public PessoaFisica(String cpf, String enderecoCasa, String telefonePessoal) {
        super();
        this.cpf = cpf;
        this.enderecoCasa = enderecoCasa;
        this.telefonePessoal = telefonePessoal;
    }

    /**
     * Calcula a idade da pessoa física com base na data de nascimento.
     *
     * @return a idade da pessoa em anos, ou null se a data de nascimento não estiver definida
     */
    @Override
    public Integer idade() {
        if (getNascimento() == null) {
            return null; // ou lance uma exceção, se preferir
        }
        // Calculando a idade
        LocalDate hoje = LocalDate.now();
        return Period.between(getNascimento(), hoje).getYears();
    }

    /**
     * Retorna o CPF da pessoa física.
     *
     * @return o CPF da pessoa física
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física.
     *
     * @param cpf o CPF a ser definido
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna o endereço residencial da pessoa física.
     *
     * @return o endereço da pessoa física
     */
    public String getEnderecoCasa() {
        return enderecoCasa;
    }

    /**
     * Define o endereço residencial da pessoa física.
     *
     * @param enderecoCasa o endereço a ser definido
     */
    public void setEnderecoCasa(String enderecoCasa) {
        this.enderecoCasa = enderecoCasa;
    }

    /**
     * Retorna o telefone pessoal da pessoa física.
     *
     * @return o telefone pessoal da pessoa física
     */
    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    /**
     * Define o telefone pessoal da pessoa física.
     *
     * @param telefonePessoal o telefone a ser definido
     */
    public void setTelefonePessoal(String telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }

    /**
     * Calcula o hash code da pessoa física com base no CPF.
     *
     * @return o hash code da pessoa física
     */
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    /**
     * Compara se este objeto é igual a outro objeto.
     *
     * @param obj o objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PessoaFisica other = (PessoaFisica) obj;
        return Objects.equals(cpf, other.cpf);
    }

    /**
     * Retorna uma representação em string da pessoa física, incluindo nome, CPF, endereço, telefone e idade.
     *
     * @return uma string representando a pessoa física
     */
    @Override
    public String toString() {
        return String.format("Pessoa Física:%n" +
                        "Nome: %s %s%n" +
                        "CPF: %s%n" +
                        "Endereço: %s%n" +
                        "Telefone: %s%n" +
                        "Idade: %d anos%n" +
                        "---------------------",
                getNome(), getSobrenome(),
                cpf, enderecoCasa,
                telefonePessoal,
                idade());
    }
}
