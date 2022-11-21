package dio.quebec.digitalbank.init;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.quebec.digitalbank.model.Agencia;
import dio.quebec.digitalbank.model.Banco;
import dio.quebec.digitalbank.model.Cliente;
import dio.quebec.digitalbank.model.ClientePF;
import dio.quebec.digitalbank.model.Conta;
import dio.quebec.digitalbank.model.ContaCorrente;
import dio.quebec.digitalbank.model.ContaPoupanca;
import dio.quebec.digitalbank.service.IConta;
import dio.quebec.digitalbank.service.Utilities;

@Component
public class LoadData implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Carregando dados iniciais...");
        
        Cliente joao = new ClientePF("João das Couves", LocalDate.of(2011, 12, 11), "11111111111");

        Conta contaCorrente = new ContaCorrente(joao);
        IConta contaPoupanca = new ContaPoupanca(joao);

        Agencia agencia = new Agencia();
        agencia.setNome("Praça da Sé");
        agencia.setBairro("Centro");
        agencia.setCidade("São Paulo");
        agencia.setEstado("SP");
        agencia.setCodigo(34);
        agencia.setCodigo_dv(Utilities.calculaDvMod11(agencia.getCodigo_dv()));
        agencia.setEndereco("Praça da Sé, s/n");

        Banco banco = new Banco();
        banco.setCodigo(1);
        banco.setNome("Banco do Brasil");

        contaCorrente.depositar(1000);
        contaCorrente.transferir(150, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        
    }
}
