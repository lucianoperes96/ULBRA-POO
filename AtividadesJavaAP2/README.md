# Projeto - Sistema de Gerenciamento de Veículos

## Descrição Geral
Este projeto faz parte de uma atividade prática relacionada a linguagem Java do curso de Análise e Desenvolvimento de Sistemas, tem como objetivo aplicar os conceitos aprendidos na disciplina de Programação Orientada a Objetos, como herança, encapsulamento, métodos de acesso e classes abstratas.

O sistema desenvolvido simula um **gerenciador simples de veículos**, permitindo criar e exibir informações de **carros** e **motos** por meio de classes bem estruturadas e reutilizáveis.

---

## Descrição das Tarefas

### Classe Abstrata `T01_Veiculo`
- Criada como **abstrata** para servir de base às demais classes.
- **Atributos:**
    - `marca` (público)
    - `modelo` (público)
    - `ano` (privado)
- **Métodos:**
    - `getAno()` e `setAno(int ano)` para acessar e modificar o atributo `ano`.
    - `informacoesVeiculo()` - método abstrato a ser implementado pelas subclasses.

### Classe `T02_Carro`
- Herda da classe `T01_Veiculo`.
- **Atributo adicional:** `numeroPortas` (público).
- Implementa o método `informacoesVeiculo()`, retornando todos os dados do carro em formato de texto.

### Classe `T03_Moto`
- Herda da classe `T01_Veiculo`.
- **Atributo adicional:** `cilindrada` (privado).
- Possui métodos `getCilindrada()` e `setCilindrada(int cilindrada)`.
- Implementa o método `informacoesVeiculo()` para exibir os dados da moto.

### Classe `T04_Main`
- Contém o método `main()` que executa o programa.
- **Responsável por:**
    - Instanciar objetos das classes `T02_Carro` e `T03_Moto`.
    - Definir valores para os atributos.
    - Exibir as informações utilizando o método `informacoesVeiculo()`.

---

## Exemplo de Saída

Carro - Marca: Toyota, Modelo: Corolla, Ano: 2020, Número de Portas: 4  
Moto - Marca: Honda, Modelo: CB 500F, Ano: 2022, Cilindrada: 500cc

---

## Conceitos Aplicados

- **Herança:** `T02_Carro` e `T03_Moto` estendem `T01_Veiculo`.
- **Encapsulamento:** Atributos privados com métodos getters e setters.
- **Classe Abstrata:** Define comportamento comum para diferentes tipos de veículos.
- **Sobrescrita de Método:** Cada classe filha implementa o método `informacoesVeiculo()` de forma personalizada.

---

## Instruções de Execução

### Requisitos
- Java JDK 25 (ou superior) instalado
- IntelliJ IDEA Community Edition 2025.2.4 (ou outro IDE compatível)

### Passo a Passo

1. **Abra o IntelliJ IDEA** e crie um novo projeto Java.
2. Dentro da pasta `src`, crie as classes conforme os nomes indicados (`T01_Veiculo.java`, etc).
3. Copie o conteúdo das classes correspondentes para cada arquivo.
4. Para executar:
    - Clique com o botão direito sobre a classe T04_Main.
    - Selecione **"Run 'T04_Main.main()'"**.
    - O programa será executado no console (ou em janelas, conforme o caso).

---

## Autor
**Nome:** Luciano Cardoso Peres  
**Disciplina:** Programação Orientada a Objetos  
**IDE:** IntelliJ IDEA Community Edition 2025.2.4  
**Data:** Novembro / 2025