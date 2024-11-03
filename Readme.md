# Kotlin Bases WIP - formatacao e organizacao

## Package definition and import

Em kotlin todo package e um diretorio no projeto sendo a raiz do projeto em src>main>kotlin
o nome de um pacote por convencao organizar o nome do pacote com pontos
ex: oliveira.technological.solutions(pacote base)

- .model(pacote referente ao diretorio model)
- .services(pacote referente ao diretorio services)
- .controller(pacote referente ao diretorio controller)

## Variables

As variaveis em kotlin sao declaradas como var e val.

- Sendo `var` variáveis que podem ser reatribuídas. são **mutáveis**
  e você pode alterar seus valores após a inicialização
- Sendo `val` variaveis que nao podem ser reatribuídas, sao **imutaveis**
  e voce nao pode alterar seu valor depois da inicializacao

As variaveis em kotlin possuem a inferencia de tipo explicita ou implicita

- Explicita `var number:Int` onde se informa que a variavel number e um numero inteiro
- Implicita `var number = 5` no momento da atribuicao a variavel identifica o tipo de dado

Os tipos de dados em kotlin sao

- numericos
  `Int` `double` e `float`
- logicos booleanos `true` e `false`
- textos `String` e `char`
- arrays e collections

As variavesis tambem possuem um Null Safety `?.` para variaveis que sao possivelmente null

## Arrays and Collections

Arrays e Collections sao estruturas para armazenamento de dados primitivos ou objetos,

### Arrays

Arrays possuem um numero fixo de valores do mesmo tipo sejam objetos,numeros,textos
para criar arrays voce pode usar as funcoes `arrayOf()`, `arrayOfNulls()`, `emptyArray()`,
ou o contrutor `Array`, por array ter um numero de membros fizxos vc nao pode remover
ou adicionar valores , vc so pode criar um novo array com mais ou menos membros
ex: 
> `var riversArray = arrayOf("Nile", "Amazon", "Yangtze")`
 usando a operacao de atribuicao += para criar um novo array,
 copia o original e adiciona "Mississippi"

> `val simpleArray = arrayOf(1, 2, 3)`
cria um array numerico com 3 posicoes
 
> `val nullArray: Array<Int?> = arrayOfNulls(3)`
cria um array de inteiros ou nulo e atribui valor inicial de 3 posicoes nulas






### Collections

## Functions

uma funcao deve ser declara como `fun` ex: `fun soma(num1:Int, num2: Int):Int`
se expecifica o tipo do parametro e o retorno,
e possivel passar um parametro padrao ex:`fun soma(num1:Int = 2, num2: Int = 2):Int`,
e pode ser usada como uma expresao funcao(lambda function)
como: `val soma:((Int,Int) -> Int) = {number1, number2 -> number1 + number2}`

## Class

toda classe em kotlin e final e para ser herdade e
necessario ser aberta com a palavra reservada `open`,

uma classe em kotlin pode ter varios construtores e nao possui um
metodo statico mas um companiom object
para criar uma classe precisa da palavra reservada `class` ex:
` class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}`
essa classe possui o atributo perimetro, que pode ser acessado atraves da instancia
apos criar a classe, vc deve declarar antes de usa-la `
    val reactangle = Rectangle(2.5,1.5)
`
apos isso isso basta acessar o atributo declarado `reactangle.perimetro`
