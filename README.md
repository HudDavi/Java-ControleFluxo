# Projeto Controle de Fluxo

Este projeto implementa um controle de fluxo de execução em Java para contar e imprimir números a partir de um valor inicial até um valor final. O código inclui exceções personalizadas para lidar com situações onde os números de entrada não estão na ordem adequada.

## Visão Geral

O projeto consiste em duas classes principais:

1. **NumeroInvalido**: Esta é uma classe de exceção personalizada que herda da classe `Exception`. Ela é usada para lançar exceções em caso de números de entrada inválidos.

2. **ControleFluxo**: Esta classe contém o método `main` que é o ponto de entrada do programa. Ela lida com a entrada de números, verifica se o segundo número é maior que o primeiro e, em seguida, inicia a contagem e impressão dos números.

## Uso

Para executar o programa e utilizar o controle de fluxo, siga as etapas a seguir:

1. Clone ou faça o download deste repositório para sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `ControleFluxo`.

O programa solicitará que você insira dois números inteiros. Se o segundo número for maior que o primeiro, o programa contará e imprimirá os números da sequência no console. Caso contrário, lançará uma exceção do tipo `NumeroInvalido` e exibirá uma mensagem de erro.

## Personalização

Você pode personalizar o projeto da seguinte forma:

- Modificando as mensagens de erro ou as regras de validação na classe `ControleFluxo`.
- Estendendo o projeto para incluir mais recursos, como contagens em ordens diferentes ou operações matemáticas adicionais.
- Aprimorando o tratamento de exceções personalizadas, como adicionando mais informações de depuração.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva