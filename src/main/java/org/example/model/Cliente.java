package org.example.model;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private int cpf;
    private String email;
    private LocalDate nascimento;

    public Cliente(String nome, int cpf, String email, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
    }



    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
