# FictoNet - Rede Social Fictícia

## Descrição

**FictoNet** é uma rede social fictícia desenvolvida em Java com o objetivo de exercitar conceitos e práticas de programação orientada a objetos. O foco principal deste projeto é criar uma plataforma simples onde os usuários possam interagir por meio de mensagens e reações.

Este projeto foi desenvolvido para explorar conceitos fundamentais da linguagem Java, como:

- Classes e Objetos
- Encapsulamento
- Coleções (Listas)
- Tratamento de Exceções
- Entrada/Saída de dados

## Funcionalidades

1. **Usuários:**
   - Criação de novos usuários com nome e idade
   - Listagem de todos os usuários cadastrados

2. **Mensagens:**
   - Os usuários podem postar mensagens de texto
   - Listagem de todas as mensagens (detalhada e resumida)
   - Visualização de mensagens de um usuário específico

3. **Reações:**
   - As mensagens podem receber reações de outros usuários (love, like, sad, angry, laugh)
   - Contagem de reações para cada mensagem

## Estrutura do Projeto

- `User`: Classe que representa um usuário da rede social
- `Messages`: Classe que representa uma mensagem postada por um usuário
- `Reacao`: Classe que representa uma reação a uma mensagem
- `RedeSocial`: Classe principal que gerencia a interação entre usuários e mensagens
- `IdGenerator`: Classe utilitária para gerar IDs únicos para usuários e mensagens

## Requisitos

- Java 8+
- IDE de sua escolha (recomenda-se IntelliJ IDEA ou Eclipse)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/FictoNet.git
   ```

2. Abra o projeto em sua IDE preferida

3. Execute a classe `Main`

4. Siga as instruções no console para interagir com o sistema

## Menu de Opções

Ao executar o programa, você verá o seguinte menu:

1. Criar usuário
2. Listar todos os usuários
3. Criar mensagem
4. Reagir a uma mensagem
5. Mostrar todas as mensagens (detalhado)
6. Listar todas as mensagens (resumido)
7. Mostrar mensagens de um usuário
8. Sair

Escolha a opção desejada digitando o número correspondente e seguindo as instruções na tela.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto, criar uma branch com suas modificações e enviar um pull request.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.