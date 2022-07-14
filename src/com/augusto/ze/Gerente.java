package com.augusto.ze;

public class Gerente extends Funcionario {


    Gerente(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public void calcularPLR() {
        double MULTIPLICADOR_CARGO_NAO_TECNICO = 2.1;
        double ADICIONAL_GERENCIA = 10000;
        System.out.println(getNome() + " ganhou uma PLR de " + (MULTIPLICADOR_CARGO_NAO_TECNICO*getSalario() + ADICIONAL_GERENCIA));
    }
}
