package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.test;


import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.dominio.Cliente;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.dominio.TipoCliente;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Goku", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        //TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa_Fisica");
        //System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
