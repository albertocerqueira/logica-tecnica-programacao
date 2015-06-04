# LTP - Lista 00007
Lista de exercícios

### <sub>[Exercício 00](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio00.java "Exercício 00")<sub>
<sub>Dados n e uma seqüência de n números inteiros, determinar o comprimento de um segmento crescente de comprimento máximo.
Exemplos:
Na seqüência   5,  10,  3,  2,  4,  7,  9,  8,  5   o comprimento do segmento crescente máximo é 4.
Na seqüência   10,  8,  7,  5,  2   o comprimento de um segmento crescente máximo é 1.</sub>

### <sub>[Exercício 01](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio01.java "Exercício 01")<sub>  
<sub>Dados n e uma seqüência de n números inteiros, determinar quantos segmentos de números iguais consecutivos compõem essa seqüência.
Exemplo: A seguinte seqüência é formada por 5 segmentos de números iguais: 5, 2, 2, 3, 4, 4, 4, 4, 1, 1</sub>  
	 
### <sub>[Exercício 02](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio02.java "Exercício 02")<sub>  
<sub>Dizemos que um número natural n é palíndromo (3) se o 1º algarismo de n é igual ao seu último algarismo, o 2º algarismo de n é igual ao penúltimo algarismo, e assim sucessivamente.
Exemplos:
567765 e 32423 são palíndromos.
567675 não é palíndromo.
Dado um número natural n > 10 , verificar se n é palíndrome.</sub>  
	 
### <sub>[Exercício 03](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio03.java "Exercício 03")<sub>
<sub>Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da população de coelhos através de uma seqüência de números naturais que passou a ser conhecida como seqüência de Fibonacci. O n-ésimo número da seqüência de Fibonacci F(n) é dado pela seguinte fórmula de recorrência:
F(1) = 1
F(2) = 1
F(i) = F(i-1) + F(i-2) para i >= 3</sub>  
	 
### <sub>[Exercício 04](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio04.java "Exercício 04")<sub>
<sub>Escreva um programa para calcular o total do faturamento de cada filial de uma loja durante sete dias. A função principal deve ler o faturamento diário das 10 filiais durante sete dias, guardar em uma matriz (10 x 7) e chamar a função calculaTotal( ), passando a matriz como parâmetro. A função calculaTotal() deve calcular e mostrar o faturamento total de cada filial e o faturamento total da loja.</sub>  
	 
### <sub>[Exercício 05](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio05.java "Exercício 05")<sub>
<sub>Construa um programa cuja função principal deve ler a descrição de 50 produtos de um supermercado, guardar em uma array e chamar a função mostraProdutos(), passando o array como parâmetro. Essa função deve mostrar os produtos na ordem inversa que foram digitados.</sub>  

### <sub>[Exercício 06](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio06.java "Exercício 06")<sub>
<sub>Faça um programa para calcular a média das temperaturas armazenadas durante um ano. A função principal deve ler em um arquivo com as temperaturas diárias de cada mês do ano, guardar em uma matriz (12 x 30), considerando que todos os meses têm 30 dias. Depois a função principal chama a função calculaMedia( ), passando a matriz como parâmetro. Essa função deve calcular e mostrar:
•	A média das temperaturas de cada mês (linha da matriz);
•	A média das temperaturas do mesmo dia do mês durante o ano (coluna da matriz).</sub>  

### <sub>[Exercício 07](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio07.java "Exercício 07")<sub>
<sub>Escrever um programa que faça a busca de uma palavra em frases. O A função prinicipal deve ler várias frases de um arquivo (no máximo 100 frases), armazenar essas frases em um array e chamar a função buscaPalavra( ). Essa função deve ler uma palavra digitada pelo usuário, fazer a busca dessa palavra nas frases e mostrar as frases que contém a palavra buscada.</sub>    

### <sub>[Exercício 08](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio08.java "Exercício 08")<sub>
<sub>Parte A - Escreva um programa capaz de ler um número inteiro entre 1.000 e 99.999. Depois seu programa deverá ser capaz de preencher um vetor de cinco posições com cada algarismo do número, usando a função int2vet(). Onde, int2vet(recebe o número lido e o vetor por parâmetro. Por exemplo, se o número lido for 32765 então v[5] = {3,2,7,6,5}.
OBSERVAÇÃO: É mais fácil preencher da última para a primeira posição. 
Parte B - Escreva um programa capaz de ler 5 números inteiros entre 1.000 e 99.999 e armazená-los num vetor de inteiros. Depois seu programa deverá ser capaz de preencher uma matriz 5x5 de inteiros com cada linha representando um dos elementos do vetor e cada coluna com um algarismo do número lido, usando a função vet2mat(), sendo que vet2mat() recebe por parâmetro a matriz e o vetor resultado. 
OBSERVAÇÃO: use a função int2vet() construída na parte A.</sub>  

### <sub>[Exercício 09](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/exercicios00007/Exercicicio09.java "Exercício 09")<sub>
<sub>Construa um programa que contenha 3 funções: principal, soma e subtrai.
•	principal é a main(): essa função contém um menu, que se o usuário digitar 1, a função soma() será chamada. Se a pessoa digitar 2, será chamada a função subtrai(), se a pessoa digitar 3, haverá a saída do programa.
•	soma(): lê dois números reais, calcula e mostra a soma desses números;
•	subtrai(): lê dois números reais, calcula e mostra a subtração do primeiro pelo segundo.</sub>  