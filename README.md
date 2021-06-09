# Search App
Mecanismo de busca de conteúdos dentro de um bucket de arquivos no formato texto.


### Built With
* [Openjdk](https://openjdk.java.net/)  Java language
* [Maven](https://maven.apache.org/) - Dependency Management

### Authors
* **Cassiano Souza** - *Initial work* - [borgessouza](https://github.com/borgessouza)


### Prerequisites
* [Java 8](https://openjdk.java.net/projects/jdk8/)

### Build
Para criar o aplicativo favor executar o comando:
```
mvn package
```

### Install
É necessário configurar o diretório que contenha a lista de arquivos para a busca.
Para isso basta configurar a variável de ambiente SEARCH_PATH 

```
 export SEARCH_PATH=./data
```

### Executing 
```
java -jar searchApp.jar {query params}
```