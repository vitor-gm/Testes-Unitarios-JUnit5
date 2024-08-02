package org.example;

import org.example.model.Cliente;

import java.time.LocalDate;


public class Main {

    public static Cliente cliente;

    public static void main(String[] args) {


        cliente = new Cliente("Vitor", "11111111111", "email", LocalDate.of(2012, 5, 9));



    }
}