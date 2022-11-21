package dio.quebec.digitalbank.model;

import java.util.List;

/*
 * Explicar o motivo de não ter incluido outros campos e citá-los
 */
public class Agencia {
    private String nome;
    private int codigo;
    private int codigo_dv;
    private String endereco;
    private String cidade;
    private String estado;
    private String bairro;
    private String cep;
    private List<Conta> contas;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigo_dv() {
        return codigo_dv;
    }
    public void setCodigo_dv(Integer codigo_dv) {
        this.codigo_dv = codigo_dv;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
