package model;

/**
 * Representa uma pessoa jurídica, estendendo a classe abstrata Pessoa.
 * Inclui informações específicas, como CNPJ, endereço, telefone e email.
 *
 * Author: Lucas Jardim
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;        // O CNPJ da pessoa jurídica
    private String endereco;    // O endereço da pessoa jurídica
    private String telefone;    // O telefone da pessoa jurídica
    private String email;       // O email da pessoa jurídica

    /**
     * Construtor padrão da classe PessoaJuridica.
     */
    public PessoaJuridica() {
    }

    /**
     * Construtor da classe PessoaJuridica com parâmetros para CNPJ, endereço, telefone e email.
     *
     * @param cnpj       o CNPJ da pessoa jurídica
     * @param endereco   o endereço da pessoa jurídica
     * @param telefone   o telefone da pessoa jurídica
     * @param email      o email da pessoa jurídica
     */
    public PessoaJuridica(String cnpj, String endereco, String telefone, String email) {
        super();
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Retorna o CNPJ da pessoa jurídica.
     *
     * @return o CNPJ da pessoa jurídica
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     *
     * @param cnpj o CNPJ a ser definido
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Retorna o endereço da pessoa jurídica.
     *
     * @return o endereço da pessoa jurídica
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa jurídica.
     *
     * @param endereco o endereço a ser definido
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna o telefone da pessoa jurídica.
     *
     * @return o telefone da pessoa jurídica
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone da pessoa jurídica.
     *
     * @param telefone o telefone a ser definido
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Retorna o email da pessoa jurídica.
     *
     * @return o email da pessoa jurídica
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email da pessoa jurídica.
     *
     * @param email o email a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna a idade da pessoa jurídica.
     * Como a idade de uma pessoa jurídica não é aplicável, retorna 0.
     *
     * @return sempre 0
     */
    @Override
    public Integer idade() {
        return 0;
    }

    /**
     * Retorna uma representação em string da pessoa jurídica, incluindo nome, CNPJ, endereço, telefone e email.
     *
     * @return uma string representando a pessoa jurídica
     */
    @Override
    public String toString() {
        return String.format("Pessoa Jurídica:%n" +
                        "Nome: %s %s%n" +
                        "CNPJ: %s%n" +
                        "Endereço do Escritório: %s%n" +
                        "Telefone do Escritório: %s%n" +
                        "Email: %s",
                getNome(), getSobrenome(),
                cnpj, endereco,
                telefone,
                email);
    }
}
