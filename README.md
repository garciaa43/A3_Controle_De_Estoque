# 📦 A3 - Controle de Estoque

## 📚 Sobre o Projeto

Este projeto foi desenvolvido para a disciplina de **Programação de Soluções Computacionais** da **UNISUL**.

O objetivo é criar um sistema de **controle de estoque**, capaz de gerenciar produtos, categorias e movimentações, simulando uma situação real de uma empresa comercial.

O sistema permite o controle eficiente dos itens armazenados, auxiliando na tomada de decisões relacionadas à reposição de produtos e análise de estoque.

---

## 🎯 Objetivo

Desenvolver um software capaz de:

- Gerenciar produtos e categorias
- Controlar entrada e saída de estoque
- Atualizar automaticamente as quantidades
- Emitir relatórios gerenciais
- Aplicar boas práticas de desenvolvimento (DAO, organização de código, etc.)

---

## ⚙️ Funcionalidades

### 📦 Produtos
- Cadastro de produtos
- Edição de produtos
- Consulta de produtos
- Exclusão de produtos

### 🗂️ Categorias
- Cadastro de categorias
- Edição de categorias
- Consulta de categorias
- Exclusão de categorias

### 🔄 Movimentações
- Entrada de produtos no estoque
- Saída de produtos do estoque
- Atualização automática da quantidade
- Alertas de:
  - Quantidade mínima
  - Quantidade máxima

### 📊 Relatórios
- Lista de preços
- Balanço físico/financeiro
- Produtos abaixo da quantidade mínima
- Quantidade de produtos por categoria
- Produto com maior entrada e saída

---

## 🛠️ Tecnologias Utilizadas (Até o momento 14/04/2026)

- Java
- Maven
- Git e GitHub

---
## 🗄️ Modelagem do Sistema

### Produto
- Nome
- Preço unitário
- Unidade
- Quantidade em estoque
- Quantidade mínima
- Quantidade máxima
- Categoria

### Categoria
- Nome
- Tamanho (Pequeno, Médio, Grande)
- Embalagem (Lata, Vidro, Plástico)

### Movimentação
- Produto
- Data
- Quantidade
- Tipo (Entrada/Saída)

---

## 📈 Relatórios Disponíveis

- 📋 Lista de preços
- 💰 Balanço físico/financeiro
- ⚠️ Produtos abaixo do mínimo
- 📦 Quantidade por categoria
- 🔝 Produto com maior movimentação
---

# 📋 Requisitos do Sistema

## ✅ Requisitos Funcionais

### 📦 Produtos
| Código | Descrição |
|---|---|
| RF01 | O sistema deve permitir cadastrar produtos. |
| RF02 | O sistema deve validar campos obrigatórios e numéricos no cadastro de produtos. |
| RF03 | O sistema deve permitir consultar produtos cadastrados. |
| RF04 | O sistema deve permitir alterar produtos cadastrados. |
| RF05 | O sistema deve permitir excluir produtos cadastrados. |
| RF06 | O sistema deve possuir uma tela de gerenciamento de produtos. |

---

### 🗂️ Categorias
| Código | Descrição |
|---|---|
| RF07 | O sistema deve permitir cadastrar categorias. |
| RF08 | O sistema deve permitir consultar categorias cadastradas. |
| RF09 | O sistema deve permitir alterar categorias cadastradas. |
| RF10 | O sistema deve permitir excluir categorias cadastradas. |
| RF11 | O sistema deve possuir uma tela de gerenciamento de categorias. |

---

### 🔄 Movimentações
| Código | Descrição |
|---|---|
| RF12 | O sistema deve permitir registrar movimentações de estoque. |
| RF13 | O sistema deve permitir registrar entrada de produtos. |
| RF14 | O sistema deve permitir registrar saída de produtos. |
| RF15 | O sistema deve atualizar automaticamente o estoque após movimentações. |
| RF16 | O sistema deve identificar produtos abaixo da quantidade mínima. |
| RF17 | O sistema deve controlar o limite máximo de produtos em estoque. |

---

### 📊 Relatórios
| Código | Descrição |
|---|---|
| RF18 | O sistema deve gerar relatório de lista de preços. |
| RF19 | O sistema deve gerar relatório de produtos abaixo do mínimo. |
| RF20 | O sistema deve gerar relatório de balanço físico/financeiro. |
| RF21 | O sistema deve gerar relatório de produtos por categoria. |
| RF22 | O sistema deve gerar relatório de produtos com maior entrada e saída. |
| RF23 | O sistema deve atualizar automaticamente a tabela ao trocar o relatório. |
| RF24 | O sistema deve permitir gerar relatórios em PDF. |

---

### 🖥️ Menu Principal e Navegação
| Código | Descrição |
|---|---|
| RF25 | O sistema deve possuir uma tela principal com mensagem de boas-vindas. |
| RF26 | O sistema deve permitir acesso às telas através do menu principal. |
| RF27 | O sistema deve abrir telas internas dentro do `JDesktopPane`. |
| RF28 | O sistema deve permitir encerrar a aplicação pelo menu “Fechar”. |
| RF29 | O sistema deve centralizar a janela principal ao iniciar. |
| RF30 | O sistema não deve permitir redimensionamento da janela principal. |

---

# ⚙️ Requisitos Não Funcionais

| Código | Descrição |
|---|---|
| RNF01 | O sistema deve ser desenvolvido em Java. |
| RNF02 | O sistema deve utilizar Java Swing para interface gráfica. |
| RNF03 | O sistema deve utilizar MySQL para armazenamento dos dados. |
| RNF04 | O sistema deve utilizar JDBC para conexão com o banco de dados. |
| RNF05 | O sistema deve utilizar arquitetura em camadas (View, BO, DAO e Model). |
| RNF06 | O projeto deve utilizar Git e GitHub para versionamento. |
| RNF07 | O sistema deve possuir tratamento de erros e exceções. |
| RNF08 | O sistema deve validar os dados antes de salvar informações. |
| RNF09 | O sistema deve possuir interface simples e intuitiva. |
| RNF10 | O código deve ser organizado e de fácil manutenção. |
| RNF11 | O sistema deve funcionar em ambientes compatíveis com Java. |
| RNF12 | O sistema deve carregar tabelas e relatórios sem travamentos perceptíveis. |
| RNF13 | O sistema deve permitir futuras expansões e novas funcionalidades. |
| RNF14 | O sistema deve possuir segurança básica através de validações de entrada. |
| RNF15 | O sistema deve atualizar tabelas e relatórios em tempo real. |
| RNF16 | O sistema deve permitir carregamento dinâmico de registros nas tabelas. |

---

## 👥 Integrantes

| Nome | RA | GitHub |
|------|----|--------|
| Gabriel Garcia Cordeiro | 10726111278 | https://github.com/garciaa43 |
| Samuel Arci Ramalho Mury | 1072619317 | https://github.com/Samuelmury |
| Nicolas Levandowski | 1072615761 | https://github.com/nickevisck |
| João Marcos Mesquita da Silva | 1072618748 | https://github.com/Joao-Ms12 |

---


