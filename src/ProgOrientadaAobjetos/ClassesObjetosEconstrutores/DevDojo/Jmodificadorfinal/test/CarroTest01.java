package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Jmodificadorfinal.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Jmodificadorfinal.dominio.Carro;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Jmodificadorfinal.dominio.Comprador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Alonso");
        ferrari.imprime();
    }
}
