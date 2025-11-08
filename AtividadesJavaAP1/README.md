# Projeto – Atividades em Java

Este projeto contém **7 programas em Java**, cada um desenvolvido para exercitar diferentes conceitos fundamentais da linguagem, como entrada de dados, estruturas de decisão e laços de repetição.  
Cada tarefa foi implementada em uma classe separada, seguindo as instruções fornecidas pela disciplina.

---

## Tarefas

### Tarefa 01 – Calculadora de Desconto
**Classe:** `T01_CalculadoraDesconto`  
Recebe o valor de um produto e a porcentagem de desconto via teclado (`Scanner`).  
Calcula o valor do desconto e exibe o preço final do produto após aplicar o desconto.

**Entrada:**
- Valor do produto
- Porcentagem de desconto

**Saída:**
- Valor do desconto
- Preço final do produto

---

### Tarefa 02 – Calculadora de ITBI
**Classe:** `T02_CalculadoraITBI`  
Usa janelas de diálogo (`JOptionPane`) para receber o valor de transação, o valor venal do imóvel e a porcentagem do imposto ITBI.  
O imposto é calculado sobre o **maior valor** entre o valor de transação e o valor venal.

**Entrada:**
- Valor de transação
- Valor venal
- Percentual de ITBI

**Saída:**
- Base de cálculo
- Valor do ITBI

---

### Tarefa 03 – Sistema de Avaliação
**Classe:** `T03_SistemaAvaliacao`  
Lê, via `JOptionPane`, as notas de duas provas e de um trabalho.  
Calcula a média e informa se o aluno está **aprovado (média ≥ 6)** ou **reprovado**.

**Entrada:**
- Nota da primeira prova
- Nota da segunda prova
- Nota do trabalho

**Saída:**
- Média
- Situação (Aprovado/Reprovado)

---

### Tarefa 04 – Calculadora de Aposentadoria
**Classe:** `T04_CalculadoraAposentadoria`  
Recebe idade, sexo e anos de contribuição de uma pessoa e verifica se ela já pode se aposentar.  
As regras são:
- **Homens:** 65 anos de idade **ou** 35 anos de contribuição
- **Mulheres:** 62 anos de idade **ou** 30 anos de contribuição

**Entrada:**
- Idade
- Sexo (M/F)
- Anos de contribuição

**Saída:**
- Mensagem informando se pode se aposentar ou quantos anos faltam

---

### Tarefa 05 – Circuito de Resistências
**Classe:** `T05_CircuitoResistencias`  
Lê quatro resistências ligadas em série e calcula a **resistência equivalente**, além de identificar a **maior** e a **menor** resistência.

**Entrada:**
- Quatro valores de resistência

**Saída:**
- Resistência equivalente
- Maior e menor resistência

---

### Tarefa 06 – Sistema de Login
**Classe:** `T06_SistemaLogin`  
Simula um sistema de login simples com três tentativas.  
O acesso é permitido apenas se o usuário e a senha forem `"java8"`.

**Entrada:**
- Login
- Senha

**Saída:**
- Mensagem de sucesso ou falha de autenticação

---

### Tarefa 07 – Gerador de Tabuada
**Classe:** `T07_GeradorTabuada`  
Recebe um número inteiro e exibe a tabuada desse número de 1 a 10 usando um laço `for`.

**Entrada:**
- Número inteiro

**Saída:**
- Tabuada do número digitado

---

## Como Executar os Programas

### Pré-requisitos
- **Java JDK 25** (ou superior) instalado
- **IntelliJ IDEA Community Edition 2025.2.4** (ou outro IDE compatível)

### Passos para execução:
1. **Abra o IntelliJ IDEA** e crie um novo projeto Java.
2. Dentro da pasta `src`, crie as classes conforme os nomes indicados (`T01_CalculadoraDesconto.java`, etc).
3. Copie o conteúdo das classes correspondentes para cada arquivo.
4. Para executar:
    - Clique com o botão direito sobre a classe desejada.
    - Selecione **"Run 'NomeDaClasse.main()'"**.
    - O programa será executado no console (ou em janelas, conforme o caso).

---

## Conceitos Aplicados
- Leitura de dados com `Scanner` e `JOptionPane`
- Estruturas condicionais (`if`, `else`, operador ternário)
- Estruturas de repetição (`for`)
- Operações matemáticas básicas
- Manipulação de strings
- Boas práticas de organização de código

---

## Autor
**Nome:** Luciano Cardoso Peres  
**Disciplina:** Programação Orientada a Objetos  
**IDE:** IntelliJ IDEA Community Edition 2025.2.4  
**Data:** Novembro / 2025  