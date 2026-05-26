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

### RF01 — Cadastro de Produtos
O sistema deve permitir o cadastro de produtos contendo:
- Nome
- Categoria
- Preço unitário
- Unidade
- Quantidade em estoque
- Quantidade mínima
- Quantidade máxima

---

### RF02 — Validação de Cadastro de Produtos
O sistema deve validar:
- Campos obrigatórios
- Campos numéricos
- Campos textuais sem números indevidos

---

### RF03 — Consulta de Produtos
O sistema deve permitir visualizar os produtos cadastrados.

---

### RF04 — Alteração de Produtos
O sistema deve permitir alterar os dados de um produto cadastrado.

---

### RF05 — Exclusão de Produtos
O sistema deve permitir excluir produtos cadastrados.

---

### RF06 — Gerenciamento de Produtos
O sistema deve possuir uma tela de gerenciamento contendo:
- Tabela de produtos
- Botão alterar
- Botão excluir
- Botão sair/voltar

---

### RF07 — Cadastro de Categorias
O sistema deve permitir cadastrar categorias contendo:
- Nome
- Tamanho
- Embalagem

---

### RF08 — Consulta de Categorias
O sistema deve permitir visualizar categorias cadastradas.

---

### RF09 — Alteração de Categorias
O sistema deve permitir alterar categorias cadastradas.

---

### RF10 — Exclusão de Categorias
O sistema deve permitir excluir categorias cadastradas.

---

### RF11 — Gerenciamento de Categorias
O sistema deve possuir uma tela de gerenciamento de categorias com:
- Tabela de categorias
- Botão alterar
- Botão excluir
- Botão sair

---

### RF12 — Cadastro de Movimentações
O sistema deve permitir registrar movimentações de estoque.

---

### RF13 — Entrada de Produtos
O sistema deve permitir registrar entrada de produtos no estoque.

---

### RF14 — Saída de Produtos
O sistema deve permitir registrar saída de produtos do estoque.

---

### RF15 — Atualização Automática do Estoque
O sistema deve atualizar automaticamente a quantidade em estoque após movimentações.

---

### RF16 — Controle de Quantidade Mínima
O sistema deve identificar produtos abaixo da quantidade mínima.

---

### RF17 — Controle de Quantidade Máxima
O sistema deve controlar limite máximo de produtos em estoque.

---

### RF18 — Relatório de Lista de Preços
O sistema deve gerar relatório contendo:
- Nome do produto
- Preço
- Unidade
- Categoria

---

### RF19 — Relatório de Produtos Abaixo do Mínimo
O sistema deve gerar relatório de produtos com estoque abaixo do mínimo.

---

### RF20 — Relatório de Balanço Físico/Financeiro
O sistema deve gerar relatório financeiro e quantitativo do estoque.

---

### RF21 — Relatório de Produtos por Categoria
O sistema deve gerar relatório agrupando produtos por categoria.

---

### RF22 — Relatório de Produto com Maior Entrada/Saída
O sistema deve identificar produtos com maior movimentação.

---

### RF23 — Navegação entre Telas
O sistema deve permitir acesso às telas através do menu principal.

---

### RF24 — Encerramento do Sistema
O sistema deve permitir fechar a aplicação através do menu ou botão sair.

---

# ⚙️ Requisitos Não Funcionais

### RNF01 — Linguagem de Programação
O sistema deve ser desenvolvido em Java.

---

### RNF02 — Interface Gráfica
O sistema deve utilizar Java Swing para construção das telas.

---

### RNF03 — Banco de Dados
O sistema deve utilizar MySQL para armazenamento dos dados.

---

### RNF04 — Persistência de Dados
O sistema deve utilizar JDBC para conexão com o banco de dados.

---

### RNF05 — Organização do Projeto
O sistema deve utilizar separação em camadas:
- View
- BO
- DAO
- Model

---

### RNF06 — Controle de Versão
O projeto deve utilizar Git e GitHub para versionamento.

---

### RNF07 — Tratamento de Erros
O sistema deve possuir tratamento de exceções e mensagens de erro amigáveis.

---

### RNF08 — Validação de Dados
O sistema deve validar entradas do usuário antes de salvar dados.

---

### RNF09 — Facilidade de Uso
O sistema deve possuir interface simples e intuitiva.

---

### RNF10 — Manutenção do Código
O código deve ser organizado e de fácil manutenção.

---

### RNF11 — Compatibilidade
O sistema deve funcionar em ambientes compatíveis com Java.

---

### RNF12 — Desempenho
O sistema deve carregar tabelas e relatórios sem travamentos perceptíveis.

---

### RNF13 — Escalabilidade
O sistema deve permitir futuras implementações de novas funcionalidades.

---

### RNF14 — Segurança Básica
O sistema deve evitar falhas simples de entrada de dados através de validações.

## 👥 Integrantes

| Nome | RA | GitHub |
|------|----|--------|
| Gabriel Garcia Cordeiro | 10726111278 | https://github.com/garciaa43 |
| Samuel Arci Ramalho Mury | 1072619317 | https://github.com/Samuelmury |
| Nicolas Levandowski | 1072615761 | https://github.com/nickevisck |
| João Marcos Mesquita da Silva | 1072618748 | https://github.com/Joao-Ms12 |

---


