package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
