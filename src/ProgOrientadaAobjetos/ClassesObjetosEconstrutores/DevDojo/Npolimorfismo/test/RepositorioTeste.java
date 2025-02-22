package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.repositorio.Repositorio;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
