# Entrega 05 — Preparação Técnica do Software

Disciplina: Empreendedorismo em Sistemas de Informação

Semestre: 2026/2

Data de verificação: 27/11/2026
Empreendimento: Agenda Inteligente

## 1. Identificação do projeto

| Integrante |
|---|
| Bruno Santos Vilas Boas |
| Carolina Costa Ude |
| Christian Silva Mesquita |
| Matheus Levi Tavares |
| Thiago Vinícius Tristão Rojas |

**Repositório:** https://github.com/thiagovtr/softwareESI

## 2. Objetivo

Registrar a preparação técnica do ambiente local e os resultados de execução e verificação do MVP Agenda Inteligente. Esta entrega complementa as informações sobre problema, proposta de valor e escopo registradas nas entregas anteriores.

## 3. Ambiente técnico verificado

| Componente | Configuração verificada | Resultado |
|---|---|---|
| Banco de dados | PostgreSQL 18 por Docker Compose | Executado com sucesso. |
| Backend | Java 27 e Spring Boot 4.1.2 | Compilado e executado com sucesso. |
| Frontend | React e Vite | Executado com sucesso. |
| Integração | Frontend, API e PostgreSQL | Funcionamento do MVP verificado manualmente. |

O fluxo integrado verificado compreendeu a utilização do MVP com os componentes locais em execução. A documentação técnica de inicialização e os endereços locais foram atualizados no README do diretório `agenda-inteligente`.

## 4. Verificações realizadas

| Verificação | Comando ou procedimento | Resultado |
|---|---|---|
| Teste automatizado do backend | `./mvnw test` | 1 teste executado, sem falhas ou erros. |
| Lint do frontend | `npm run lint` | Executado sem erros. |
| Build de produção do frontend | `npm run build` | Concluído com sucesso. |
| Funcionamento integrado | Verificação manual com PostgreSQL, backend e frontend em execução | Confirmado. |

O resultado do teste automatizado do backend deve ser interpretado de acordo com o conjunto atual de testes: a execução de um teste sem falhas ou erros não caracteriza cobertura completa de testes automatizados.

## 5. Ajustes de configuração realizados

Foram realizados os seguintes ajustes de configuração no frontend durante a preparação técnica:

- correção da configuração do ESLint para reconhecer componentes utilizados no JSX;
- correção do comando de build do Vite.

Após esses ajustes, o ESLint foi executado sem erros e o build de produção foi concluído com sucesso.

## 6. Estado atual e próximos materiais

O MVP está preparado para execução local, com banco de dados, backend e frontend verificados em funcionamento integrado. O relatório final, os slides e o vídeo ainda estão em preparação e serão acrescentados posteriormente.
