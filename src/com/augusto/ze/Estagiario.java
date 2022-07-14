package com.augusto.ze;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estagiario extends Funcionario {


    Estagiario(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public void calcularPLR() {
        System.out.println(getNome() + " é estagiário não ganha PLR!");
    }

    @Override
    public void calcularFerias() {
        System.out.println("Como " + getNome() + " é estagiário, ele não ganha adicional de férias!");
        System.out.println(getNome() + "é estagiário e ganhou o salário normal de " + getSalario());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localDate = LocalDate.now();

        int diasFerias = 30;

        localDate = localDate.plusDays(diasFerias);
        System.out.println(getNome() + " entrou no recesso!");
        System.out.println(getNome() + " volta do recesso em " + localDate);
    }
}
