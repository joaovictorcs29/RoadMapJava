package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Bintroducaometodos.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
