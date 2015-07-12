# LTP - Algoritmos
Algoritmos com simples implementação, muito usado em aulas de programação.

- [<sub>Bogo Sort</sub>](#bogo-sort)
- [<sub>Bubble Sort</sub>](#bubble-sort)
- [<sub>Bucket Sort</sub>](#bucket-sort)
- [<sub>Busca Binária</sub>](#busca-binária)
- [<sub>Busca Sequêncial</sub>](#busca-sequêncial)
- [<sub>Counting Sort</sub>](#counting-sort)
- [<sub>Gnome Sort</sub>](#gnome-sort)
- [<sub>Insertion Sort</sub>](#insertion-sort)
- [<sub>Merge Sort</sub>](#merge-sort)
- [<sub>Quick Sort</sub>](#quick-sort)
- [<sub>Recursividade</sub>](#recursividade)
- [<sub>Selection Sort</sub>](#selection-sort)
- [<sub>Sell Sort</sub>](#sell-sort)

## <sub>Bogo Sort</sub>
<sub>Bogosort (também conhecido como CaseSort), é um algoritmo de ordenação extremamente ineficiente. É baseado na reordenação aleatória dos elementos. Não é utilizado na prática, mas pode ser usado no ensino de algorítmos mais eficientes. Seu nome veio do engraçado termo quantum bogodynamics e, ultimamente, a palavra bogus. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BogoSort.java "Veja"))</sub>

## <sub>Bubble Sort</sub>
<sub>O bubble sort, ou ordenação por flutuação (literalmente "por bolha"), é um algoritmo de ordenação dos mais simples. A ideia é percorrer o vector diversas vezes, a cada passagem fazendo flutuar para o topo o maior elemento da sequência. Essa movimentação lembra a forma como as bolhas em um tanque de água procuram seu próprio nível, e disso vem o nome do algoritmo. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BubbleSort.java "Veja"))</sub>

## <sub>Bucket Sort</sub>
<sub>Bucket sort, ou bin sort, é um algoritmo de ordenação que funciona dividindo um vetor em um número finito de recipientes. Cada recipiente é então ordenado individualmente, seja usando um algoritmo de ordenação diferente, ou usando o algoritmo bucket sort recursivamente. O bucket sort tem complexidade linear (Θ(n)) quando o vetor a ser ordenado contém valores que são uniformemente distribuídos. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BucketSort.java "Veja"))</sub>

## <sub>Busca Binária</sub>
<sub>A pesquisa ou busca binária (em inglês binary search algorithm ou binary chop) é um algoritmo de busca em vetores que segue o paradigma de divisão e conquista. Ela parte do pressuposto de que o vetor está ordenado e realiza sucessivas divisões do espaço de busca comparando o elemento buscado (chave) com o elemento no meio do vetor. Se o elemento do meio do vetor for a chave, a busca termina com sucesso. Caso contrário, se o elemento do meio vier antes do elemento buscado, então a busca continua na metade posterior do vetor. E finalmente, se o elemento do meio vier depois da chave, a busca continua na metade anterior do vetor. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BuscaBinaria.java "Veja")).</sub>

## <sub>Busca Sequêncial</sub>
<sub>Na área de informática, ou Ciência da Computação, costuma-se usar o termo busca linear (ou busca sequêncial) para expressar um tipo de pesquisa em vetores ou listas de modo sequencial, i. e., elemento por elemento, de modo que a função do tempo em relação ao número de elementos é linear, ou seja, cresce proporcionalmente. Num vetor ordenado, essa não é a pesquisa mais eficiente, a pesquisa (ou busca) binária, por exemplo, é um tipo de pesquisa com o gráfico de tempo logarítmo. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/BuscaSequencial.java "Veja"))</sub>

## <sub>Counting Sort</sub>
<sub>Counting sort é um algoritmo de ordenação estável cuja complexidade é O(n). As chaves podem tomar valores entre 0 e M-1. Se existirem k0 chaves com valor 0, então ocupam as primeiras k0 posições do vetor final: de 0 a k0-1. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/CountingSort.java "Veja"))</sub>

## <sub>Gnome Sort</sub>
<sub>Algoritmo similiar ao Insertion sort com a diferença que o Gnome sort leva um elemento para sua posição correta, com uma seqüencia grande de trocas assim como o Bubble sort.</sub>
<sub>O algoritmo percorre o vetor comparando seus elementos dois a dois, assim que ele encontra um elemento que está na posição incorreta, ou seja, um número maior antes de um menor, ele troca a posição dos elementos, e volta com este elemento até que encontre o seu respectivo lugar. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/GnomeSort.java "Veja"))</sub>

