# Trabalho de Empreendedorismo — Entrega 3

Disciplina: Empreendedorismo em Sistemas de Informação  
Semestre: 2026/2  
Data: 27/10/2026  
Empreendimento: Agenda Inteligente 

## 1. Identificação do Grupo

| Integrante |
|---|
| Bruno Santos Vilas Boas |
| Carolina Costa Ude |
| Christian Silva Mesquita |
| Matheus Levi Tavares |
| Thiago Vinícius Tristão Rojas |

**Repositório:** https://github.com/thiagovtr/softwareESI

## 2. Proposta de Valor

### 2.1. Segmento prioritário e problema

O público prioritário são cabeleireiros autônomos e pequenos salões de até três profissionais que organizam horários pelo celular e recebem solicitações principalmente pelo WhatsApp.

Na Entrega 2, os registros de P1–P8 descrevem o uso combinado de WhatsApp com caderno, planilha ou aplicativos. Os relatos apontam trabalho manual para consultar disponibilidade, registrar reservas e lidar com remarcações, além de situações de conflito entre canais e horários vagos após cancelamentos.

A necessidade central é permitir que o cliente consulte horários e solicite uma reserva facilmente, enquanto o profissional mantém os agendamentos organizados em um só lugar.

### 2.2. Proposta de valor

A Agenda Inteligente permite que cabeleireiros compartilhem um link pelo WhatsApp ou Instagram para que os clientes consultem horários disponíveis e solicitem uma reserva, reduzindo a troca manual de mensagens e ajudando a evitar conflitos na agenda.

O principal benefício esperado é diminuir o esforço administrativo de organizar os horários e facilitar a reserva para os clientes. Esse benefício ainda precisa ser verificado com o MVP.

### 2.3. Diferenciais pretendidos

- **Acesso por link:** uso pelo navegador, sem exigir instalação de aplicativo.
- **Agenda centralizada:** reservas realizadas pelo link ficam visíveis ao profissional.
- **Verificação de disponibilidade:** o sistema verifica se o horário continua livre antes de confirmar a reserva.
- **Simplicidade:** foco no agendamento, sem tentar substituir sistemas completos de gestão de salão.

### 2.4. Justificativa com base na Entrega 2

A Entrega 2 teve oito interações, onde foram seis entrevistas e dois questionários. P1 relatou utilizar caderno e WhatsApp; P2 descreveu conflito relacionado à atualização manual de uma planilha; P3 relatou demora para responder mensagens; e P4 descreveu conflito entre o aplicativo e o WhatsApp. Os demais registros também apontam trabalho manual e dificuldades com cancelamentos ou confirmação de horários.

Isso sustenta a decisão de prosseguir com ajustes: testar primeiro um link de autoagendamento e uma agenda centralizada. São evidências qualitativas dos participantes consultados, não uma prova de que todos os profissionais tenham o mesmo problema.

## 3. Business Model Canvas (BMC)

O Canvas abaixo apresenta hipóteses iniciais de negócio, ainda sujeitas a validação.

| Bloco | Definição inicial |
|---|---|
| **Segmentos de clientes** | Cabeleireiros autônomos e pequenos salões; seus clientes também utilizam o fluxo de reserva. |
| **Proposta de valor** | Link simples para consultar e reservar horários, com agenda centralizada. |
| **Canais** | Link compartilhável, WhatsApp, Instagram, indicações e demonstrações. |
| **Relacionamento** | Configuração simples, orientações de uso e coleta de feedback. |
| **Fontes de receita** | Hipótese a validar: plano gratuito limitado e/ou assinatura mensal acessível. Preço ainda não definido. |
| **Recursos-chave** | Aplicação web, armazenamento de reservas, hospedagem, equipe e acesso a participantes para testes. |
| **Atividades-chave** | Desenvolver o fluxo de reserva, manter disponibilidade, testar, corrigir falhas e analisar feedback. |
| **Parceiros-chave** | Cabeleireiros e clientes participantes dos testes; possíveis provedores de hospedagem. |
| **Estrutura de custos** | Tempo de desenvolvimento e testes; possíveis custos de domínio, hospedagem e serviços externos. |

