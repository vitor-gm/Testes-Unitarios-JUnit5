package org.example.model;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private int cpf;
    private String email;
    private LocalDate nascimento;
    public static int clientes = 0;

    public Cliente(String nome, int cpf, String email, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
        clientes++;
    }

    public boolean Clientes() {
        return clientes > 0;

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

    public static int getClientes() {
        return clientes;
    }
}
