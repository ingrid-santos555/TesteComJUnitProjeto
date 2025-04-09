# Projeto de Testes Automatizados com JUnit

Este projeto contém um exemplo simples de testes automatizados utilizando **JUnit 5** em um ambiente Maven.

---

## Objetivos

- Criar um projeto simples com suporte a testes automatizados
- Aplicar testes unitários com JUnit

---

## Tecnologias utilizadas

- Java `23.0.2`
- Maven
- JUnit 5 (a dependência original do `JUnit 3.8.1` foi substituída por `JUnit 5`)

---

## Estrutura

- `src/main/java/com/ingrid/App.java`: Classe principal com um método de exemplo (`somar`).
- `src/test/java/com/ingrid/AppTest.java`: Classe de teste utilizando anotações do JUnit 5 (`@Test` e `assertEquals`).

---

##  Como executar os testes

1. Certifique-se de ter o **Java** e o **Maven** instalados.
2. Abra o terminal na pasta do projeto.
3. Execute o seguinte comando:

```bash
mvn test
```

O Maven irá compilar o projeto e rodar os testes automaticamente. Se tudo estiver certo, você verá a saída com **BUILD SUCCESS**.

---

##  Observações

- O `pom.xml` foi atualizado para utilizar o JUnit 5 ao invés da versão 3.8.1 que vem por padrão.
- Esse projeto foi criado no **Prompt de Comando do Windows** com o comando `mvn archetype:generate` e, depois, o código foi organizado e testado no **VS Code**.

---

##  Propósito

Este projeto foi construído para demonstrar o uso básico de testes unitários em Java com JUnit 5, explorando boas práticas e estrutura de projeto.

---

## Feito por Ingrid Santos
