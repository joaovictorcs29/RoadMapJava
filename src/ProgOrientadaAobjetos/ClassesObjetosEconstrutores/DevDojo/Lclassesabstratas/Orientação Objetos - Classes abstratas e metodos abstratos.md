# Orientação Objetos - Classes abstratas e métodos abstratos

## 84 - Orientação Objetos - Classes abstratas pt 01

- Quando criamos uma classe abstrata, estamos falando que essa classe é apenas um template.
- Só podemos ter um objeto das classes que estendem a classe abstrata, não a classe abstrata em si.
- É uma classe que foi criada pra ser superclasse.
- Não podemos ter uma classe final abstract, pois tem sentidos opostos. Uma é pra ser estendida(**abstract**) e a outra
  é pra não estender as funcionalidades daquela classe(**final**)

## 85 - Orientação Objetos - Classes abstratas pt 02 - Métodos abstratos

- Classes abstratas = não podem ser instanciadas.
- Métodos abstratos = não podem ter corpo.
- Apesar do método ser chamado na classe super, é executado o método da subclasse onde o método foi
  sobrescrito/implementado.
- Se tenho uma subclasse que estende de uma classe abstrata, sou obrigado a implentar os metodos abstratos.
- Não podemos ter métodos abstratos em classes não abstratas, mas classes abstratas podem conter métodos abstratos e
  concretos(implementados).

## 86 - Orientação Objetos - Classes abstratas pt 03 - Métodos abstratos regras

- Regra: Se eu tiver uma classe abstrata e outra classe abstrata estender ela, nao sou obrigado a implementar a classe superior(super) a ela. Porém, a primeira classe que estender essa classe, precisará implementá-la.
- Não podemos ter múltiplas heranças, mas podemos ter hierarquia maior. Exemplo: Gerente é Funcionário e funcionário é Pessoa. Sendo assim, [filho] -> [pai] -> [avô].
