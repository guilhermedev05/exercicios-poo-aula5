# Exercícios de Programação em Java

Este repositório contém quatro exercícios práticos desenvolvidos em Java. Cada exercício está organizado em sua própria pasta, contendo um diretório `src` onde está localizado o arquivo da classe principal. O objetivo desses exercícios é aprimorar habilidades na criação de classes, manipulação de atributos e implementação de métodos de cálculo.

## Estrutura do Repositório

```
/
|-- ex1_funcionario/
|   |-- src/
|   |   |-- Funcionario.java
|
|-- ex2_triangulo/
|   |-- src/
|   |   |-- Triangulo.java
|
|-- ex3_torneio/
|   |-- src/
|   |   |-- Torneio.java
|
|-- ex4_vendedor/
|   |-- src/
|   |   |-- Vendedor.java
|
|-- .gitignore
```

## Exercícios

### 1. Funcionário
- **Objetivo:** Criar a classe `Funcionario` com construtores e métodos para calcular aumento de salário.
- **Atributos:**
  - `cracha` (int)
  - `salario` (float)
  - `cargo` (String)
- **Métodos:**
  - Construtor vazio que atribui "assistente" ao cargo.
  - Construtor que recebe parâmetros para os atributos.
  - Métodos para calcular aumento salarial com base em porcentagem ou tempo trabalhado.

### 2. Triângulo
- **Objetivo:** Criar a classe `Triangulo` que possui os métodos para cálculo de área e manipulação de atributos.
- **Atributos:**
  - `base` (double)
  - `altura` (double)
- **Métodos:**
  - Construtores para inicialização da base e altura.
  - Métodos de acesso (`getBase()`, `setBase()`, `getAltura()`, `setAltura()`).
  - Método para calcular a área: `area = base * altura / 2`.

### 3. Torneio
- **Objetivo:** Criar a classe `Torneio` que representa um torneio com categoria de atleta baseado na idade.
- **Atributos:**
  - `nome` (String)
  - `idade` (int)
- **Métodos:**
  - Métodos para acesso e modificação dos atributos.
  - Método `verificarCategoria()` que retorna a categoria do atleta:
    - **Infantil:** 5 a 7 anos
    - **Juvenil:** 8 a 10 anos
    - **Adolescente:** 11 a 15 anos
    - **Adulto:** 16 a 30 anos
    - **Sênior:** Acima de 30 anos

### 4. Vendedor
- **Objetivo:** Criar a classe `Vendedor` com atributos para vendas, salário, nome e faltas, e implementar cálculos de comissão e descontos.
- **Atributos:**
  - `vendas` (float)
  - `salario` (float)
  - `nome` (String)
  - `falta` (int)
- **Métodos:**
  - Métodos para acessar e modificar os atributos.
  - Método para calcular comissão com base nas vendas:
    - 10% para vendas de R$1.000 a R$1.999.
    - 15% para vendas acima de R$2.000.
  - Método para calcular o desconto das faltas: `(salario / 30) * falta`.
  - Método `calcularSalario()` que calcula o salário total com comissão e desconto.

## Como Executar os Exercícios

1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Acesse a pasta do exercício desejado e compile o código:
   ```sh
   cd ex1_funcionario/src  # Substitua pelo exercício desejado
   javac Funcionario.java
   ```
3. Execute o programa:
   ```sh
   java Funcionario
   ```
4. O programa será executado e as saídas serão mostradas no console.

## Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- IDE recomendada: IntelliJ IDEA, Eclipse, ou VSCode com suporte para Java

## Contribuição

Sinta-se à vontade para contribuir com melhorias, sugestões e correções. Para isso, abra um pull request ou uma issue.
