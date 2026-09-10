# Stardew Manager

Projeto desenvolvido em Java para praticar conceitos de Programação Orientada a Objetos (POO).

## Sobre o projeto

O sistema simula o gerenciamento de animais de uma fazenda, permitindo visualizar os animais do curral e coletar os produtos produzidos por eles.

Cada animal possui informações como:

- ID
- Nome
- Raça
- Idade
- Status

## Estrutura do projeto

```text
stardewManager/
├── stardewManager.java
├── Animal.java
├── VacaMae.java
├── Bezerro.java
├── GalinhaMae.java
├── Pintinho.java
├── OvelhaMae.java
└── Cordeiro.java
```
# Conceitos de POO aplicados
Interface: define os comportamentos obrigatórios dos animais.
Herança: utilizada para relacionar as classes-base às classes dos filhotes.
Polimorfismo: permite armazenar diferentes tipos de animais em uma estrutura ArrayList<Animal>.
Encapsulamento: utilizado para controlar o acesso aos atributos dos objetos.

# Funcionalidades

- Listagem dos animais do curral.
- Exibição das informações de cada animal.
- Emissão de sons específicos.
- Coleta de produtos.
- Interação por meio de um menu no terminal.

# Como executar

Clone o repositório
Abra o projeto no IntelliJ IDEA.
Execute o arquivo stardewManager.java.
Utilize o menu exibido no terminal para interagir com o sistema.
