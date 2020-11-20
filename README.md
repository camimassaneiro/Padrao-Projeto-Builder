# Padrao Projeto Builder - GOF - Utilizando Java
### Projeto simulando banco que gera boleto utilizando padrão de projeto Builder GOF 

Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

#### Problema:
Desenvolva um ConcreteBuilder para a Caixa e outro para o Bradesco. 

Caixa: o cedente sempre será em letras maiúsculas
Bradesco: a carteira sempre será 06

Solução: Implementar os ConcreteBuilders. Reflita a existência de código repetido nessas classes, e refatore aquelas já prontas. Atualizar a classe de cliente para testar cada um dos concrete builders.

Intenção: Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.

Aplicabilidade: Use o padrão Builder quando:

- O algoritmo para criação de um objeto complexo deve ser independente das partes que compõem o objeto e de como elas são montadas.
- O processo de construção deve permitir diferentes representações para o objeto que é construído.

#### Estrutura Builder

![Estrutura Builder](https://github.com/camimassaneiro/Padrao-Projeto-Builder/blob/master/Estrutura%20Builder.PNG)

Participantes:

- Builder: especifica uma interface abstrata para a criação de partes de um objeto-produto.
- ConcreteBuildere: 
	- constrói e monta partes do produto pela implementação da interface de Builder;
	- define e mantém a representação que cria;
	- fornece uma interface para a recuperação do produto
- Director: constrói um objeto usando a interface de Builder
- Product:
	- representa o objeto complexo em construção. ConcreteBuilder constrói a representação interna do produto e define o processo pelo qual ele é montado;
	- inclui classes que definem as partes constituintes, inclusive as interfaces para a montagem das partes no resultado final.

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
