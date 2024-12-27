package com.exemplo.basico.programasSimplesOB;

public class OperacoesMatematicas {

    private int n1;
    private int n2;

    public OperacoesMatematicas(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int realizaSoma (int n1, int n2) {
        return n1 + n2;
    }

    public int realizaSubtracao(int n1, int n2) {
        return n1 - n2;
    }

    public int realizaMultiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public int realizaDivisao(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Somente numeros diferentes de zero ");
        } return n1 / n2;
    }

}

