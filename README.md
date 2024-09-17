# ContaBanco

Este projeto é um exemplo simples de um programa Java que simula a criação de uma conta bancária. O programa solicita ao usuário que insira informações sobre a conta e, em seguida, exibe uma mensagem de confirmação com os dados fornecidos.

## Funcionalidades

- Solicita ao usuário o número da conta.
- Solicita ao usuário o número da agência.
- Solicita ao usuário o nome do cliente.
- Solicita ao usuário o saldo inicial da conta.
- Exibe uma mensagem de confirmação com os dados fornecidos pelo usuário.

## Pré-requisitos

- Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado em sua máquina.

## Pré-requisitos

1. Abra o terminal e navegue até o diretório raiz do projeto:

      ```sh
      cd /caminho/para/o/projeto
      ```

2. Compile o arquivo **ContaTerminal.java**:

      ```sh
      javac src/ContaTerminal.java -d bin
      ```

      Isso compilará o código-fonte na pasta `src` e colocará o bytecode compilado na pasta `bin`.

3. Execute o programa:

      ```sh
      java -cp bin ContaTerminal
      ```

      O programa irá iniciar e solicitar que você insira as informações da conta.

## Interação com o Programa

Ao executar o programa, você será solicitado a inserir as seguintes informações:

1. Número da Conta: Um número inteiro representando o número da conta.
2. Número da Agência: Uma string representando o número da agência.
3. Nome do Cliente: Uma string representando o nome do cliente.
4. Saldo: Um número decimal representando o saldo inicial da conta.

Após inserir todas as informações, o programa exibirá uma mensagem de confirmação com os dados fornecidos, por exemplo:
''Olá Fulano, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.''
