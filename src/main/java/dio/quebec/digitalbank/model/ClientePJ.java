package dio.quebec.digitalbank.model;

import java.time.LocalDate;

import dio.quebec.digitalbank.service.Utilities;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, LocalDate aniversario, String cnpj) {
        super(nome, aniversario);
        if (Utilities.validaCNPJ(cnpj)) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ Inválido!");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (Utilities.validaCNPJ(cnpj)) {
            this.cnpj = cnpj;
        }
    }
}
