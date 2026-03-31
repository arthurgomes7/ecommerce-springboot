# Ecommerce API

API REST desenvolvida com Spring Boot para estudo de estrutura em camadas com persistência relacional usando H2.

## Stack

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## Padroes Utilizados

- Arquitetura em camadas: `controller -> service -> repository`
- Repository Pattern com `JpaRepository`
- Injeção de dependência com Spring
- Mapeamento ORM com JPA/Hibernate
- Seed de dados no startup com `CommandLineRunner`

## Entidades

- `Costumer`
  - `id`
  - `name`
  - `email`
  - relacionamento `OneToMany` com `Order`

- `Order`
  - `id`
  - `totalValue`
  - `consumer`
  - `date`
  - `orderStatus`
  - relacionamento `ManyToMany` com `Product`

- `Product`
  - `id`
  - `name`
  - `price`

- `OrderStatus`
  - `WAITING_PAYMENT`
  - `PAID`
  - `SHIPPED`
  - `CANCELED`

## Endpoints

- `GET /v1`
  - Retorna a lista de clientes cadastrados

## Banco de Dados

- Banco em memória com H2
- Console habilitado em `/h2-console`
- JDBC URL: `jdbc:h2:mem:ecommerce`

## Dados Iniciais

Ao iniciar a aplicação, o projeto persiste dados de teste automaticamente:

- 2 clientes
- 3 produtos
- 2 pedidos

## Execução

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```
