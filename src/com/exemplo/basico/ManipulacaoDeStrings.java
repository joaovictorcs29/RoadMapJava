package com.exemplo.basico;


//Este programa verifica a manipulacao basica de strings, como concatenacao
// e metodos comuns (length(), substring()).

public class ManipulacaoDeStrings {
    public static void main(String[] args) {
        String greeting = "Hello, World!";

        // obtendo o comprimento da String
        System.out.println("Comprimento da String: " + greeting.length());

        // Extraindo uma parte da string
        String subString = greeting.substring(7, 12);
        System.out.println("Substring: " + subString);

        // Concatenacao de Strings
        String name = "Maria";
        String fullgreeting = greeting + " " + name;
        System.out.println("Saudacao Completa: " +fullgreeting);
    }
}
