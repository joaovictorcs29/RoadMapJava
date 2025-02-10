# OOB Associacao pt 01 - Arrays com objetos
Criei uma classe Jogador, instanciei ela na classe jogadorTest01 passando como argumento os nomes dos jogadores
criei um array de Jogadores(objeto), fiz o foreach para percorrer o array de objetos e o metodo imprime de cada jogador.

---

# 65 - Orientação Objetos - Associação pt 02 - Associação unidirecional um para muitos

1. Criei uma classe jogador possuindo nome como atributo
2. Criei uma classe Time possuindo nome como atributo
3. Na classe jogador passei o objeto Time como atributo, ou seja o Jogador possui um time. 
4. Criei a classe JogadorTest02(Classe de execucao),  nela instanciei o jogador passando como argumento o nome desse jogador
5. Ainda na classe JogadorTest02,  instanciei a classe Time passando como argumento o nome desse time
6. JogadorTest02: Associei (cadastrei o jogador no time) jogador1 ao Time.

---

# 66 - Orientação Objetos - Associação pt 03 - Associação unidirecional muitos para um
1. Criei a classe Professor com atributo nome.
2. Criei a classe Escola com o atributo nome e um array de Professores.
3. Criei o metodo imprime onde percorre cada professor da lista(Array) de professores e imprime o nome desse professor.
4. Criei a classe EscolaTest01 de execução onde instanciei 2 professores
5. Ainda no EscolaTest01 coloquei os 2 professores dentro do array de professores.
6. EscolaTest01, por fim, instanciei a escola passando como argumento o nome da escola e o array de professores. Concluindo a associação muitos para um