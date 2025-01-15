package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.EstruturaClasse;


// Estrutura de uma Classe em Java
public class Carro {
    // Atributos (Propriedades)
    String modelo;
    int ano;
    double preco;

    // Metodos (Comportamentos)
    public void exibirInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preco: R$ " + preco);
    }
}
