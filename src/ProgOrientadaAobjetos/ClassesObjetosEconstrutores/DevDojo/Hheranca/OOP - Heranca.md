# Herança

## Herança pt 01

- Mecanismo onde a subclasse herda atributos e métodos da superclasse
  **Exemplo:**
- A classe Funcionario (subclasse) herda a classe Pessoa, pois a um funcionário é uma pessoa.

## Herança pt 02 - Super

- Utilizando super, conseguimos acessar na subclasse as definições feitas na superclasse.

## Herança pt 03 - protected

- Protected vai dar acesso direto a variavel em todas as subclasses, porem todas as classes do mesmo pacote terao acesso também.

## 74 - Orientação Objetos - Herança pt 04 - Construtores

- Para extender uma classe o construtor da subclasse precisa do super(atributo), atributos especificos da subclasse continuam usando this.atributo

## 75 - Orientação Objetos - Herança pt 05 - Sequência de inicialização

0. Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
1. Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
2. Alocado espaço em memória pro objeto da superclasse
3. Cada atributo de superclasse é criado e inicializado com valores default ou o que for passador
4. Bloco de inicialização é executado na ordem em que aparece
5. Construtor é executado da superclasse
6. Alocado espaço em memória pro objeto da subclasse
7. Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
8. Bloco de inicialização da subclasse é executado na ordem em que aparece
9. Construtor é executado da subclasse