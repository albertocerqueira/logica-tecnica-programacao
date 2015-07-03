# LTP - Algoritmos
Algoritmos com simples implementação, muito usado em aulas de programação.

- [<sub>Bogo Sort</sub>](#bogo-sort)
- [<sub>Bubble Sort</sub>](#bubble-sort)
- [<sub>Bucket Sort</sub>](#bucket-sort)
- [<sub>Busca Binária</sub>](#busca-binária)
- [<sub>Busca Sequêncial</sub>](#busca-sequêncial)
- [<sub>Counting Sort</sub>](#counting-sort)
- [<sub>Insertion Sort</sub>](#insertion-sort)
- [<sub>Merge Sort</sub>](#merge-sort)
- [<sub>Quick Sort</sub>](#quick-sort)
- [<sub>Recursividade</sub>](#recursividade)

## <sub>Bogo Sort</sub>
<sub>Bogosort (também conhecido como CaseSort), é um algoritmo de ordenação extremamente ineficiente. É baseado na reordenação aleatória dos elementos. Não é utilizado na prática, mas pode ser usado no ensino de algorítmos mais eficientes. Seu nome veio do engraçado termo quantum bogodynamics e, ultimamente, a palavra bogus. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BogoSort.java "Veja")).</sub>

## <sub>Bubble Sort</sub>
<sub>O bubble sort, ou ordenação por flutuação (literalmente "por bolha"), é um algoritmo de ordenação dos mais simples. A ideia é percorrer o vector diversas vezes, a cada passagem fazendo flutuar para o topo o maior elemento da sequência. Essa movimentação lembra a forma como as bolhas em um tanque de água procuram seu próprio nível, e disso vem o nome do algoritmo ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BubbleSort.java "veja")).</sub>

## <sub>Bucket Sort</sub>
<sub>Bucket sort, ou bin sort, é um algoritmo de ordenação que funciona dividindo um vetor em um número finito de recipientes. Cada recipiente é então ordenado individualmente, seja usando um algoritmo de ordenação diferente, ou usando o algoritmo bucket sort recursivamente. O bucket sort tem complexidade linear (Θ(n)) quando o vetor a ser ordenado contém valores que são uniformemente distribuídos. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BucketSort.java "Veja"))</sub>

## <sub>Busca Binária</sub>
<sub>A pesquisa ou busca binária (em inglês binary search algorithm ou binary chop) é um algoritmo de busca em vetores que segue o paradigma de divisão e conquista. Ela parte do pressuposto de que o vetor está ordenado e realiza sucessivas divisões do espaço de busca comparando o elemento buscado (chave) com o elemento no meio do vetor. Se o elemento do meio do vetor for a chave, a busca termina com sucesso. Caso contrário, se o elemento do meio vier antes do elemento buscado, então a busca continua na metade posterior do vetor. E finalmente, se o elemento do meio vier depois da chave, a busca continua na metade anterior do vetor ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BuscaBinaria.java "veja")).</sub>

## <sub>Busca Sequêncial</sub>
<sub>Na área de informática, ou Ciência da Computação, costuma-se usar o termo busca linear (ou busca sequêncial) para expressar um tipo de pesquisa em vetores ou listas de modo sequencial, i. e., elemento por elemento, de modo que a função do tempo em relação ao número de elementos é linear, ou seja, cresce proporcionalmente. Num vetor ordenado, essa não é a pesquisa mais eficiente, a pesquisa (ou busca) binária, por exemplo, é um tipo de pesquisa com o gráfico de tempo logarítmo ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BuscaSequencial.java "veja")).</sub>

## <sub>Counting Sort</sub>
<sub>Counting sort é um algoritmo de ordenação estável cuja complexidade é O(n). As chaves podem tomar valores entre 0 e M-1. Se existirem k0 chaves com valor 0, então ocupam as primeiras k0 posições do vetor final: de 0 a k0-1. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/CountingSort.java "Veja"))</sub>

## <sub>Insertion Sort</sub>
<sub>Insertion sort, ou ordenação por inserção, é um simples algoritmo de ordenação, eficiente quando aplicado a um pequeno número de elementos. Em termos gerais, ele percorre um vetor de elementos da esquerda para a direita e à medida que avança vai deixando os elementos mais à esquerda ordenados. O algoritmo de inserção funciona da mesma maneira com que muitas pessoas ordenam cartas em um jogo de baralho como o pôquer ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/InsertionSort.java "veja")).</sub>

## <sub>Merge Sort</sub>
<sub>O merge sort, ou ordenação por mistura, é um exemplo de algoritmo de ordenação do tipo dividir-para-conquistar. Sua ideia básica consiste em Dividir(o problema em vários sub-problemas e resolver esses sub-problemas através da recursividade) e Conquistar(após todos os sub-problemas terem sido resolvidos ocorre a conquista que é a união das resoluções dos sub-problemas).Como o algoritmo do Merge Sort usa a recursividade em alguns problemas esta técnica não é muito eficiente devido ao alto consumo de memória e tempo de execução ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/MergeSort.java "veja")).</sup>

## <sub>Quick Sort</sub>
<sub>O algoritmo Quicksort é um método de ordenação muito rápido e eficiente, inventado por C.A.R. Hoare em 19601 , quando visitou a Universidade de Moscovo como estudante. Naquela época, Hoare trabalhou em um projeto de tradução de máquina para o National Physical Laboratory. Ele criou o 'Quicksort ao tentar traduzir um dicionário de inglês para russo, ordenando as palavras, tendo como objetivo reduzir o problema original em subproblemas que possam ser resolvidos mais facil e rapidamente. Foi publicado em 1962 após uma série de refinamentos ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/QuickSort.java "veja")).</sub>

## <sub>Recursividade</sub>
<sub>Em ciência da computação, a recursividade é a definição de uma subrotina (função ou método) que pode invocar a si mesma. Um exemplo de aplicação da recursividade pode ser encontrado nos analisadores sintáticos recursivos para linguagens de programação. A grande vantagem da recursão está na possibilidade de usar um programa de computador finito para definir, analisar ou produzir um estoque potencialmente infinito de sentenças, designs ou outros dados ([veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/Recursividade.java "veja")).</sub>
