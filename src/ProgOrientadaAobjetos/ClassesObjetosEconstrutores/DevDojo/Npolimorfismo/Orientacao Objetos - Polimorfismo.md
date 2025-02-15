# Polimorfismo

## 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução

- Separamos por camada: Modelo, Servico (Regra de negocio), Visualizacao(Teste).

1. Criamos uma classe Abstrata Produto porque esse "Produto" nao dever existir(nao podemos instanciar Produto), assim so
   os produtos criados a partir dessa classe que devem existir
2. Criamos duas classes pc e Tomate, que estendem a classe Produto
3. Criamos uma interface Taxavel que tem um unico metodo calcularImposto(), e coloquei que produto implementa Taxavel,
   assim todo produto precisar implementar o metodo calcularImposto 
4. Criamos uma Classe de servico para alterar as regras de negocio.