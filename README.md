<h1>Algoritmos de Ordenação Comparativos</h1>
<h2>Principais Algoritmos de Ordenação Comparativos</h2>

<h3>Elementares</h3>
<ul>
  <li>Selection Sort</li>
  <li>Insertion Sort</li>
  <li>Bubble Sort</li>
</ul>

<p>Shell Sort</p>

<h3>Não Elementares</h3>
<ul>
  <li>Merge Sort</li>
  <li>Quick Sort</li>
  <li>Heap Sort</li>
</ul>

<h3>Selection Sort</h3>
<p><strong>Iteração:</strong> procurar pelo menor elemento da sequência nãoordenada e concatená-lo na sequência ordenada; <br> Os valores dos dados não interferem na execução do algoritmo.</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Não</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li> Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
  </ul>
</ul>


<h3>Insertion Sort</h3>
<p><strong>Iteração:</strong> inserir o primeiro elemento da sequência não-ordenada
na sequência ordenada;<br>Os valores dos dados interferem na execução do algoritmo.</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li> Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛)</li>
    </ul>
  </ul>
</ul>


<h3>Bubble Sort</h3>
<p><strong>Iteração:</strong> percorrer toda a sequência não-ordenada comparando
todos os vizinhos e trocando de posição quando necessário. No
final, o menor elemento poderá ser concatenado na sequência
ordenada;<br>Os valores dos dados interferem na execução do algoritmo.</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛²)</li>
    </ul>
    <li> Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛)</li>
    </ul>
  </ul>
</ul>


<h3>Shell Sort</h3>
<p>Os valores dos dados interferem na execução do algoritmo;<br>A sequência de espaçamento interfere na execução do algoritmo;</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Não</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>? ➔ depende da sequência!</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>? ➔ depende da sequência!</li>
    </ul>
    <li>Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛)</li>
    </ul>
  </ul>
</ul>


<h3>Merge Sort</h3>
<p>Os valores dos dados não-interferem na execução do algoritmo;</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li> Não ➔ usa memória auxiliar!</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
    <li>Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
  </ul>
</ul>

<h3>Quick Sort</h3>
<p>Escolha de um elemento pivô;</p>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Não</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛²) ➔ !!!)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
    <li>Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
  </ul>
</ul>

<h3>Quick Sort 3-Way</h3>
<p>Resolve o problema das chaves
duplicadas, dividindo o array em
três faixas:</p>
<ol>
  <li>Menores</li>
  <li>Iguais</li>
  <li>Maiores</li>
</ol>


<h3>Heap Sort</h3>
<p>Ordenação utilizando a estrutura Heap;</p>
<p>Duas etapas:</p>
<ol>
  <li>Construção da estrutura max-heap;</li>
  <li>Ordenação pela concatenação dos valores máximos obtidos:</li>
  <ul>
    <li>Iteração: removendo um elemento (maior) por vez do heap.</li>
  </ul>
</ol>
<ul>
  <li>In-place?</li>
  <ul>
    <li>Sim</li>
  </ul>
  <li>Estável?</li>
  <ul>
    <li>Não</li>
  </ul>
  <li>Complexidade:</li>
  <ul>
    <li>Pior caso:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
    <li>Caso médio:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
    <li>Melhor caso:</li>
    <ul>
      <li>𝑂(𝑛 lg 𝑛)</li>
    </ul>
  </ul>
</ul>
