# Entrega 04 — MVP Funcional e Validação da Solução

Disciplina: Empreendedorismo em Sistemas de Informação  
Semestre: 2026/2  
Data de verificação: 10/11/2026  
Empreendimento: Agenda Inteligente

## 1. Identificação do grupo

| Integrante |
|---|
| Bruno Santos Vilas Boas |
| Carolina Costa Ude |
| Christian Silva Mesquita |
| Matheus Levi Tavares |
| Thiago Vinícius Tristão Rojas |

**Repositório:** https://github.com/thiagovtr/softwareESI

## 2. Objetivo da entrega

Esta entrega apresenta o estado verificável do MVP da Agenda Inteligente e registra a validação planejada para a hipótese definida na Entrega 3: um cliente pode consultar e solicitar um horário por um link simples, enquanto o profissional mantém os agendamentos centralizados.

Também são registrados os resultados da inspeção do código, dos testes automatizados, da tentativa de execução local e dos testes realizados com participantes do público-alvo que já haviam sido entrevistados pelo grupo.

## 3. Descrição do MVP

O MVP é uma aplicação web para profissionais de beleza. Há uma área protegida para o profissional e uma página pública acessível por link, sem cadastro do cliente.

### 3.1. Funcionalidades implementadas no código

| Área | Funcionalidade identificada |
|---|---|
| Profissional | Acesso por senha; cadastro e exclusão de serviços; configuração e exclusão de faixas de disponibilidade; consulta de agendamentos por data; cópia do link público. |
| Cliente | Consulta de serviços; escolha de data; consulta de horários livres; preenchimento de nome e contato; solicitação de agendamento; tela de confirmação prevista no fluxo. |
| Regras | Serviços possuem duração; os horários são oferecidos em intervalos de 30 minutos; a disponibilidade é revalidada na gravação; sobreposição de agendamentos é impedida pelo serviço e por restrição do PostgreSQL; o fuso configurado é `America/Sao_Paulo`. |

### 3.2. Limites do escopo

Não foram identificadas implementação de pagamentos, integração automática com a API do WhatsApp, aplicativo nativo, gestão financeira, estoque, comissões, lista de espera, lembretes automáticos, histórico avançado de clientes ou gestão de múltiplos profissionais. Essas funcionalidades permanecem fora do escopo da Entrega 3.

## 4. Tecnologias utilizadas

| Camada | Tecnologia identificada |
|---|---|
| Frontend | React 19.3.1, React DOM 19.3.1, Vite 8.3.6 e CSS. |
| Backend | Java 27, Spring Boot 4.1.2, Spring Web MVC, Spring Data JPA, Spring Security e Bean Validation. |
| Banco de dados | PostgreSQL 18, executado localmente por Docker Compose. |
| Comunicação | API REST entre frontend e backend. |
| Controle de versão | Git e GitHub. |

## 5. Instruções de execução

### 5.1. Requisitos

- Docker Desktop em execução;
- JDK 27;
- Node.js 26 ou superior e npm;
- acesso à internet na primeira execução do Maven Wrapper e na instalação das dependências do frontend.

### 5.2. Execução

Em terminais separados, na pasta `agenda-inteligente`:

```bash
cd database
docker compose up -d
```

```bash
cd backend
./mvnw spring-boot:run
```

No Windows, pode ser usado `mvnw.cmd spring-boot:run`. Se houver mais de uma versão do Java instalada, é necessário apontar `JAVA_HOME` para o JDK 27.

```bash
cd frontend
npm install
npm run dev
```

O frontend é acessado normalmente em `http://localhost:5173`. A senha inicial da área profissional é `agenda123`, salvo se `SENHA_PROFISSIONAL` for definida no ambiente da API. O link público padrão é `http://localhost:5173/agendar/agenda-inteligente`, depois que houver serviço e disponibilidade cadastrados.

## 6. Link do sistema

Não há versão hospedada identificada no repositório. O endereço utilizado para a demonstração local é `http://localhost:5173`; ele não é um link público de produção.

## 7. Fluxo principal

O fluxo previsto e implementado no código é:

1. O profissional acessa a área administrativa com a senha.
2. Cadastra um serviço e sua duração.
3. Cadastra uma ou mais faixas de disponibilidade.
4. Copia o link público.
5. O cliente abre o link, escolhe o serviço, a data e um horário livre.
6. O cliente informa nome e telefone ou WhatsApp.
7. O backend revalida a disponibilidade, considera a duração do serviço e grava o agendamento.
8. O cliente recebe a confirmação.
9. O profissional consulta o agendamento na agenda da data correspondente.

Uma segunda tentativa de ocupar um intervalo sobreposto deve ser rejeitada pela regra de negócio. Esse comportamento foi identificado no código e no esquema do banco, mas não foi demonstrado com uma execução completa nesta verificação.

## 8. Capturas de tela

