# Project
##poc-quarkus-flyway-csv  

####Projeto trata-se de:
    -Criar uma POC para avaliar se o quarkus + flyway permitir importação de CSV.

## Rodando a aplicação em modo dev

Você pode executar o seu arquivo noi modo dev que permite a codificação ao vivo usando:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  O Quarkus agora vem com uma UI Dev, que está disponível no modo dev apenas em http://localhost:8080/q/dev/.

## Configurações do projeto

####Para iniciar o projeto, utilizaremos extenções e documentações do site: https://quarkus.io/

No quarkus.io determinamos o nome do projeto e quais as extenções iniciais queremos inicializar.  
Neste projeto não vamos começar com nenhuma. Adicionaremos em seguida as extensões necessárias.  
Após a configuração do projeto no quarkus.io, baixamos o ZIP e colocamos no diretório escolhido.  
E com o comando **./mvnw compile quarkus:dev** rodamos a aplicaçãop em nosso **localhost:8080**.  

![](src/img/img1.png)  

E com o comando **http://localhost:8080/hello** temos acesso a nosso primeiro endPoint.  
que esta em __src/main/java/org.acme/GreetingResource.java__ .