## <sub>Insertion Sort</sub>
<sub>Insertion sort, ou ordenação por inserção, é um simples algoritmo de ordenação, eficiente quando aplicado a um pequeno número de elementos. Em termos gerais, ele percorre um vetor de elementos da esquerda para a direita e à medida que avança vai deixando os elementos mais à esquerda ordenados. O algoritmo de inserção funciona da mesma maneira com que muitas pessoas ordenam cartas em um jogo de baralho como o pôquer. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/InsertionSort.java "Veja"))</sub>

## <sub>Merge Sort</sub>
<sub>O merge sort, ou ordenação por mistura, é um exemplo de algoritmo de ordenação do tipo dividir-para-conquistar. Sua ideia básica consiste em Dividir(o problema em vários sub-problemas e resolver esses sub-problemas através da recursividade) e Conquistar(após todos os sub-problemas terem sido resolvidos ocorre a conquista que é a união das resoluções dos sub-problemas).Como o algoritmo do Merge Sort usa a recursividade em alguns problemas esta técnica não é muito eficiente devido ao alto consumo de memória e tempo de execução. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/MergeSort.java "Veja"))</sup>

## <sub>Quick Sort</sub>
<sub>O algoritmo Quicksort é um método de ordenação muito rápido e eficiente, inventado por C.A.R. Hoare em 19601 , quando visitou a Universidade de Moscovo como estudante. Naquela época, Hoare trabalhou em um projeto de tradução de máquina para o National Physical Laboratory. Ele criou o 'Quicksort ao tentar traduzir um dicionário de inglês para russo, ordenando as palavras, tendo como objetivo reduzir o problema original em subproblemas que possam ser resolvidos mais facil e rapidamente. Foi publicado em 1962 após uma série de refinamentos. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/QuickSort.java "Veja"))</sub>

## <sub>Recursividade</sub>
<sub>Em ciência da computação, a recursividade é a definição de uma subrotina (função ou método) que pode invocar a si mesma. Um exemplo de aplicação da recursividade pode ser encontrado nos analisadores sintáticos recursivos para linguagens de programação. A grande vantagem da recursão está na possibilidade de usar um programa de computador finito para definir, analisar ou produzir um estoque potencialmente infinito de sentenças, designs ou outros dados. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/Recursividade.java "Veja"))</sub>

## <sub>Selection Sort</sub>
<sub>O selection sort (do inglês, ordenação por seleção) é um algoritmo de ordenação baseado em se passar sempre o menor valor do vetor para a primeira posição (ou o maior dependendo da ordem requerida), depois o de segundo menor valor para a segunda posição, e assim é feito sucessivamente com os (n-1) elementos restantes, até os últimos dois elementos. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/SelectionSort.java "Veja"))</sub>

## <sub>Sell Sort</sub>
<sub>Criado por Donald Shell em 1959,1 publicado pela Universidade de Cincinnati, Shell sort é o mais eficiente algoritmo de classificação dentre os de complexidade quadrática. É um refinamento do método de inserção direta.2 O algoritmo difere do método de inserção direta pelo fato de no lugar de considerar o array a ser ordenado como um único segmento, ele considera vários segmentos sendo aplicado o método de inserção direta em cada um deles.3 Basicamente o algoritmo passa várias vezes pela lista dividindo o grupo maior em menores. Nos grupos menores é aplicado o método da ordenação por inserção. Implementações do algoritmo. Procure a versão em inglês desse mesmo link. ([Veja](https://github.com/albertocerqueira/logica-tecnica-programacao/blob/master/src/br/com/logica/tecnicas/programacao/algoritmos/SellSort.java "Veja"))</sub>
