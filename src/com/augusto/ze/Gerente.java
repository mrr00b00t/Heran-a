package com.augusto.ze;

public class Gerente extends Funcionario {
    private final double MULTIPLICADOR_PLR = 4.00;

    Gerente(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public void calcularPLR() {
        System.out.println(getNome() + " ganhou uma PLR de " + getSalario() * MULTIPLICADOR_PLR);
    }
}
