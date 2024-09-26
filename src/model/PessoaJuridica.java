package model;

/**
 * Author: Lucas Jardim
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String endereco, String telefone, String email) {
        super();
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Integer idade() {
        return 0;
    }

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
