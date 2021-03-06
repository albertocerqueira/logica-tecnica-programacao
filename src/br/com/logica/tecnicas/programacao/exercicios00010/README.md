### LTP - Lista 00010
<sub>Lista de exercícios</sub>

### <sub>[Exercício 00](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio00.java "Exercício 00")</sub>
<sub>Um professor tem uma lista, que se chama turmaN.txt, com no máximo 30 nomes de alunos. Ele precisa de um programa capaz de armazenar num único conjunto as três notas de cada aluno da turma N e sua média, para ajudá-lo no momento da impressão. Os requisitos essenciais deste programa é que:  
• Deve haver uma função que recebe por parâmetro um número inteiro que representa se é a p1, p2 ou p3, a matriz de notas (quantas colunas deve ter esta matriz?) e o número de alunos da turma N;  
• A função de leitura deve, automaticamente, ser capaz de calcular e armazenar a média atual do aluno usando a fórmula: media = (p1 + 2 * p2 + 3 * p3) / 6  
• Deve haver uma função imprime() que recebe o nome do arquivo contendo os nomes dos alunos da turma e a matriz de notas correspondente à essa turma, capaz de criar o arquivo turmaNotas.txt para a impressão. Observação notas de provas que não forem digitadas deverão ser marcadas como zero.</sub>

### <sub>[Exercício 01](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio01.java "Exercício 01")</sub>  
<sub></sub>  
	 
### <sub>[Exercício 02](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio02.java "Exercício 02")</sub>  
<sub>Faça uma função que receba como parâmetro o salário de um funcionário e retorne o salário reajustado em 15%.</sub>  
	 
### <sub>[Exercício 03](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio03.java "Exercício 03")</sub>
<sub>Escreva uma função que verifique se o ano é bissexto retornando um tipo booleano (verdadeiro para ano bissexto, falso para ano não bissexto). Ano bissexto, o resto de sua divisão por 4 e 100 devem ser igual a zero, ou o resto de sua divisão por 400 deve ser igual a zero.</sub>  

### <sub>[Exercício 04](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio04.java "Exercício 04")</sub>
<sub>Uma multiplicação nada mais é do que um certo número de somas sucessivas (multiplicador) de um dado número (multiplicando). Por exemplo, para multiplicar 34 por 5, basta somar o número 34 com ele mesmo 5 vezes. Escreva uma função que receba com parâmetros o multiplicando e multiplicador e retorne o resultado desta multiplicação através de somas sucessivas.</sub>  
	 
### <sub>[Exercício 05](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio05.java "Exercício 05")</sub>
<sub>Escreva uma função que receba três valores inteiros e chame uma função, esta função deve receber estes três valores como parâmetro e retornar o menor deles.</sub>  

### <sub>[Exercício 06](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio06.java "Exercício 06")</sub>
<sub>Uma maneira de encontrar a raiz aproximada de um número inteiro é fazer a subtração continua de números impares começando pelo 1 e contar quantas subtrações foram feitas, antes do número se tornar negativo. Por exemplo:  
n = 66  
1° subtração 66 - 1  = 65  
2° subtração 65 - 3  = 62  
3° subtração 62 - 5  = 57  
4° subtração 57 - 7  = 50  
5° subtração 50 - 9  = 41  
6° subtração 41 - 11 = 30  
7° subtração 30 - 13 = 17  
8° subtração 17 - 15 = 2  
9° subtração 2  - 17 = - 15 (inválida, pois, é negativa)  
Escreva um programa que leia um número inteiro n e chame uma função raizAproximada() passando n e que seja capaz de calcular e retornar a raiz quadrada inteira deste número. Seu programa deverá imprimir o resultado de forma clara. Faça o teste de mesa para n=36 e n=54.</sub>  

### <sub>[Exercício 07](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio07.java "Exercício 07")</sub>
<sub>Escreva um programa capaz de ler um número real x e um valor inteiro n entre 0 e 3. Este programa deverá passar os valores lidos para a função arredonda(). A função arredonda() deverá ser capaz de retornar o número lido com o número de casas pedidos. O programa principal deverá imprimir o valor retornado.  
Dica: Um algoritmo de programação para arredondar um número real para n casas decimais é:  
Passo 1: Multiplique o número por 10ⁿ.  
Passo 2: Adicione 0.5  
Passo 3: Apague a parte fracionada do resultado.  
Passo 4: Divida por 10ⁿ.  
<br />  
Por exemplo, usando este algoritmo para arredondar o número 78,374625 para 3 casas decimais.  
Passo 1: 78.374625 X 10³ = 78374.625  
Passo 2: 78374.625 + 0.5 = 78375.125  
Passo 3: Conservando a parte inteira = 78375  
Passo 4: 78375 dividido por 10³ = 78.375  
<br />
Outros exemplos:  
x = 4.9 e n = 0 implica que arredondando teremos 5.  
x = 4.92 e n = 1 implica que arredondando teremos 4.9.  
x= 4.978 e n =2 implica que arredondando teremos 4.98.</sub>  

