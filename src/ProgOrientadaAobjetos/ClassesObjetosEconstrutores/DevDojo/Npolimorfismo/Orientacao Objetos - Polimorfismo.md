# Polimorfismo

## 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução

- Separamos por camada: Modelo, Servico (Regra de negocio), Visualizacao(Teste).

1. Criamos uma classe Abstrata Produto porque esse "Produto" nao dever existir(nao podemos instanciar Produto), assim so
   os produtos criados a partir dessa classe que devem existir
2. Criamos duas classes pc e Tomate, que estendem a classe Produto
3. Criamos uma interface Taxavel que tem um unico metodo calcularImposto(), e coloquei que produto implementa Taxavel,
   assim todo produto precisar implementar o metodo calcularImposto
4. Criamos uma Classe de servico para alterar as regras de negocio.

## 91 - Orientação Objetos - Polimorfismo pt 02 - Funcionamento

- Polimorfismo = multiplas formas

![img.png](img.png)

## 92 - Orientação Objetos - Polimorfismo pt 03 - Parâmetros polimórficos

- Superclasse recebendo um objeto da subclasse
- Vimos que podemos deixar o codigo mais generico, pra reutilizar novamente com outros objetos.

## 93 - Orientação Objetos - Polimorfismo pt 04 - Cast e instanceof

- Pra fazer um Cast de um objeto pra outro, precisamos fazer uma verificacao de instancia (instanceof)

## 94 - Orientação Objetos - Polimorfismo pt 05 - Programação orientada a interface

- Fazendo instanciacao do objeto mais generico e passando o tipo de objeto que queremos temos mais flexibilidade.
  Exemplo: Repositorio repositorio = new RepositorioArquivo(); repositorio.salvar();
