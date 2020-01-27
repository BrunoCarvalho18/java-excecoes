# Java Exceções

- Throwable→ é a classe pai de todas

- Checked Exceptions → São exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber .Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.

- Exemplo: SQLException

- Unchecked Exceptions → São exceções não esperadas para o fluxo ou método de um sistema, um bom exemplo é a famosa NullPointException que ocorre quando se tenta acessar uma referência de memória vazia, ou recuperar uma instância que não existe, dentre outro motivos.

- Exemplo: NullPointerException

- Finally →  O Finally é um bloco de código que pode ser ou não ser finalizado pelo try catch, este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar os recursos ou para dar continuidade em um fluxo que deve ocorrer independente do erro.

- Throws → É assinatura do método que será retornado caso ocorra erro para o método que faz a chamada, dentro de um fluxo encadeado.
