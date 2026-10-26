# 📒 API de Agenda de Contatos

Uma API REST de agenda de contatos, construída com **Java 17 + Spring Boot + Spring Data JPA + H2**.

## 🚀 Endpoints

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/contatos` | Lista todos os contatos |
| `GET` | `/contatos/{id}` | Busca um contato pelo id |
| `GET` | `/contatos/buscar?nome=Ana` | Busca contatos pelo nome |
| `POST` | `/contatos` | Cria um contato |
| `PUT` | `/contatos/{id}` | Atualiza um contato |
| `DELETE` | `/contatos/{id}` | Remove um contato |

## 📦 Exemplo de JSON

```json
{
  "nome": "Ana",
  "telefone": "9999-9999"
}
```

## ▶️ Como rodar

```bash
mvn spring-boot:run
```

Depois acesse `http://localhost:8080/contatos`.

## 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA (repositories + derived queries)
- H2 (banco de dados em memória)
- Maven
