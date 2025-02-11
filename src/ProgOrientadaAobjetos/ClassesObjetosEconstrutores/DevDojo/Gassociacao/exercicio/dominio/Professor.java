package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprimeProfessor() {
        System.out.println("\n--- Informações do Professor ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        System.out.println("  -- Ministrando nos Seminários --  ");
        for (Seminario seminario : seminarios) {

            System.out.println("*");
            seminario.imprimeSeminario();
            System.out.print("*\n");
        }
    }
}
