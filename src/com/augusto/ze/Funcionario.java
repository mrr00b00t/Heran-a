package com.augusto.ze;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private String nome;
    private String documento;
    private double salario;
    private int faltas;
    private final double MULTIPLICADOR_PLR = 3.00;

    Funcionario(String nome, String documento, double salario) {
        this.nome       = nome;
        this.documento  = documento;
        this.salario    = salario;
    }

    public void calcularPLR() {
        System.out.println(getNome() + " ganhou uma PLR de " + getSalario() * MULTIPLICADOR_PLR);
    }

    public void calcularFerias() {
        System.out.println("Funcionário ganhou (1 + 1/3) do salário, que é: " + (1. + 1./3.)*salario);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localDate = LocalDate.now();

        int diasFerias;
        if (faltas <= 5) diasFerias = 30;
        else if (faltas <= 14) diasFerias = 24;
        else if (faltas <= 23) diasFerias = 18;
        else if (faltas <= 32) diasFerias = 12;
        else {
            System.out.println(nome + " faltou mais que 32 vezes, foi demitido!");
            return;
        }

        localDate = localDate.plusDays(diasFerias);
        System.out.println(nome + " entrou nas férias!");
        System.out.println(nome + " volta das férias em " + localDate);
    }

    public void zerarFaltas() {
        this.faltas = 0;
    }

    public void faltar() {
        this.faltas += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
