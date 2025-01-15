package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExemploObjetos;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.EstruturaClasse.Carro;

//No lugar de "CriandoObjetos" posso deixar como Main
public class CriandoObjetos {
    public static void main(String[] args) {
        // Criando um objeto da Classe Carro
        Carro meuCarro = new Carro();

        //Atribuindo valores aos atributos do objeto
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1970;
        meuCarro.preco = 15000.0;

        //Chamando um metodo do objeto
        meuCarro.exibirInformacoes();
    }

}
