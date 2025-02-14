package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Minterfaces.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Minterfaces.dominio.DatabaseLoader;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}
