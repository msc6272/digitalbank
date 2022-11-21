package dio.quebec.digitalbank.model;

import java.util.List;
/*
 * Implementar método para listar todas as contas de um cliente, seja PF ou PJ
 * No caso de PJ, poderíamos usar o CPF do responsável legal
 */
public class Banco {
    private String nome;
    private int cnpj;
    private int codigo;
    private List<Agencia> agencias;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCnpj() {
        return cnpj;
    }
    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public List<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}
