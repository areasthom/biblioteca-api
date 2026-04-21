# 📚 Biblioteca API

> API desenvolvida em Java com Spring Boot para gerenciar livros de uma biblioteca.

---

## 📌 Sobre o Projeto

A Biblioteca API é um sistema backend criado para gerenciar livros de forma simples, utilizando uma API REST.

O projeto resolve o problema de organizar e manipular informações de livros, permitindo cadastrar, listar, buscar, atualizar e remover registros.

Ele foi criado para praticar conceitos de desenvolvimento backend com Java e Spring Boot, simulando a estrutura utilizada em aplicações reais.

O que torna este projeto interessante é que ele representa minha transição de aplicações de console para APIs REST, utilizando uma organização mais profissional e próxima do mercado.

---

## 🚀 Funcionalidades

* [x] Cadastro de livros
* [x] Listagem de todos os livros
* [x] Busca de livro por ID
* [x] Atualização de informações de um livro
* [x] Remoção de livros
* [x] Validação para impedir livros duplicados

---

## 🛠️ Tecnologias Utilizadas

* Java
* Spring Boot
* Maven
* Lombok
* API REST
* JSON
* Git e GitHub
* NetBeans

---

## 📚 O Que Aprendi

Durante o desenvolvimento deste projeto, aprendi a:

* Criar uma API REST com Spring Boot;
* Organizar um projeto em camadas (`controller`, `service` e `model`);
* Trabalhar com requisições HTTP (`GET`, `POST`, `PUT` e `DELETE`);
* Utilizar JSON para enviar e receber dados;
* Criar validações para impedir registros duplicados;
* Aplicar conceitos de Programação Orientada a Objetos;
* Usar Git e GitHub para versionamento do projeto.

Esse projeto foi importante para entender como funciona a base de um sistema backend real.

---

## ⚙️ Como Executar o Projeto

```bash
# Clonar o repositório
git clone LINK_DO_REPOSITORIO

# Entrar na pasta do projeto
cd biblioteca

# Abrir o projeto na IDE

# Executar a classe principal
BibliotecaApplication.java
```

Pré-requisitos:

* Ter Java 17 instalado;
* Ter Maven instalado;
* Ter uma IDE Java, como NetBeans ou IntelliJ.

Após executar, a API estará disponível em:

```text
http://localhost:8080/livros
```

Você pode testar as rotas usando o Postman ou o Insomnia.

---

## 🗂️ Estrutura do Projeto

```text
src/main/java/com/thom/biblioteca
│
├── controller
│   └── LivroController.java
│
├── service
│   └── LivroService.java
│
├── model
│   └── Livro.java
│
└── BibliotecaApplication.java
```

### Função de cada pasta

* `controller` → responsável pelas rotas da API;
* `service` → contém a lógica do sistema;
* `model` → representa os dados do projeto;
* `BibliotecaApplication` → classe principal responsável por iniciar a aplicação.

---

## 💡 Melhorias Futuras

* Adicionar banco de dados com MySQL;
* Utilizar Spring Data JPA;
* Melhorar o tratamento de erros;
* Adicionar validação de campos;
* Criar documentação com Swagger;
* Implementar testes automatizados;
* Fazer deploy da API.

---

## 🔗 Projeto no LinkedIn

```text
Link da publicação: COLE_AQUI_O_LINK_DO_POST
```

---

## 👤 Autor

```text
Nome: Thomas
GitHub: https://github.com/areasthom
LinkedIn: https://www.linkedin.com/in/thomas-samuel-da-luz-areas-7a1230346/
E-mail: thomluz.areas@gmail.com
```
