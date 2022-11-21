package dio.quebec.digitalbank.service;

/*
 * Links com recursos informando sobre como implementar os métodos abaixo
 * @see <a href="https://www.cpfcnpj.com.br/dev/">Documentação API - CPF.CNPJ</a>
 * @see <a href="http://www.cadcobol.com.br/calcula_cpf_cnpj_caepf.htm">Cálculo digitos de verificação</a>
 * @see <a href="https://www.cjdinfo.com.br/publicacao-calculo-digito-verificador">Cálculo de Dígito Verificador</a>
 * @see <a href="https://www.cjdinfo.com.br/utilitario-calculo-digito-modulo-11">Cálculo Dígito Módulo 11</a>
 * @see <a href="https://www.loja.serpro.gov.br/consultacpf">Procurando automação de acesso a informações atualizadas do Cadastro de Pessoas Físicas (CPF)?</a>
 * @see <a href="https://apicenter.estaleiro.serpro.gov.br/documentacao/consulta-cpf/pt/quick_start/">Como autenticar na API Consulta CPF</a>
 * 
 * Infelizmente o tempo foi curto para implementar tudo que eu gostaria.
 */
public final class Utilities {
    public static int calculaDvMod11(int identificador) {
        //Implementar o cálculo do DV pelo algoritmo MOD11
        //para agência e contas
        return 0;
    }

    public static boolean validaCNPJ(String identificador) {
        //Implementar a validação
        return true;
    }

    public static boolean validaCPF(String identificador) {
        //Implementar a validação
        return true;
    }
}
