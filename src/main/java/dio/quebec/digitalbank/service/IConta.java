package dio.quebec.digitalbank.service;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    //Poderia ser modificado para imprimir TODAS ou agumas operações
    void imprimirExtrato();
}
