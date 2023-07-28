# Tarefa 021 - Teste de Software - 28/07/2023

**DEFINIÇÃO**:
1. Definir um conjunto de classes de Equivalência e um conjunto de casos de testes derivados, para testar a seguinte função de avaliação universitária. Por fim implementar este conjunto de casos de testes considerando a implementação deste programa constante do arquivo **avaliacaoEscolar.rar**, disponível no SIGAA.
2. A função avaliação, recebe como parâmetros os seguintes dados:
   2.1. **nota1** (numérico de ponto flutuante com duas casas decimais, sendo valores válidos de 0 a 10);
   2.2. **nota2**  (numérico de ponto flutuante com duas casas decimais);
   2.3. **cargaHoraria** (numérico inteiro, positivo);
   2.4. **faltas** (numérico inteiro, positivo).
3. Antes de efetuar qualquer cálculo, o sistema deverá validar os dados de entrada do usuário. Se algum destes valores for inválido, o sistema deve retornar a mensagem **Valores Inválidos**.
4. A forma de calcular a avaliação é a seguinte:

  4.1. Se a quantidade de faltas for superior a 25% da carga horária, o aluno estará reprovado por falta. Neste caso a função retorna a seguinte mensagem **Reprovado por Falta**;

  4.2. Estando o aluno reprovado por falta, não haverá a necessidade de se avaliar as notas;

  4.3. Se a média entre **nota1** e **nota2** for menor que 3.0, o aluno estará reprovado por média.  Neste caso a função retorna a seguinte mensagem **Reprovado por Média**;

  4.4. Se a média entre **nota1** e **nota2** for >= 3.0 e < 6.0, o aluno estará em recuperação.  Neste caso a função retorna a seguinte mensagem **Recuperação**;

  4.5 Em qualquer outra situação o aluno estará  aprovado. Então a função retornará a mensagem: **Aprovado**.
5. O Conjunto de classes de Equivalência deverá ser definido seguindo o seguinte padrão:

|id|descrição|V/I|
|--|--|--|
- QP = Quantidade de Parâmetros
- qcdn1 = quantidade de casas decimais da variável nota1
- tdn1 = tipo de dado da variável nota1
- qcdn2 = quantidade de casas decimais da variável nota2
- tdn2 = tipo de dado da variável nota2
- vch = valor carga horaria
- qtf = quantidade de faltas
|CE01|QP < 4|I|
|CE02|QP = 4|V|
|CE03|QP > 4|I|
|CE04|valor informado para nota1|V|
|CE05|valor não informado para nota1|I|
|CE06|nota1 < 0.00|I|
|CE07|0.00 <= nota1 <= 10.00|V|
|CE08|nota1 > 10.00|I|
|CE09|qcdn1 < 2|I|
|CE10|qcdn1 = 2|V|
|CE11|qcdn1 > 2|I|
|CE12|tdn1 <> double|I|
|CE13|tdn1 = double|V|
|CE14|valor informado para nota2|V|
|CE15|valor não informado para nota2|I|
|CE16|nota2 < 0.00|I|
|CE17|0.00 <= nota2 <= 10.00|V|
|CE18|nota2 > 10.00|I|
|CE19|qcdn2 < 2|I|
|CE20|qcdn2 = 2|V|
|CE21|qcdn2 > 2|I|
|CE22|tdn2 <> double|I|
|CE23|tdn2 = double|V|
|CE24|valor informado para cargaHoraria|V|
|CE25|valor não informado para cargaHoraria|I|
|CE26|vch não pertence a ch|I|
|CE27|vch pertence a ch|V|
|CE28|vch <> int|I|
|CE29|vch = int|V|
|CE30|valor informado para faltas|V|
|CE31|valor não informado para faltas|I|
|CE32|qtf < 0|I|
|CE33|qtf <= 25% de vch|V|
|CE34|qtf > 25% de vch|V|
|CE35|qtf > vch|I|
|CE36|qtf <> int|I|
|CE37|qtf = int|V|
|CE38|"Valores Inválidos"|V|
|CE39|"Reprovado por Falta"|V|
|CE40|"Reprovado por Média"|V|
|CE41|"Recuperação"|V|
|CE42|"Aprovado"|V|

Onde:

**CE** = Classe de Equivalência, seguido de um número sequencial;

**Descrição** = define um cenário de teste;

**V/I** = Válida ou Inválida.

5. O Conjunto de casos de testes derivado das classes de Equivalência deve seguir o seguinte padrão:

|CT|Nota1|Nota2|CargaHoraria|Faltas|Resultado Esperado|Classe Equivalência|
|--|--|--|--|--|--|--|
|CT01|,7.00,32,8|"Valores Inválidos"|CE01,CE05,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT02|7.00,,32,8|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE15,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT03|7.00,4.00,,8|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE25,CE30,CE34,CE37,CE38|
|CT04|7.00,4.00,32,|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE31,CE38|
|CT05|4.00,7.00,32,8,15|"Valores Inválidos"|CE03,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT06|-4.00,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT07|4.00,-7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE16,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT08|4.00,7.00,-32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE29,CE30,CE33,CE37,CE38|
|CT09|4.00,7.00,32,-8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE32,CE37,CE38|
|CT10|4,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE09,CE12,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT11|4.00,7,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE19,CE22,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT12|4.00,7.00,32.00,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE28,CE30,CE33,CE37,CE38|
|CT13|4.00,7.00,32,8.00|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE36,CE38|
|CT14|11.00,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE08,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT15|4.00,15.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE18,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT16|4.00,7.00,250,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE28,CE30,CE33,CE37,CE38|
|CT17|4.00,7.00,32,35|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE35,CE36,CE38|
|CT18|4.0,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE09,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT19|4.00,7.0,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE19,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT20|4.000,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT21|4.00,7.000,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE21,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT22|4.00,7.00,32,10|"Reprovado por Faltas"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE37,CE39|
|CT23|2.00,1.00,32,8|"Reprovado por Média"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE40|
|CT24|4.00,5.00,32,8|"Recuperação"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|
|CT25|6.00,8.00,32,8|"Aprovado"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|

Onde:

**CT** = Caso de Teste, seguido de um valor sequencial;

**Nota1** é o valor informado para a variável nota1;

**Nota2** é o valor informado para a variável nota2;

**CargaHoraria** é o valor informado para a variável cargaHoraria;

**Faltas** é o valor informado para a variável faltas.

**Resultado esperado** é o resultado que se espera da execução da função;

**Classe de Equivalência** é a identificação de qual classe de equivalência está sendo exercitada pelo caso de teste.

**INSTRUÇÕES**

1. a Definição das classes de equivalência e os casos de testes devem constar deste arquivo. Vocês devem editá-lo para adicionar estes dados.
2. A implementação deve seguir o modelo implementado no arquivo informado no item 1. Se você implementar na Linguagem de Programação Java, basta entregar somente a classe de teste. Se implementar em outra linguagem, deve entregar a classe de implementação da funcionalidade e a classe de teste.
3. A entrega referente a esta tarefa deverá ser efetuada no seu repositório pessoal utilizado para a manutenção do controle de versão dos artefatos relacionados às tarefas da disciplina. Deve-se criar uma pasta chamada **tarefa021**, onde os arquivos devem ser disponibilizados.
4. O prazo para a conclusão desta tarefa é o dia 30/07/2023, as 23h59min.
