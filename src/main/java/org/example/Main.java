package org.example;

import org.example.model.BancoDeDados;
import org.example.model.Cliente;

import java.time.LocalDate;


public class Main {

    public static Cliente cliente;

    public static void main(String[] args) {

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.clientes.add(cliente);
        cliente = new Cliente("Vitor", "11111111111", "exemplo@gmail.com", LocalDate.of(2000, 5, 9));



    }
}