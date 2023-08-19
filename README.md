# AtividadeTestesUnitarios

## Sobre
Repositório criado para a atividade sobre testes unitários da matéria de Testes de Software.

## Objetivo
Desenvolver um caso de teste em seguida desenvolver as classes e as classes de teste para validar o caso de teste.

## Casos de testes

### CT-001: Validar cálculo de notas de aluno
**Descrição:** Este caso de teste tem como objetivo verificar se a funcionalidade ao receber as notas e os pesos de cada nota, é capaz de indicar se o aluno foi aprovado ou não.

**Resultado esperado:** Após receber as notas e seus respectivos pesos, o sistema deve retornar a aprovação como true.

#### CT-001.1: Verificar cálculo de nota x peso
**Descrição:** Este caso de teste verifica se as notas são calculadas corretamente levando em consideração seu respectivo peso.

#### CT-001.2: Verificar nota total
**Descrição:** Este caso de teste verifica se ao receber mais de uma nota, o cálculo da nota total ficará correto.

#### CT-001.3: Verificar peso total
**Descrição:** Este caso de teste verifica se ao receber mais de uma nota, o cálculo do peso total ficará correto.

#### CT-001.3: Verificar cálculo da média
**Descrição:** Este caso de teste verifica se a média é calculada corretamente.

#### CT-001.4: Verificar aprovação
**Descrição:** Este caso de teste verifica se a função identifica corretamente alunos aprovados com base na média calculada.

### CT-002: Validar tratamento de exceções de nota
**Descrição:** Este caso de teste tem como objetivo verificar se todas as exceções que podem ser geradas no sistema ao inserir dados inválidos estão sendo tratados corretamente.

**Resultado esperado:** Ao inserir valores inválidos para nota (menor que 0 ou maior que 10) o sistema deve lançar uma exceção informando que a nota informada é inválida.

#### CT-002.1: Verificar tratamento de erro ao inserir uma nota menor que 0
**Descrição:** Este caso de teste verifica se ao inserir uma nota menor que 0, o sistema lança exceção informando que a nota é inválida.

#### CT-002.2: Verificar tratamento de erro ao inserir uma nota maior que 10
**Descrição:** Este caso de teste verifica se ao inserir uma nota maior que 10, o sistema retorna a informação de que a nota é inválida.
