package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Dentro do bloco de inicializacao estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco inicializacao de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicializacao de Funcionario 2 ");
    }

    public Funcionario (String nome){
        super(nome); // construtor da subclasse precisa do super para reconhecer os atributos da superclasse
        System.out.println("Dentro do construtor de funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();//Objeto super(vou acessar os atributos *dessa classe* definidos na Super classe)
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "  + this.nome + " recebi meu salario de " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
