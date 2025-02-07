package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

        /*nao colocamos o atributo "Genero" porque pode quebrar o codigo de outros colegas da empresa
        ja que o requisito foi "pedido" depois do metodo ter sido criado. Entao vamos criar um outro metodo
        para isso
          */
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios); // assim evitamos repetir codigo
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios (int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios () {
        return this.episodios;
    }
}
