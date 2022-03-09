package Abstattrec.Pessoa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PessoaFisica {

    public static Object set;
    private String nome;

    private Double cpf;

    public String getNome() {
        return nome;


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }
}