## 4. Personal Business Model Canvas (PBMC)

| Dimensão | Registro a completar |
|---|---|
| Competências e conhecimentos | Quem pode contribuir com frontend, backend, banco de dados, testes, design e documentação. |
| Recursos disponíveis | Computadores, ferramentas, repositório e orçamento, quando houver. |
| Rede de contatos e apoios | Participantes da Entrega 2 que aceitarem testar novamente e outros contatos disponíveis. |
| Limitações | Disponibilidade semanal, experiência técnica e restrições de prazo. |
| Benefícios esperados | Aprendizagem prática, experiência em desenvolvimento e validação de software. |
| Esforços necessários | Construção do fluxo principal, testes, correções e documentação. |

## 5. Visão do Produto de Software

### 5.1. Descrição e usuários

A Agenda Inteligente será uma aplicação web responsiva. O profissional configura serviços e horários disponíveis e compartilha um link. O cliente abre esse link no navegador, escolhe um horário e solicita a reserva. O sistema registra o compromisso e permite que o profissional o visualize na agenda.

O usuário principal é o cabeleireiro autônomo ou responsável por um pequeno salão. O cliente final é o segundo usuário do fluxo, pois consulta a disponibilidade e realiza a reserva.

### 5.2. Jornada principal

1. O profissional configura serviços e horários disponíveis.
2. Compartilha o link pelo WhatsApp ou Instagram.
3. O cliente abre o link e escolhe serviço e horário.
4. O sistema verifica a disponibilidade e registra a reserva.
5. O cliente vê a confirmação e o profissional visualiza o compromisso.

**Resultado esperado:** uma reserva registrada em um único lugar, com menor necessidade de consultar e confirmar cada horário manualmente.

## 6. Priorização de Funcionalidades — MoSCoW

| Prioridade | Funcionalidades |
|---|---|
| **Must Have** | Configurar disponibilidade; link público; visualizar horários; formulário de reserva; impedir reserva duplicada; mostrar confirmação; visualizar reservas na agenda do profissional. |
| **Should Have** | Cancelar reserva e liberar horário; editar serviços; personalizar dados básicos do perfil. |
| **Could Have** | Lista de espera, lembretes automáticos, histórico de clientes e gestão de vários profissionais. |
| **Won’t Have** | Pagamentos online, gestão financeira completa, controle de estoque, comissões, aplicativo nativo e integração automática com a API do WhatsApp. |

O compartilhamento manual de um link pelo WhatsApp não significa que o sistema enviará mensagens automaticamente. Essa integração fica fora do MVP inicial.

## 7. Escopo do MVP

**Hipótese a testar:** se o cliente puder consultar e reservar um horário por um link simples, parte dos pedidos poderá ser concluída sem uma troca manual de mensagens para descobrir a disponibilidade.  

**Fluxo de ponta a ponta:** configurar horários → compartilhar link → escolher horário → registrar reserva → exibir confirmação → visualizar reserva na agenda.  

**Incluído:** disponibilidade básica, consulta de horários, formulário de reserva, verificação de conflitos, registro e visualização das reservas.  

**Fora do escopo inicial:** integração automática com WhatsApp, lista de espera, pagamentos, aplicativo nativo e gestão completa de salão.  

Esse escopo é suficiente para testar a principal hipótese sem ampliar demais o desenvolvimento. Como critérios de sucesso, a equipe observará se clientes conseguem reservar sem ajuda e se profissionais conseguem configurar horários e localizar as reservas. Serão registrados conclusão das tarefas, tempo aproximado, dúvidas, erros e percepção de utilidade.

## 8. Planejamento Técnico Mínimo

