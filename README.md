# Desafio de Controle de Fluxo

## Descrição

Este projeto foi desenvolvido como parte de um exercício para praticar o controle de fluxo em Java, com foco no uso de loops e tratamento de exceções personalizadas. O sistema recebe dois parâmetros inteiros e realiza a impressão de uma sequência de números no console. Se os parâmetros não atenderem às condições especificadas, uma exceção personalizada é lançada.

## Funcionalidades

- **Recebimento de Parâmetros:** O programa recebe dois números inteiros via terminal.
- **Validação de Parâmetros:** Se o primeiro número for maior que o segundo, uma exceção personalizada `ParametrosInvalidosException` é lançada.
- **Loop de Impressão:** Se os parâmetros forem válidos, o programa imprime uma sequência de números no console.

## O que foi praticado

- **Controle de Fluxo:** Implementação de loops utilizando a estrutura `for`.
- **Tratamento de Exceções:** Criação e uso de exceções personalizadas em Java para validar condições de entrada.
- **Interação com o Usuário:** Leitura de parâmetros via terminal e fornecimento de feedback ao usuário.

## Como Executar

1. Compile o projeto:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
