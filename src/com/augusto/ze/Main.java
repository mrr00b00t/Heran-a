package com.augusto.ze;

public class Main {

    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario("Jose Augusto", "12345678909", 1254.00);
        Gerente gerente1 = new Gerente("Juliano", "90987654321", 11223.00);

        gerente1.faltar();
        gerente1.faltar();
        gerente1.faltar();
        gerente1.faltar();
        gerente1.faltar();
        gerente1.faltar();
        gerente1.calcularPLR();
        gerente1.calcularFerias();

        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.faltar();
        estagiario1.calcularPLR();
        estagiario1.calcularFerias();
    }
}
