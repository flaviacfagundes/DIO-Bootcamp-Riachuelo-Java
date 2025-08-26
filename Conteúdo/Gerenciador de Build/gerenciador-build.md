
# O que é "Build"?

No universo da programação, **build** é o processo de transformar o código-fonte em algo que possa ser executado ou distribuído.  
Esse fluxo pode envolver:

- Compilar arquivos `.java` em `.class`
- Baixar e gerenciar dependências externas
- Executar testes automatizados
- Empacotar a aplicação em formatos como `.jar` ou `.war`
- Preparar o sistema para distribuição

Fazer todas essas etapas de forma manual é trabalhoso, repetitivo e sujeito a erros.  
Por isso, usamos **ferramentas que automatizam esse processo**, conhecidas como **gerenciadores de build**.

---

# O que é um Gerenciador de Build?

Um **gerenciador de build** é uma ferramenta que organiza e executa automaticamente todo o processo de construção de um projeto.  
Nele, você define as tarefas necessárias e a ferramenta se encarrega da execução.

---

# Principais Gerenciadores de Build em Java

Em projetos Java, é comum precisar:

- Compilar código
- Executar testes
- Gerar pacotes `.jar` ou `.war`
- Controlar bibliotecas externas

Fazer isso manualmente seria ineficiente.  
Por isso, os dois gerenciadores de build mais utilizados no ecossistema Java são:

## Maven
Ferramenta tradicional, muito presente em ambientes corporativos.  
Segue o princípio de **“convenção sobre configuração”**, utilizando uma estrutura de diretórios padrão e arquivos XML para descrever o projeto.

## Gradle
Mais moderno e flexível, utiliza scripts em **Groovy** ou **Kotlin** (arquivo `build.gradle`).  
Por não depender de XML, o Gradle oferece uma configuração mais dinâmica e personalizável.

---
