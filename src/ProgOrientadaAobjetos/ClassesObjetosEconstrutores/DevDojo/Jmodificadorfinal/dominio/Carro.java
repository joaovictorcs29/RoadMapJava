package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();//Significa que a referencia Comprador desse objeto nunca pode ser alterada

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
