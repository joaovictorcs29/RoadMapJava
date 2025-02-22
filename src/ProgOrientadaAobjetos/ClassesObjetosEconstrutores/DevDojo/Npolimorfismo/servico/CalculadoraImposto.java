package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.servico;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Computador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Produto;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    //metodo mais abrangente. Permite a reutilizacao do codigo
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        //verificando se é a mesma instancia
        if (produto instanceof Tomate) {
            //cast de objetos
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
