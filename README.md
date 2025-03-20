# Java-Activity
## Proposta:
- Defina 5 atributos para representar um Produto;
- Defina no mínimo 3 métodos construtores;
- Faça o Encapsulamento de todos atributos da classe;
- Desenvolva métodos de funcionalidades que achar necessário.
- Na classe Main apresente um menu com as opções:
- Criar um produto;
- Alterar dados de um produto;
- Excluir um produto;
- Listar todos os produtos;
- Sair.
- O programa somente encerará ao escolher a opção "Sair".

# Processo, como foi/dificuldades: 🤔
<p> Após, ler as instruções pensei já mais o menos como faría o produto, optei por fazer uma espécie de venda de imóveis. Para isto utilizei
o switch case para montar como se fosse o painel desta loja. Após tentar cria-lo sózinho acabei me deparando com uma dificuldade, que seria 
como eu montaria a lista, apropósito pensei em utilizar vetores todavia achei que seria estranho se estivesse ali uma limitação de 20 ou até mesmo
grande o suficiente para ser "infinita". Ai que me foi mostrado a biblioteca ArrayList, a princípio está biblioteca faz com que o array seja indefinido, algo diferente para mim que sempre tive que colocar um limite em um array. Após conversar com o professor e ver alguns vídeos ensinando sobre o mesmo no youtube / fóruns, entendi relativamento como o mesmo funciona, precisando ser definido com 
  
  ```
  ArrayList<tipo_da_variavel> produtos = new ArrayList<>();
  ```
<p> 
    (no meu caso), e para acessa-lo seria necessário criar um novo produto, e nesse novo produto digitar 
</p>
  
  ```
    produtos.add( novoProduto.setAlgo() );
  ```
   Só que no meu caso eu fiz com que esse aray fosse uma string, e nesse produtos.add, vincula-se um método onde os valores eram armazenados em uma string. Sei que isso tem alguns erros, todavia, como primeiro projeto acho que me sai bem. E acho que foi isso, pois, depois da dificuldade de entender como funcionava a biblioteca Array List, o resto ficou fácil pois é apenas o mesmo de outra linguagem como js. <strong>Abaixo deixarei mais detalhado o que cada coisa faz</strong>, todavia, este é o processo.
</p>

# Solução: 💡
- ## <strong>Criação de atributos </strong>
<p> Optei por criar 5 atributos apenas sendo esses:</p>

```
    String endereco;
    String preco;
    boolean avenda;
    boolean nova;
    String imovel;
```
<p>
  Endreço, receberia o local do usuário
  
  Preco, receberia o valor deste produto (imóvel), em String para conter também o R$ ou qualquer outro.. 
  
  Avenda, receberia se o imóvel está ou não há venda
  
  Imovel, receberia qual o tipode de imóvel (Casa, apartamento etc..)
</p>

- ## <strong> Métodos Construtores </strong>
<p> Em meus 3 métodos construtores obrigatórios, achei necessário separar-los caso houvesse a ausência de um ou mais: </p>

```
    public Produto(String imovel,String endereco, String preco, boolean avenda, boolean nova){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
        this.avenda = avenda;
        this.nova = nova;
    }
```
```
    public Produto(String imovel,String endereco, String preco){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
    }
```
```
   public Produto(boolean avenda, boolean nova){
        this.avenda = avenda;
        this.nova = nova;
```
```
public Produto() {

    }
```

- ## <strong>Métodos de funcionalidades</strong>

<p> Acabei utilizando um método funcional para exibir os valores, queria faze-lo aparecer dessa forma, todavia, por ser uma das primeiras aulas utilizando a biblioteca ArrayList, acabei não entendendo 100% como utiliza-la de forma eficiente.</p>

```
public static String index(String endereco, String imovel, boolean avenda, boolean nova, String preco) {
        return "\n"+"\nEndereco: " + endereco + "\nTipo de imóvel: " + imovel + "\nÀ venda: " + avenda + "\nNovo: " + nova + "\nPreço: " + preco +"\n";
    }
    
```
- ## <strong>Encapsulamento</strong>
<p> Fiz o Encapsulamento dos 5 atributos:</p>

```
private String endereco;
    private String preco;
    private boolean avenda;
    private boolean nova;
    private String imovel;
```

- ## <strong>Funções:</strong>
- <p> <strong> Função Criar um Produto: </strong></p>
<p> Fiz a função cadastrar de forma bem tranquila, o usuário digita onde-se localiza o imóvel, se está avenda, etc.. <br>
e no final, o mesmo cadastra este digamos ficha, e atrubui ele ao produtos.Produto.Index(...) que armazena em formato de String os dados.
</p>

- <p> <strong>Função Alterar um Produto:</strong></p>
<p>
  Ela lista todos os objetos e utiliza o index para alterá-lo, após isso, cadastra novamente o produto antigo para o novo.
</p>

- <p> <strong>Função Excluir um produto:</strong></p>
<p>
  Ela lista todos os produtos e utiliza o index para alterá-lo,
</p>

- <p> <strong>Função Listar um produto:</strong></p>
<p>
  Ela lista todos os produtos utilizando um laço for.
</p>

```
for (int i = 0; i < produtos.size(); i++) {
        System.out.println("\n[\n Index: " + i + "\n" + produtos.get(i) + "\n ]\n");
}
```

# Considerações: 🎭
<p>
Achei muito interessante, gosto de atividades práticas, o teórico é necessário é claro, todavia não há nada melhor que praticar !!
</p>
