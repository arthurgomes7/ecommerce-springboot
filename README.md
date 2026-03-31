# Ecommerce API

API REST desenvolvida com Spring Boot para estudo de estrutura em camadas com persistencia relacional usando H2.

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
- Injecao de dependencia com Spring
- Mapeamento ORM com JPA/Hibernate
- Seed de dados no startup com `CommandLineRunner`

## Entidades

```text
Costumer
  id
  name
  email
  orders -> OneToMany com Order

Order
  id
  totalValue
  consumer
  date
  orderStatus
  products -> ManyToMany com Product

Product
  id
  name
  price

OrderStatus
  WAITING_PAYMENT
  PAID
  SHIPPED
  CANCELED
```

## Endpoints

- `GET /v1`
  - Retorna a lista de clientes cadastrados

## Banco de Dados

- Banco em memoria com H2
- Console habilitado em `/h2-console`
- JDBC URL: `jdbc:h2:mem:ecommerce`

## Dados Iniciais

Ao iniciar a aplicacao, o projeto persiste dados de teste automaticamente:

- 2 clientes
- 3 produtos
- 2 pedidos

## Execucao

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```
