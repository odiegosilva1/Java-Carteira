
# Carteira Virtual em Java

Este projeto é uma aplicação simples em Java que simula uma carteira digital com operações de consulta de saldo, transferência (Pix), e recebimento de valores. Foi criado para fins de estudo e prática em programação orientada a objetos e interação com o usuário.

## Funcionalidades

A aplicação permite que o usuário:
1. Consulte seu saldo.
2. Realize uma transferência de valor.
3. Receba um valor.
4. Encerre a sessão.

## Demonstração

Ao iniciar o programa, o usuário verá informações básicas, como o nome do cliente, o tipo de conta, e o saldo atual. Em seguida, um menu de opções é apresentado para interagir com a conta.

Exemplo de interação:
```plaintext
**************************************
Nome do Cliente: Diego
Tipo da Conta: Corrente
Saldo Atual: 1500.99
**************************************

** Digite a sua opção **
1 - Consultar Saldo
2 - Fazer Pix
3 - Receber Valor
4 - Sair
```

## Estrutura do Código

- **Classe principal (`Carteira`)**: Contém o `main` e gerencia a interação com o usuário.
- **Variáveis principais**:
  - `nome`: Nome do cliente.
  - `tipoConta`: Tipo de conta.
  - `saldo`: Saldo inicial.
- **Menu**: Exibe opções e processa as escolhas.
- **Scanner**: Recebe a entrada do usuário para processar as operações.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação para lógica do sistema e controle de fluxo.
- **Scanner**: Para entrada de dados do usuário.

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/carteira-virtual-java.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd carteira-virtual-java
   ```
3. Compile o código:
   ```bash
   javac Carteira.java
   ```
4. Execute o programa:
   ```bash
   java Carteira
   ```

## Melhorias Futuras

- Adicionar autenticação do usuário.
- Implementar histórico de transações.
- Adicionar uma interface gráfica (GUI) para facilitar o uso.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um _issue_ ou fazer um _pull request_.

## Licença

Este projeto é licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

