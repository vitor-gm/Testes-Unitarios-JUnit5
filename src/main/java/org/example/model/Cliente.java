package org.example.model;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private LocalDate nascimento;
    public static int clientes;

    public Cliente(String nome, String cpf, String email, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
        clientes++;
    }

    public int cpf() {
        return cpf.length();
    }

    public boolean clientes() {
        return clientes == 0;

    }

    public boolean maiorDeIdade() {
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(this.nascimento, hoje);
        return idade.getYears() >= 18;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
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
