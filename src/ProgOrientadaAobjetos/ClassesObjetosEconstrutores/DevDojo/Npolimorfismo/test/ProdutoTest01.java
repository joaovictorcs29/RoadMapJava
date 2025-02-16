package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Computador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Televisao;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Tomate;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("M1", 5000);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
