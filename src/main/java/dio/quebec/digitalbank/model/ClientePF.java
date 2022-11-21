package dio.quebec.digitalbank.model;

import java.time.LocalDate;

import dio.quebec.digitalbank.service.Utilities;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, LocalDate aniversario, String cpf) {
        super(nome, aniversario);
        if (Utilities.validaCNPJ(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (Utilities.validaCNPJ(cpf)) {
            this.cpf = cpf;
        }
    };
}