### <sub>[Exercício 08](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio08.java "Exercício 08")</sub>
<sub>Escreva um laço (while, for, do-while) que resulte em um laço infinito.</sub>  

### <sub>[Exercício 09](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio09.java "Exercício 09")</sub>
<sub>Escreva um laço for que inicialize um vetor de 50 inteiros com os valores 50 a 99.</sub>

### <sub>[Exercício 10](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio10.java "Exercício 10")</sub>
<sub>Um número inteiro N é dito primo se apenas for divisível por 1 e por ele mesmo (Por definição, o 1 não é primo). Escreva um programa que leia um número N positivo e maior que 1 e informe se o número é primo ou não.  
Exemplos:  
• 2 é primo, pois, há 2 divisores: o 1 e o 2  
• 3 é primo, pois há 2 divisores: o 1 e o 3  
• 15 não é primo, pois há 4 divisores: o 1, o 3, o 5 e o 15  
• 16 não é primo, pois há 5 divisores: o 1, o 2, o 4, o 8 e o 16</sub>

### <sub>[Exercício 11](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio11.java "Exercício 11")</sub>
<sub>Existem medidas específicas para grandes extensões, como sítios, chácaras e fazendas. São elas o hectare e o are.  
Onde:  
&nbsp;&nbsp;&nbsp;&nbsp;1 hectare(ha) = 10000m2  
&nbsp;&nbsp;&nbsp;&nbsp;1 are(a) = 100m2
Uma fazenda possui 132 500m2 de área. Escreva um programa que calcule qual a sua medida em hectare e em are.  
OBS: Medidas são números reais.</sub>

### <sub>[Exercício 12](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio12.java "Exercício 12")</sub>
<sub>Escreva um programa que calcule o valor do desconto de uma mercadoria paga a vista e o valor total a ser pago. Considere o valor da mercadoria como sendo R$330,00 e a porcentagem do desconto 5%. (Deverá aparecer para o desconto 16.5 e para o valor a ser pago 313.5).</sub>

### <sub>[Exercício 13](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio13.java "Exercício 13")</sub>
<sub>Alguns jornais calculam o número de pessoas presentes em atos públicos, considerando que cada metro quadrado é ocupado por 4 pessoas. Escreva um programa que calcule qual a estimativa do número de pessoas presentes numa praça de 3250m2, que tenha ficado lotada para um comício, segundo essa avaliação.</sub>

### <sub>[Exercício 14](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio14.java "Exercício 14")</sub>
<sub>Uma empresa pretende diminuir a diferença entre o salário de seus funcionários e decidiu dar aumentos proporcionais da seguinte forma:  
salário bruto R$500.00 : Aumento de 15%  
salário bruto R$900.00 : Aumento de 10%  
salário bruto R$1500.00: Aumento de 5%  
Com base nestes índices, escreva um programa que calcule e imprima na tela os três novos salários. (deverá ser impresso na tela, R$ 575.00, R$ 990.00 e R$ 1575.00.)</sub>

### <sub>[Exercício 15](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio15.java "Exercício 15")</sub>
<sub>Em uma disciplina estavam matriculados 82 alunos. Deste total, 30 alunos foram reprovados. Escreva um programa que calcule e imprima na tela a porcentagem de alunos reprovados. (deverá aparecer 36.58%).</sub>

### <sub>[Exercício 16](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio16.java "Exercício 16")</sub>
<sub>Precisamos alugar um carro por um único dia. Consultadas duas agências, a primeira cobra R$62,00 pela diária e R$1,40 por quilômetro rodado. A segunda cobra diária de R$80,00 e mais R$1,20 por quilômetro rodado. Sabendo que rodaremos 190 Km, escreva um programa que calcule quanto pagaríamos em cada uma das agências.</sub>

### <sub>[Exercício 17](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio17.java "Exercício 17")</sub>
<sub>Fazer um programa que leia uma temperatura fornecida em graus Farenheit e a converta para o seu equivalente em graus centígrados, imprimindo este valor na tela.  
Dado:  
C = (F - 32) / 1.8</sub>

### <sub>[Exercício 18](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio18.java "Exercício 18")</sub>
<sub>Escreva um programa que leia os valores da base maior (B), base menor (b) e altura (h) de um trapézio, e calcule e imprima o valor de sua área, sabendo que a área de um trapézio (A) é dada por:  
A = ((B + b) * h) / 2</sub>

### <sub>[Exercício 19](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio19.java "Exercício 19")</sub>
<sub>Escreva um programa que calcule o valor do desconto de uma mercadoria paga a vista e o valor total a ser pago. O programa deve ler o valor da mercadoria e a porcentagem do desconto. Depois o programa deve calcular e imprimir na tela o valor do desconto e o novo valor da mercadoria com o desconto.</sub>

