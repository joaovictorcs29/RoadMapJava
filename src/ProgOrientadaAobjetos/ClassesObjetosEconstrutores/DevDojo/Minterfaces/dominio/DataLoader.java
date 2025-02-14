package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    default void checkPermission() {
        System.out.println("Checando permissoes");
    }
}
