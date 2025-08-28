
# Padrões de Desenvolvimento e Conceitos

Para nomes de classes o **Java** trabalha seguindo o padrão de colocar sempre a primeira letra em maiúsculo e as seguintes em em minúsculo. Se forem duas palavras a segunda palavra também começa com a letra em maiúsculo e as demais em minúsculo. Por exemplo:

    MyClass


Já para métodos, o padrão é começar com em minúsculo mesmo e, se houver, mais uma palavra no nome, a segunda começa com a primeira letra em maiúculo.

    mainMethod()


---

O **Java** não tem problemas com os `tabs`, com as `identações`, assim como o `Python` por exemplo. Mas é sempre bom deixar o código organizado.


---

### IMPORT

O comando `import` nada mais é um comando que pega um recurso de um outro `package`.

> Quando se coloca o nome do `package` que você que fazer a importação, ao invés de colocar o nome do recurso específico que você deseja importar, e coloca um asterísco (*), ele importa todos os recursos do `package`, mas **não é recomendado**. 

O padrão para se trabalhar com `packages` é colocar o nome do dominio ao contrario (*cada ponto é como se fosse uma barra*).

    br.com.dio


---

### COMENTÁRIOS

- Para comentário de **uma linha**: usa-se as duas barras (//)
- Para comentários de **várias linhas**: usa-se a barra e o asterisco ( /* seu comentário aqui */ )


---

### PRINT NO JAVA

Existem três formas de fazer o `print` no **Java**:

- `System.out.print()` → É o print normal, só exibe a informação no terminal
- `System.out.println()` → Imprime com quebra de linha
- `System.out.printf()` → Print formatado, não precisa ficar colocando sinal de `+` para concatenar `String` e `Variávis`. Basta colocar `%s` e depois das aspas, coloca-se as variáveis na ordem que elas devem aparecer, separadas por vírgula.

~~~~
package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Insira seu nome:");
        String name = scanner.next();
        System.out.println("Insira sua idade:");
        int age = scanner.nextInt();
        System.out.printf("Seja bem-vindo, %s! Você tem %s anos de idade!", name, age);
    }
}
~~~~

---

