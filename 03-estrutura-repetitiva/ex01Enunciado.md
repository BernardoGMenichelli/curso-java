# Exercícios de Fixação em Java - Estrutura Repetitiva (while)

### Exercício 01 - Validação de Senha
Escreva um programa que repita a leitura de uma senha até que ela seja válida.  
Para cada senha incorreta, escreva a mensagem `Senha Invalida`.  
Quando a senha correta for informada, escreva `Acesso Permitido` e encerre o programa.
**Senha correta:** `2002`

**Exemplo de Entrada:**
2200  
1020  
2022  
2002

**Saída:**
Senha Invalida  
Senha Invalida  
Senha Invalida  
Acesso Permitido

### Exercício 02 - Quadrante de Ponto
Escreva um programa para ler coordenadas (X, Y) de vários pontos no plano cartesiano.  
Para cada ponto, informe o quadrante correspondente: `primeiro`, `segundo`, `terceiro` ou `quarto`.  
O programa será encerrado quando **pelo menos uma das coordenadas for zero**.

**Exemplo de Entrada:**
2 2  
3 -2  
-8 -1  
-7 1  
0 2

**Saída Esperada:**
primeiro  
quarto  
terceiro  
segundo

### Exercício 03 - Pesquisa de Combustível
Um posto de combustíveis quer saber qual tipo de combustível os clientes mais preferem.  
O programa deve ler o código correspondente ao tipo de combustível abastecido:

- `1`: Álcool  
- `2`: Gasolina  
- `3`: Diesel  
- `4`: Fim

Para cada código inválido (não entre 1 e 4), solicite nova entrada.  
O programa termina quando o usuário digita `4`.  
Em seguida, exiba a mensagem final com o total de votos para cada tipo de combustível.

**Exemplo de Entrada:**
8  
1  
7  
2  
2  
4

**Saída Esperada:**
MUITO OBRIGADO  
Alcool: 1  
Gasolina: 2  
Diesel: 0
