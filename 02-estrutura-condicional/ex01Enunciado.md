# Exercícios de Fixação Java - Estrutura Condicional

Exercícios sobre Estrutura Condicional

###  Exercício 01 - Número Negativo
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

**Exemplos:**
Entrada: -10  
Saída: NEGATIVO

Entrada: 8  
Saída: NAO NEGATIVO

Entrada: 0  
Saída: NAO NEGATIVO

###Exercício 02 - Par ou Ímpar
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

**Exemplos:**
Entrada: 12  
Saída: PAR

Entrada: -27  
Saída: IMPAR

Entrada: 0  
Saída: PAR

### Exercício 03 - Múltiplos
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

**Exemplos:**
Entrada: 6 24  
Saída: Sao Multiplos

Entrada: 6 25  
Saída: Nao sao Multiplos

Entrada: 24 6  
Saída: Sao Multiplos

### Exercício 04 - Duração do Jogo
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

**Exemplos:**
Entrada: 16 2  
Saída: O JOGO DUROU 10 HORA(S)

Entrada: 0 0  
Saída: O JOGO DUROU 24 HORA(S)

Entrada: 2 16  
Saída: O JOGO DUROU 14 HORA(S)

###Exercício 05 - Conta do Lanche
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

CÓDIGO | ESPECIFICAÇÃO       | PREÇO
-------|----------------------|--------
1      | Cachorro Quente      | R$ 4.00
2      | X-Salada             | R$ 4.50
3      | X-Bacon              | R$ 5.00
4      | Torrada simples      | R$ 2.00
5      | Refrigerante         | R$ 1.50

**Exemplos:**
Entrada: 3 2  
Saída: Total: R$ 10.00

Entrada: 2 3  
Saída: Total: R$ 13.50

###Exercício 06 - Intervalos
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

**Exemplos:**
Entrada: 25.01  
Saída: Intervalo (25,50]

Entrada: 25.00  
Saída: Intervalo [0,25]

Entrada: 100.00  
Saída: Intervalo (75,100]

Entrada: -25.02  
Saída: Fora de intervalo

###Exercício 07 - Coordenadas no Plano
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

**Exemplos:**
Entrada: 4.5 -2.2  
Saída: Q4

Entrada: 0.1 0.1  
Saída: Q1

Entrada: 0.0 0.0  
Saída: Origem

###Exercício 08 - Imposto de Renda
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo:

R$2000.00 → isento
De R$2000.01 a R$3000.00 → 8% 
De R$3000.01 a R$4500.00 → 18%
Acima de R$4500.00 → 28%

**Exemplos:**
Entrada: 3002.00  
Saída: R$ 80.36

Entrada: 1701.12  
Saída: Isento

Entrada: 4520.00  
Saída: R$ 355.60