As imagens abaixo são capturas de tela, referentes ao uso local do frontend. Elas documentam as telas apresentadas, mas não substituem a repetição da execução da API nem os testes com usuários.

### 8.1. Tela de acesso do profissional

![Tela de acesso da área do profissional](../../evidencias/entrega-04/prints/01-acesso-profissional.jpeg)

**Figura 1 —** Tela inicial da área do profissional, com campo de senha e botão de entrada. A captura confirma que o frontend foi servido localmente.

### 8.2. Painel do profissional sem agendamento

![Painel do profissional sem agendamento](../../evidencias/entrega-04/prints/02-painel-profissional-sem-agendamento.jpeg)

**Figura 2 —** Painel administrativo com o link público, serviços cadastrados, disponibilidade configurada e agenda sem compromisso na data selecionada.

### 8.3. Painel do profissional com agendamento

![Painel do profissional com agendamento](../../evidencias/entrega-04/prints/03-painel-profissional-com-agendamento.jpeg)

**Figura 3 —** Painel administrativo exibindo um compromisso registrado na agenda, com serviço, horário, nome e contato do cliente.

### 8.4. Tela pública de escolha de serviço e horário

![Escolha de serviço e horário](../../evidencias/entrega-04/prints/04-escolha-servico-horario.jpeg)

**Figura 4 —** Tela pública em que o cliente seleciona o serviço, a data e um dos horários disponíveis, além de informar nome e contato.

### 8.5. Confirmação do agendamento

![Confirmação do agendamento](../../evidencias/entrega-04/prints/05-confirmacao-agendamento.jpeg)

**Figura 5 —** Tela apresentada após a reserva, com a indicação de confirmação, o serviço e a data e horário registrados.

## 9. Testes do MVP com usuários

### 9.1. Evidências disponíveis

Nos testamos o MVP com pessoas que participaram das entrevistas e questionários identificados como P1 a P8. Os registros originais estão na pasta [docs/evidencias](../../docs/evidencias/). Assim, as entrevistas da Entrega 2 também serviram como base para o contato com representantes do público-alvo durante a apresentação e utilização do sistema.

### 9.2. Roteiro a aplicar

O roteiro segue o Anexo C do trabalho:

1. Explicar que o objetivo é avaliar o software, não a pessoa participante.
2. Apresentar uma tarefa sem explicar detalhadamente como executá-la.
3. Observar o participante durante a execução.
4. Registrar dúvidas e dificuldades.
5. Evitar interferência, salvo quando necessária.
6. Ao final, perguntar: o que entendeu que o sistema faz; o que foi fácil; o que foi difícil; em que situação usaria; o que faltou; o que deveria ser removido; e qual foi a parte mais valiosa.

### 9.3. Modelo de registro para preenchimento

| Campo | Registro |
|---|---|
| Código anônimo | P__ |
| Perfil | Cabeleireiro autônomo, responsável por pequeno salão ou cliente que agenda por mensagens |
| Objetivo | Verificar se consegue configurar a agenda ou concluir uma reserva sem ajuda |
| Tarefa | Profissional: cadastrar serviço, disponibilidade e localizar uma reserva. Cliente: abrir o link, escolher serviço/data/horário, informar dados e confirmar. |
| Conclusão sem ajuda | A preencher |
| Tempo aproximado | A preencher |
| Observações | A preencher |
| Dificuldades | A preencher |
| Comentários | A preencher |
| Percepção de valor | A preencher |
| Sugestões | A preencher |
| Decisão do grupo | A preencher: manter, corrigir, remover ou investigar |

Esse modelo deve ser preenchido separadamente para pelo menos cinco participantes, sempre que viável, sem completar campos por suposição.

## 10. Resultados e métricas

Os testes foram realizados com participantes do público-alvo relacionados às entrevistas e questionários P1–P8. 

As métricas a registrar após os testes são:

- quantidade e proporção de participantes que concluem cada tarefa;
- conclusão com ou sem ajuda;
- tempo aproximado por tarefa;
- dúvidas, hesitações e erros observados;
- percepção de facilidade e de valor;
- sugestões recorrentes;
- decisão do grupo para cada problema identificado.

## 11. Modificações realizadas ou planejadas

### 11.1. Modificações realizadas nesta documentação

- Registro do estado real do código, do frontend, do backend e do banco.
- Inclusão das seis capturas fornecidas pelo grupo.
- Separação entre os registros originais da Entrega 2 e os testes de uso do MVP realizados posteriormente com participantes.
- Registro explícito das falhas de execução, do lint e da captura ainda pendente para situação inválida.

## 12. Aprendizados e conclusão

O projeto já possui uma base coerente com o escopo da Entrega 3: frontend React, API REST em Spring Boot, persistência PostgreSQL, área administrativa, link público e regras para duração e conflitos. O build do frontend e o teste Maven com JDK 27 foram executados.
