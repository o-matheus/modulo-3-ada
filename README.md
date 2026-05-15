# Desafio

Com base no conteudo didatico (I/O e NIO.2) explorar a API (foco na NIO) de manipulação de pastas e arquivos. Junto com seu grupo pense em uma aplicação java que utilize essa API de arquivos.

ex:
- Automação de pastas e arquivos: criar pastas e arquivos dinamicamente, seguindo alguma operação manual, ou lógica
- Ler e processar arquivos pre existentes como .csv, .xls (excel)
- Extrair dados de uma fonte externa (ex internet) e registar os dados em arquivos (Desafio nível dificuldade alto)


## Solução implementada

O programa em `Main.java` cria automaticamente a seguinte estrutura:

- `copa do mundo 2022/`
  - `Grupo A/selecoes_grupo_A.txt`
  - `Grupo B/selecoes_grupo_B.txt`
  - `Grupo C/selecoes_grupo_C.txt`
  - `Grupo D/selecoes_grupo_D.txt`
  - `Grupo E/selecoes_grupo_E.txt`
  - `Grupo F/selecoes_grupo_F.txt`
  - `Grupo G/selecoes_grupo_G.txt`
  - `Grupo H/selecoes_grupo_H.txt`

Cada arquivo `selecoes.txt` contém os nomes das seleções do grupo correspondente.

## Como executar

```bash
javac src/Main.java
java -cp src Main
```

