package dio.quebec.digitalbank.model;

import dio.quebec.digitalbank.service.IConta;
import dio.quebec.digitalbank.service.Utilities;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENTIAL = 1;

    protected int agencia;
    protected int numero;
    protected int numero_dv;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENTIAL++;
        this.numero_dv = Utilities.calculaDvMod11(numero);
        this.cliente = cliente;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d-%d", this.numero, this.numero_dv));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public int getNumero_dv() {
        return numero_dv;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
}
