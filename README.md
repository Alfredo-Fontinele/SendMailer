# SendMailer - Aplicação Spring Boot para Envio de E-mails

SendMailer é uma aplicação desenvolvida em Spring Boot que oferece a funcionalidade de envio de e-mails. A aplicação segue a arquitetura Clean Architecture, proporcionando modularidade e facilidade de manutenção.

## Requisitos

- Java 8 ou superior
- Maven

## Configuração

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/SendMailer.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd SendMailer
    ```

3. [Opcional] Se você deseja utilizar o serviço AWS SES para envio de e-mails, descomente a configuração no arquivo `application.properties` e forneça as credenciais necessárias.

## Uso

A aplicação fornece duas vertentes para envio de e-mails:

1. **Java Mail (está sendo utilizado):**

2. **AWS SES (está comentado):**


* Obs: O código do Service da AWS está comentado para não conflitar com o Service do Java Mail, por que conforme o título dessa aplicação, ela foi feita utilizando Clean Architecture e, nesse caso, está simulando a possibilidade no mundo real de que, se for necessário utilizar um novo meio de enviar e-mails, perceba o quão simples é de se implementar, basta criar o Service especifico e pronto.


   - Observe o arquivo `application.properties` para atualizá-lo para utilizar em seu contexto
    - Execute a aplicação:

        ```bash
        mvn spring-boot:run
        ```
