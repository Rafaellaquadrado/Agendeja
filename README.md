# Agendeja
# Sistema de Agendamento de Consultas
🎯 Objetivo
Desenvolver um sistema web de agendamento de consultas médicas, com:

Cadastro de pacientes

Listagem e exclusão de pacientes

Integração com banco de dados MySQL

Backend com Spring Boot

Frontend com JSF

🚀 Tecnologias utilizadas
Java 17

Spring Boot

Spring Data JPA

JSF (Jakarta Faces)

Jakarta CDI

MySQL

Maven

Eclipse IDE

🔧 Como rodar o projeto:

Pré-requisitos
Java 17 instalado

MySQL instalado e rodando

Eclipse ou IDE de sua preferência com suporte a Maven

Git instalado

Configuração do banco de dados
1. Crie um banco de dados no MySQL:

sql
Copiar
Editar
CREATE DATABASE agendamento;

2.Atualize as credenciais no arquivo src/main/resources/application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/agendamento
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

Rodando a aplicação:

1.No terminal, na raiz do projeto:

bash
Copiar
Editar
mvn spring-boot:run

2.Acesse no navegador:

bash
Copiar
Editar
http://localhost:8080/WEB-INF/views/pacientes.xhtml

📂 Estrutura do projeto
css
Copiar
Editar
src/
 └─ main/
     ├─ java/
     │   └─ com.agendeja.agendamento
     │        ├─ AgendamentoApplication.java
     │        ├─ model/
     │        ├─ repository/
     │        └─ controller/
     └─ resources/
         └─ application.properties
 └─ webapp/
     └─ WEB-INF/views/pacientes.xhtml
     
✨ Próximos passos:
Implementar cadastro de médicos

Implementar cadastro de consultas

Tela inicial com dashboard

Melhorias visuais no frontend com PrimeFaces ou Bootstrap

👩‍💻 Autor
Lara Rafaella Quadrado Faria
LinkedIn https://www.linkedin.com/in/lara-rafaella-de-oliveira-quadrado-faria-25b624178/
