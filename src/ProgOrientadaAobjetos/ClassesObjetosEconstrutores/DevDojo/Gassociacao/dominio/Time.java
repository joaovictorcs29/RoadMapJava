package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio;

public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
    }
}
