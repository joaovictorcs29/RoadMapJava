package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.dominio.Cliente;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Goku", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("kuririn", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
