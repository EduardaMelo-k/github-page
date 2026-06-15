# Plano de Implantação, Governança e Arquitetura de Software

## Ecossistema **PortfolioHUB** e Integração com **Google Gemini**

---

## Informações Acadêmicas

**Instituição:** Centro Universitário de Brasília – CEUB  
**Curso:** Ciência da Computação / Ciência de Dados  
**Disciplina:** Bootcamp  

**Estudante:** Maria Eduarda Melo  
**Data:** 14 de junho de 2026  

**Local:** Brasília – DF  
**Ano:** 2026  

---

# Sumário

1. [Introdução e Escopo do Projeto](#1-introdução-e-escopo-do-projeto)
2. [Memorial de Mentoria: Engenharia de Prompts](#2-memorial-de-mentoria-engenharia-de-prompts)
3. [Entrega Final: Detalhamento Técnico](#3-entrega-final-detalhamento-técnico)
4. [Gestão de Usuários e Segurança Avançada](#4-gestão-de-usuários-e-segurança-avançada)
5. [Estratégias de Melhoria de Currículo](#5-estratégias-de-melhoria-de-currículo)
6. [Conclusão](#6-conclusão)
7. [Referências](#7-referências)

---

# 1. Introdução e Escopo do Projeto

O **PortfolioHUB** representa um ecossistema tecnológico moderno desenvolvido seguindo princípios de **Engenharia de Software**, **automação de processos** e **boas práticas de infraestrutura**.

Diferente de um portfólio tradicional e estático, a proposta consiste em uma plataforma dinâmica, integrada aos serviços do **Google Workspace**, conectada ao **GitHub** para controle de versão e estruturada utilizando práticas de **CI/CD (Continuous Integration e Continuous Deployment)**.

O principal objetivo do projeto é criar uma interface profissional capaz de consumir dados de projetos automaticamente, mantendo informações atualizadas e utilizando o **Google Gemini como mentor técnico durante o processo de desenvolvimento e implantação**.

---

# 2. Memorial de Mentoria: Engenharia de Prompts

Esta etapa apresenta o registro das interações realizadas com a Inteligência Artificial **Google Gemini**, utilizada como ferramenta de apoio técnico durante o desenvolvimento do projeto.

O objetivo da mentoria foi auxiliar na definição de arquitetura, segurança, automação, escalabilidade e preparação profissional da solução.

---

# Prompt 1 — Apresentação Inicial e Alinhamento

## Solicitação

> "Sou aluno do primeiro período do curso de Ciência da Computação e estou cursando uma disciplina chamada Bootcamp, onde estamos aprendendo a utilizar os recursos do Google Workspace para montar nosso portfólio profissional."

## Orientação Gemini

O Gemini recomendou utilizar o **Google Sites como estrutura principal do portfólio**, organizando conteúdos relacionados a:

- Habilidades técnicas;
- Projetos desenvolvidos;
- Experiências acadêmicas;
- Evolução profissional.

---

# Prompt 2 — Atuação como Assistente Técnico

## Solicitação

> "Atue como meu mentor técnico para a etapa final do Bootcamp. Preciso realizar a implantação definitiva do meu projeto PortfolioHUB seguindo requisitos de segurança, integração e automação."

## Orientação Gemini

A recomendação foi estruturar a implantação considerando:

- **CI/CD**
- **Integração assíncrona**
- **Segurança da aplicação**
- **Organização do código em ambiente profissional**

---

# Prompt 3 — Roteiro de Implantação

## Solicitação

> "Ajude-me a criar um roteiro detalhado para tirar meu repositório do GitHub da fase de desenvolvimento e prepará-lo para produção."

## Orientação Gemini

Foi recomendado substituir processos manuais por uma **esteira automatizada de publicação**, garantindo:

- Mais confiabilidade;
- Redução de erros humanos;
- Atualizações contínuas;
- Controle do ambiente produtivo.

---

# Prompt 4 — Integração GitHub e Google Workspace

## Solicitação

> "Explique como integrar funcionalidades do GitHub e ferramentas do Google Workspace."

## Orientação Gemini

A arquitetura sugerida envolve:

- Consumo dos dados do GitHub através do **front-end**;
- Integração de formulários com **Google Sheets**;
- Organização de métricas de interação;
- Armazenamento simplificado de dados.

---

# Prompt 5 — Segurança e Privilégios

## Solicitação

> "Como garantir que o robô de deploy não tenha permissões excessivas?"

## Orientação Gemini

Foi aplicado o conceito de:

## **Princípio do Menor Privilégio (Least Privilege)**

O sistema deve possuir somente as permissões necessárias para executar suas funções, evitando acessos desnecessários e reduzindo riscos de segurança.

---

# Prompt 6 — Automação CI/CD

## Solicitação

> "Como evitar conflitos durante múltiplas atualizações?"

## Orientação Gemini

Foi recomendada uma política de controle de processos:

- Cancelamento de execuções antigas;
- Prioridade para versões mais recentes;
- Prevenção contra arquivos corrompidos;
- Maior eficiência no processamento.

---

# Prompt 7 — Escalabilidade e Dados Dinâmicos

## Solicitação

> "Como carregar automaticamente projetos do GitHub?"

## Orientação Gemini

A solução proposta foi implementar uma arquitetura dinâmica capaz de:

- Consultar projetos automaticamente;
- Buscar até 100 registros;
- Ignorar repositórios derivados (*forks*);
- Exibir somente projetos autorais.

---

# Prompt 8 — Tolerância a Falhas

## Solicitação

> "Como evitar problemas quando informações estiverem vazias?"

## Orientação Gemini

Foi sugerida a criação de uma camada de validação com valores alternativos para evitar:

- Campos vazios;
- Erros de interface;
- Problemas de alinhamento visual.

---

# Prompt 9 — Experiência do Usuário (UX)

## Solicitação

> "Como melhorar a interação visual dos cards de projetos?"

## Orientação Gemini

Foram recomendadas técnicas de:

- Animações suaves;
- Efeito hover;
- Elevação dos componentes;
- Sombras discretas;
- Melhor experiência visual.

---

# Prompt 10 — Padronização Profissional do Currículo

## Solicitação

> "Como apresentar projetos acadêmicos de forma mais profissional?"

## Orientação Gemini

Sugestões:

- Utilizar o termo **Clean Code**;
- Destacar **ETL (Extração, Transformação e Carga)**;
- Apresentar experiências com **EDA (Análise Exploratória de Dados)**;
- Evidenciar conhecimentos em Engenharia de Software.

---

# Prompt 11 — Governança e LGPD

## Solicitação

> "Como adequar o PortfolioHUB à LGPD?"

## Orientação Gemini

Foram indicadas práticas como:

- Transparência no uso de dados;
- Consentimento dos usuários;
- Informações sobre finalidade de coleta;
- Controle de informações armazenadas.

---

# Prompt 12 — Testes e Homologação

## Solicitação

> "Quais testes garantem que a plataforma está pronta?"

## Orientação Gemini

Foram recomendados:

- Testes de responsividade;
- Testes de desempenho;
- Testes de persistência;
- Testes de falhas de conexão.

---

# Prompt 13 — Preparação da Apresentação Final

## Solicitação

> "Quais pontos técnicos devo destacar?"

## Orientação Gemini

Os principais pontos são:

- Configuração de infraestrutura;
- Integração GitHub e IA;
- Automação de processos;
- Evolução de um site estático para uma plataforma dinâmica.

---

# 3. Entrega Final: Detalhamento Técnico

A implantação do PortfolioHUB foi realizada seguindo critérios de qualidade e organização profissional.

---

## Planejamento

Foram implementadas estratégias para migração do ambiente:

**Desenvolvimento → Produção**

Incluindo:

- Organização de branches;
- Proteção da branch principal;
- Controle de alterações;
- Revisão através de Pull Requests.

---

## Integração GitHub

A integração permitiu:

- Controle de versões;
- Gerenciamento dos códigos;
- Monitoramento de segurança;
- Atualizações organizadas.

---

## Automação

Foram configurados processos para:

- Execução automática de testes;
- Validação do código;
- Deploy automático;
- Redução de processos manuais.

---

# 4. Gestão de Usuários e Segurança Avançada

A governança do projeto foi estruturada utilizando recursos do **Google Workspace Admin Console**.

---

## 4.1 Controle de Identidade

### Google Directory API

Utilizada para:

- Gerenciamento de usuários;
- Controle de permissões;
- Integração de perfis.

---

### SSO e Autenticação em Dois Fatores

Implementação de mecanismos para:

- Centralizar acessos;
- Reduzir riscos;
- Melhorar a segurança.

---

## 4.2 Segurança da Infraestrutura

### Segurança da Cadeia de Suprimentos

Monitoramento de dependências externas para evitar vulnerabilidades.

---

### Branch Protection

Proteção da produção através de:

- Bloqueio de alterações diretas;
- Revisão obrigatória;
- Controle de qualidade.

---

# 5. Estratégias de Melhoria de Currículo

O desenvolvimento do PortfolioHUB possibilitou destacar competências como:

## Competências Técnicas

- **CI/CD**
- **DevOps**
- **Clean Code**
- **ETL**
- **EDA**
- **IA Generativa**
- **Engenharia de Software**

---

## Objetivo Profissional

Alinhar experiências acadêmicas com oportunidades nas áreas de:

- Desenvolvimento Backend;
- Engenharia de Software;
- Ciência de Dados;
- Automação de processos.

---

# 6. Conclusão

O desenvolvimento do **PortfolioHUB** demonstrou como a combinação entre **automação**, **Inteligência Artificial Generativa** e **boas práticas de Engenharia de Software** pode transformar um portfólio tradicional em uma solução tecnológica escalável.

Ao final do projeto, foram desenvolvidas competências relacionadas a:

- Arquitetura de software;
- Segurança da informação;
- Governança de dados;
- Automação CI/CD;
- Integração de ferramentas;
- Uso estratégico de Inteligência Artificial.

---

# 7. Referências

- **CENTRO UNIVERSITÁRIO DE BRASÍLIA.**  
  *Desafio - Entrega Final: Implantação PortfolioHUB + IA GEMINI.* 2026.

- **Plano de Implantação e Arquitetura de Software: Ecossistema PortfolioHUB.** 2026.

- **GOOGLE CLOUD.**  
  *Guia para usar a IA no trabalho.* 2026.

- **BRASIL.**  
  *Lei Geral de Proteção de Dados Pessoais (LGPD) – Lei nº 13.709.*