### <sub>[Exercício 20](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio20.java "Exercício 20")</sub>
<sub>Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Escreva um programa que leia o valor do salário fixo de um funcionário e o valor de suas vendas, calcule e mostre na tela a comissão e o salário final do funcionário.</sub>

### <sub>[Exercício 21](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio21.java "Exercício 21")</sub>
<sub>Faça um programa para converter um dado valor em reais (R$) para a moeda dólar (US$). O programa deve ler um valor em reais (R$) e a cotação da moeda americana, depois converter para dólares (US$) e apresentar este valor convertido na tela.</sub>

### <sub>[Exercício 22](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio22.java "Exercício 22")</sub>
<sub>Escreva um programa para ajudar um professor a fazer seu planejamento. Esse programa deve ter como entrada um valor em minutos digitado pelo professor e realizar a conversão para horas/aula mostrando o resultado na tela.  
Dado: 1 hora/aula = 50 minutos</sub>

### <sub>[Exercício 23](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio23.java "Exercício 23")</sub>
<sub>Escreva um programa que leia um número inteiro de quatro algarismos (vamos supor que o usuário digite um número de quatro algarismos, ou seja, um número entre 1000 e 9999). Você deve trocar o primeiro algarismo com o último, construindo um novo número, e imprimir na tela este novo número.  
Exemplo:  
Se digitado o número 5341, deve aparecer na tela o número 1345.  
Se digitado o número 4578, deve aparecer na tela o número 8574.  
Se digitado o número 1230, deve aparecer na tela o número 231.</sub>

### <sub>[Exercício 24](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio24.java "Exercício 24")</sub>
<sub>Construa um programa para ler em um arquivo chamado precos-custo.txt, um número indeterminado de preços de custo de mercadorias (no máximo 500), calcular o preço de venda com margem de lucro de 30%, criar um vetor com os preços de venda e mostrar os novos preços na tela</sub>

### <sub>[Exercício 25](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio25.java "Exercício 25")</sub>
<sub>Escreva um programa para ler um arquivo chamado notas.txt contendo notas de 50 alunos, arredondar essas notas de acordo com os critérios a seguir e salvar as notas arredondadas no arquivo notas-arredondadas.txt.  
Observação:  
&nbsp;&nbsp;&nbsp;&nbsp;Sempre verifique se os arquivos foram abertos corretamente.  
&nbsp;&nbsp;&nbsp;&nbsp;Critérios de arredondamento:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Parte fracionária < 0,25: arredonda para 0,0  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0,25 <= Parte fracionária > 0,75: arredonda para 0,5  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Parte fracionária >= 0,75: arredonda para 1,0</sub>

### <sub>[Exercício 26](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio26.java "Exercício 26")</sub>
<sub>Construa um programa para ler um arquivo com o peso e a altura de várias pessoas chamado peso-altura.txt, calcular o índice de massa corporal (IMC = peso / (altura * altura)) de cada pessoa e salvar esses valores em um arquivo chamado imc.txt que já contem valores de IMC de outras pessoas (você precisa utilizar o comando para anexar informações a um arquivo existente).  
• O programa também deve mostrar na tela uma mensagem informando a média dos pesos lidos e a média dos IMCs calculados.</sub>

### <sub>[Exercício 27](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio27.java "Exercício 27")</sub>
<sub>Escrever um programa para ler um arquivo contendo vários preços de mercadorias chamado precos.txt, calcular os novos preços reajustando 10% e salvar os novos preços no arquivo novos-precos.txt.</sub>

### <sub>[Exercício 28](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio28.java "Exercício 28")</sub>
<sub>Construir um programa para ler um arquivo chamado salarios.txt contendo o valor dos salários de 100 funcionários, calcular o aumento de cada salário segundo a tabela a seguir e salvar os salários com aumento no arquivo novos-salarios.txt.  
• Salário > 5.000: aumento de 5%  
• 1.000 <= Salário <= 5000: aumento de 10%  
• Salário < 1.000: aumento de 15%</sub>

### <sub>[Exercício 29](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00010/Exercicio29.java "Exercício 29")</sub>
<sub>Escreva um programa capaz de preencher um vetor de inteiros de 13 posições com valores correspondentes a quantidade de dias de cada mês que está armazenado no arquivo dias-no-mes.txt. Depois seu programa deverá ler uma data (no formato dia/mês) e dizer se esta é ou não uma data válida.  
Exemplos:  
&nbsp;&nbsp;&nbsp;&nbsp;2/3 é uma data válida.  
&nbsp;&nbsp;&nbsp;&nbsp;30/2 é uma data inválida.  
&nbsp;&nbsp;&nbsp;&nbsp;24/13 é uma data inválida.</sub>