package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }


    public void imprimeSeminario() {
        System.out.println("\nTema: " + this.titulo);
        System.out.println("Endereço: " + this.local.getEndereco() + ".");
    }

    public void imprimeParticipantes() {
        for (Aluno aluno : alunos) {
            System.out.println("\n--- Aluno --- ");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("-------------");
        }
    }
}
