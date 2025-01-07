package FundamentosDaLinguagem.ProgramasSimples;

public class FuncoesEmetodos {
    public static void main(String[] args) {
        int soma = addNumbers(10,5);
        System.out.println("Soma: " + soma);

        String message = greet("Joao");
        System.out.println(message);
    }

    //metodo para somar dois numeros
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    //Metodo para criar uma saudacao
    public static String greet (String name) {
        return "Ola, " +name+ "!";
    }
}
