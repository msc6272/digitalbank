package dio.quebec.digitalbank.model;

import java.time.LocalDate;

public abstract class Cliente {
    private String nome;
    private LocalDate aniversario;
    
    public Cliente(String nome, LocalDate aniversario) {
        this.nome = nome;
        this.aniversario = aniversario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getAniversario() {
        return aniversario;
    }
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
}
