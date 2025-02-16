package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Computador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Produto;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5 5600", 800);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------");
        Produto produto2 = new Tomate("cereja", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
