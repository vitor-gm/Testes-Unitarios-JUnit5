package org.example;

import org.example.model.Cliente;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Cliente cliente;

    public static void main(String[] args) {

        cliente = new Cliente("v", 123456789, "email", LocalDate.of(2012, 5, 9));



    }
}