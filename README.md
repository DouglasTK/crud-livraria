Sistema de Controle de Biblioteca - CRUD Livraria

📚 Sobre o Projeto

Este projeto consiste em um Sistema de Controle de Biblioteca desenvolvido utilizando Java Web com Spring Boot, MongoDB e Thymeleaf.

O sistema permite o gerenciamento de livros através de operações CRUD (Create, Read, Update e Delete), possibilitando o cadastro, listagem, atualização e remoção de livros do banco de dados.

O objetivo do projeto é aplicar conceitos de:

Desenvolvimento Web com Java
Arquitetura MVC
Spring Framework
Integração com MongoDB
Thymeleaf
Padrão em camadas
APIs REST
Persistência de dados

🛠 Tecnologias Utilizadas
Java 17
Spring Boot
Spring Web
Spring Data MongoDB
Thymeleaf
Maven
MongoDB
HTML5
CSS3

📂 Estrutura do Projeto
src/main/java/
│
├── controller
│   ├── LivroController.java
│   └── LivroWebController.java
│
├── service
│   └── LivroService.java
│
├── repository
│   └── LivroRepository.java
│
├── entity
│   └── LivroEntity.java
│
└── CrudLivrariaApplication.java

src/main/resources/
│
├── templates
│   ├── principal.html
│   ├── listar.html
│   ├── cadastrar.html
│   ├── atualizar.html
│   └── delete.html
│
└── application.properties

🧱 Arquitetura Utilizada

O projeto foi desenvolvido utilizando o padrão MVC (Model-View-Controller) com separação em camadas:

Controller → Responsável pelas requisições HTTP
Service → Responsável pelas regras de negócio
Repository → Responsável pela comunicação com o banco de dados
Entity → Representação das entidades do sistema
View → Interfaces HTML utilizando Thymeleaf

Fluxo da aplicação:

Usuário → Controller → Service → Repository → MongoDB

⚙️ Configuração do MongoDB

Certifique-se de possuir o MongoDB instalado e em execução localmente.

No arquivo application.properties, configure:

spring.application.name=crud-livraria
spring.data.mongodb.uri=mongodb://localhost:27017/livraria
spring.thymeleaf.cache=false
server.port=8080

▶️ Como Executar o Projeto
1. Clonar o repositório
git clone https://github.com/DouglasTK/crud-livraria.git

2. Acessar a pasta do projeto
cd crud-livraria

3. Executar o MongoDB
Inicie o serviço do MongoDB localmente.

4. Executar o projeto
Utilizando Maven:
mvn spring-boot:run
Ou execute diretamente pela IDE

🌐 Acesso da Aplicação
Após iniciar o projeto:
http://localhost:8080

📌 Funcionalidades
✅ Cadastro de livros
✅ Listagem de livros
✅ Atualização de livros
✅ Remoção de livros
✅ Integração com MongoDB
✅ Interface Web com Thymeleaf
✅ API REST

🔗 Endpoints da API
Listar livros
GET /livros

Buscar livro por ID
GET /livros/{id}

Cadastrar livro
POST /livros/add

Atualizar livro
PUT /livros/update

Deletar livro
DELETE /livros/delete/{id}

📖 Entidade Principal
LivroEntity

A entidade Livro possui os seguintes atributos:
id
nomeLivro
autor
status

