# Workshop Spring Boot 3.5.4 com JPA

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Wrapper-orange)
![License](https://img.shields.io/badge/License-MIT-green)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Este repositório contém o código desenvolvido durante o curso **Spring Boot 3.5.4 com JPA** do professor **Nélio Alves** na Udemy.  
O projeto demonstra o uso de **Spring Boot**, **JPA**, **REST APIs**, **validações** e **testes** em uma aplicação prática.

---

## 📁 Estrutura do Projeto

```plaintext
workshop-springboot3.5.4-jpa/
├── .metadata/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/marrafon/workshop/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── exception/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── WorkshopSpringboot354JpaApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
├── .gitignore
├── LICENSE
├── mvnw
├── mvnw.cmd
└── pom.xml
```
---

## 📂 Descrição das Pastas  

**controller/:** Classes que implementam os endpoints REST da aplicação.  
**dto/:** Objetos de Transferência de Dados (Data Transfer Objects) usados entre camadas.   
**exception/:** Classes para tratamento de exceções personalizadas.  
**model/:** Entidades JPA que representam tabelas do banco de dados.  
**repository/:** Interfaces que estendem JpaRepository para operações CRUD.  
**service/:** Contém a lógica de negócios da aplicação.  
**resources/application.properties:** Configurações do Spring Boot e banco de dados.  
**resources/static/:** Arquivos estáticos (HTML, CSS, JS).  

---

## 📡 Endpoints Disponíveis  

**Método**	Endpoint	Descrição  
**GET**	/api/usuarios	Lista todos os usuários  
**GET**	/api/usuarios/{id}	Retorna usuário por ID  
**POST**	/api/usuarios	Cria um novo usuário  
**PUT**	/api/usuarios/{id}	Atualiza usuário existente  
**DELETE**	/api/usuarios/{id}	Remove usuário por ID  
---

## ⚙️ Tecnologias Utilizadas  
Java 17  
Spring Boot 3.5.4  
Spring Data JPA  
H2 Database  
Spring Web  
Spring Validation  
Spring Boot DevTools  
JUnit 5  
Maven Wrapper  
---

## 📚 **Aprendizados**  
Durante o desenvolvimento deste projeto, foram aplicados e estudados conceitos como:  
Criação de APIs RESTful com Spring Boot  
Mapeamento de entidades JPA e relacionamentos  
Validações de entrada com Spring Validation  
Tratamento de exceções personalizadas  
Testes automatizados com JUnit 5  
Gerenciamento de dependências com Maven Wrapper  

---

## 🚀 Como Executar o Projeto  
Clone o repositório  
``` bash  
git clone https://github.com/Marrafon91/workshop-springboot3.5.4-jpa.git
```


