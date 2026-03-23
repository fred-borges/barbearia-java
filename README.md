# 💈 Sistema de Barbearia em Java

Projeto simples desenvolvido em **Java** com o objetivo de praticar conceitos fundamentais de programação orientada a objetos (POO), como herança, polimorfismo, abstração e estruturas de dados.

---

## 📌 Funcionalidades

* ✅ Adicionar clientes com sistema de senha
* ✅ Gerenciar fila de espera (modelo semelhante a hospitais/clínicas)
* ✅ Atender clientes por ordem de chegada (FIFO)
* ✅ Visualizar a fila atual
* ✅ Interação via terminal (input do utilizador)

---

## 🧠 Conceitos aplicados

| Conceito           | Implementação                      |
| ------------------ | ---------------------------------- |
| Herança            | `Pessoa → Cliente / Funcionario`   |
| Polimorfismo       | Método `trabalhar()` no `Barbeiro` |
| Abstração          | Classe `Funcionario` (abstract)    |
| Encapsulamento     | Atributos privados + getters       |
| Estrutura de dados | `Queue` com `LinkedList`           |

---

## 📁 Estrutura do Projeto

```
barbearia/
│
├── Main.java
├── model/
│   ├── Pessoa.java
│   ├── Cliente.java
│   ├── Funcionario.java
│   ├── Barbeiro.java
│
├── service/
│   ├── FilaAtendimento.java
│   ├── Barbearia.java
```

---

## 💻 Exemplo de uso

```
===== SISTEMA BARBEARIA =====
1 - Novo Cliente
2 - Atender Cliente
3 - Ver Fila
0 - Sair
Escolha: 1

Nome do cliente: João
Senha gerada: Cliente: João | Senha: 1
```

---

## 🚀 Melhorias futuras

* [ ] Suporte a múltiplos barbeiros
* [ ] Interface gráfica (Swing ou JavaFX)
* [ ] Tempo estimado de espera
* [ ] Persistência de dados (ficheiro ou base de dados)
* [ ] Transformar em API REST (Spring Boot)

---

## 📚 Objetivo

Este projeto foi criado com fins educativos para reforçar os conceitos básicos de Java e servir como base para evoluções mais avançadas.