- **Tipo:** aplicação web responsiva, acessível por celular e computador.
- **Tecnologias candidatas:** frontend web; backend em Java/Spring Boot, se compatível com a experiência e o prazo da equipe; PostgreSQL como opção de banco de dados.
- **Dados:** profissionais, serviços, disponibilidade e reservas.
- **APIs externas:** nenhuma é obrigatória para o fluxo inicial; o link poderá ser compartilhado manualmente.
- **IA:** não é necessária para testar a hipótese central.
- **Execução:** ambiente local ou hospedagem, conforme os recursos disponíveis.
- **Riscos técnicos:** conflito entre reservas, regras de duração dos serviços, proteção de dados, usabilidade em telas pequenas e restrições de hospedagem.

## 9. Wireframes Iniciais

**Tela do cliente — selecionar horário**

```
┌──────────────────────────────┐
│       AGENDA INTELIGENTE     │
│ Serviço: [Selecionar     ▼]  │
│ Data:    [Selecionar     ▼]  │
│ Horários: [09:00] [10:00]    │
│ Nome:    [______________]    │
│ Contato: [______________]    │
│      [Confirmar reserva]     │
└──────────────────────────────┘
```

**Tela de confirmação**

```
┌──────────────────────────────┐
│       RESERVA CONFIRMADA     │
│ Serviço: [serviço escolhido] │
│ Data:    [data escolhida]    │
│ Horário: [horário escolhido] │
│      [Voltar à agenda]       │
└──────────────────────────────┘
```

**Painel do profissional:** lista dos agendamentos por data, horários livres e opção para copiar ou compartilhar o link. 

## 10. Plano de Desenvolvimento

| Período sugerido | Atividade | Resultado |
|---|---|---|
| 27–28/10 | Confirmar escopo, tecnologias e responsáveis. | Plano definido. |
| 29–31/10 | Implementar disponibilidade, reservas e verificação de conflitos. | Lógica principal funcionando. |
| 01–03/11 | Construir as telas de seleção, reserva e confirmação. | Jornada implementada. |
| 04–05/11 | Integrar e testar o fluxo completo. | Versão demonstrável. |
| 06–07/11 | Testar com usuários e registrar resultados. | Evidências de validação. |
| 08–10/11 | Corrigir falhas prioritárias e preparar documentação e demonstração. | Preparação para a Entrega 4. |


## 11. Plano de Validação do MVP

**Objetivo:** verificar se clientes conseguem realizar uma reserva sem ajuda e se os profissionais conseguem configurar a disponibilidade e localizar os agendamentos.  
**Participantes:** cabeleireiros autônomos ou responsáveis por pequenos salões e clientes que costumam agendar por mensagens. Participantes da Entrega 2 poderão ser convidados novamente, conforme disponibilidade e consentimento.

**Tarefas:**
- **Profissional:** configurar horários, abrir ou compartilhar o link e localizar uma reserva.
- **Cliente:** abrir o link, selecionar serviço e horário, informar os dados necessários e concluir a reserva.

**Dados registrados:** conclusão sem ajuda, tempo aproximado, dúvidas, erros, pontos de hesitação, percepção de facilidade e utilidade. Os resultados, positivos ou negativos, serão registrados sem inventar respostas ou evidências.

## 12. Rastreabilidade e decisões pendentes

| Aprendizado da Entrega 2 | Decisão proposta para o MVP |
|---|---|
| Os participantes usam diferentes combinações de WhatsApp, papel, planilhas e apps. | Oferecer um link simples e uma agenda centralizada. |
| Foram relatados trabalho manual e conflitos entre canais. | Verificar disponibilidade antes de registrar cada reserva. |
| Preencher vagas canceladas pode exigir contato individual. | Deixar lista de espera automática para uma etapa futura. |
| O WhatsApp é um canal importante para os participantes. | Permitir compartilhar o link sem depender de integração automática. |

