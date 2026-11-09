
# AGENTS.md — Agenda Inteligente

## 1. Contexto do projeto

O Agenda Inteligente é um projeto acadêmico desenvolvido para a disciplina de Empreendedorismo em Sistemas de Informação (2026/2).

O objetivo é desenvolver uma aplicação web responsiva para facilitar o gerenciamento de agendamentos de cabeleireiros autônomos e pequenos salões de beleza.

O sistema faz parte de um trabalho acadêmico dividido em cinco entregas. Atualmente, o desenvolvimento está direcionado à Entrega 4 — MVP funcional e validação da solução.

## 2. Problema identificado

Cabeleireiros autônomos e pequenos salões enfrentam dificuldades para organizar os horários dos clientes, principalmente quando recebem solicitações pelo WhatsApp e utilizam diferentes meios de registro.

Entre os problemas identificados nas entrevistas estão:

- Tempo gasto respondendo mensagens para agendar e remarcar horários.
- Dificuldade para consultar a disponibilidade.
- Conflitos entre horários registrados em diferentes ferramentas.
- Dificuldade para organizar cancelamentos e horários vagos.
- Trabalho administrativo durante os atendimentos.

## 3. Público-alvo

Público prioritário:

- Cabeleireiros autônomos.
- Pequenos salões com até três profissionais.
- Profissionais que administram a própria agenda pelo celular.

Os clientes dos profissionais também utilizarão o sistema para consultar horários e realizar reservas.

## 4. Proposta de valor

Permitir que cabeleireiros compartilhem um link pelo WhatsApp ou Instagram para que seus clientes consultem horários disponíveis e solicitem agendamentos sem precisar trocar diversas mensagens para descobrir a disponibilidade.

O sistema deve manter as reservas centralizadas e ajudar a evitar conflitos de horários.

## 5. Objetivo do MVP

Desenvolver uma aplicação web responsiva, simples e funcional, que implemente o fluxo principal de agendamento.

O fluxo obrigatório é:

1. O profissional configura os serviços e horários disponíveis.
2. O profissional compartilha seu link público de agendamento.
3. O cliente acessa o link pelo navegador.
4. O cliente seleciona um serviço, data e horário.
5. O cliente informa seus dados e solicita a reserva.
6. O sistema verifica novamente a disponibilidade.
7. O sistema registra a reserva e apresenta a confirmação.
8. O profissional consegue visualizar a reserva na agenda.

## 6. Funcionalidades obrigatórias

### Área do profissional

- Configurar os horários disponíveis.
- Cadastrar serviços e suas durações.
- Consultar os agendamentos recebidos.
- Visualizar os compromissos por data.
- Acessar e compartilhar o link público de agendamento.

### Área do cliente

- Acessar a agenda por um link público.
- Visualizar os serviços disponíveis.
- Selecionar uma data.
- Consultar horários livres.
- Informar nome e contato.
- Solicitar um agendamento.
- Visualizar a confirmação da reserva.

### Regras de negócio

- Um horário não pode ser reservado por dois clientes.
- A disponibilidade deve ser verificada novamente no momento da reserva.
- A duração do serviço deve ser considerada na ocupação do horário.
- Reservas existentes devem ser consideradas ao calcular os horários disponíveis.
- O sistema deve impedir agendamentos em horários indisponíveis.
- Informações obrigatórias devem ser validadas.
- Datas e horários devem ser tratados de maneira consistente.

## 7. Funcionalidades fora do escopo

Não implementar nesta versão:

- Pagamentos online.
- Integração automática com a API do WhatsApp.
- Aplicativo nativo para celular.
- Gestão financeira completa.
- Controle de estoque.
- Gestão de comissões.
- Lista de espera automática.
- Lembretes automáticos.
- Histórico avançado de clientes.
- Gestão de múltiplos profissionais.

Não adicionar funcionalidades apenas para tornar o projeto mais complexo.

## 8. Tecnologias propostas

Utilizar inicialmente:

- Frontend: React.
- Backend: Java com Spring Boot.
- Banco de dados: PostgreSQL.
- Comunicação entre frontend e backend: API REST.
- Controle de versão: Git e GitHub.

Antes de implementar, verificar as versões disponíveis no ambiente e propor versões compatíveis entre si.

Não substituir essas tecnologias sem apresentar uma justificativa e solicitar aprovação.

## 9. Requisitos técnicos

- Código organizado e legível.
- Separação entre frontend, backend e banco de dados.
- Componentes reutilizáveis no frontend quando apropriado.
- Organização adequada das camadas do backend.
- Persistência real dos dados no PostgreSQL.
- Validação dos dados recebidos pela API.
- Tratamento básico de erros.
- Interface responsiva para celular e computador.
- Configurações e credenciais fora do código-fonte.
- Arquivo README com instruções de instalação e execução.

Não utilizar dados exclusivamente em memória ou armazenamento local do navegador como substituto definitivo do banco de dados.

## 10. Orientações para o desenvolvimento

- Desenvolver o MVP completo, respeitando o escopo definido.
- Trabalhar por etapas pequenas e verificáveis.
- Não criar todas as funcionalidades em um único arquivo.
- Não inventar requisitos que não estejam definidos neste documento.
- Não implementar funcionalidades fora do escopo.
- Antes de modificar arquivos existentes, verificar sua finalidade.
- Explicar brevemente as decisões técnicas importantes.
- Executar testes e verificar erros após cada etapa relevante.
- Não afirmar que algo funciona sem verificar.
- Não apagar documentos acadêmicos, entrevistas ou evidências.
- Não modificar a branch principal.
- Trabalhar na branch feature/agenda-inteligente.

## 11. Critério de conclusão do MVP

O MVP será considerado funcional quando for possível executar o seguinte cenário:

1. Um profissional configura seus serviços e horários.
2. Um cliente acessa o link público.
3. O cliente escolhe um serviço e um horário disponível.
4. O cliente informa seus dados.
5. O sistema registra a reserva no PostgreSQL.
6. O cliente visualiza a confirmação.
7. O profissional visualiza a reserva na sua agenda.
8. Uma segunda tentativa de reservar um horário ocupado é impedida.

## 12. Cuidados com a validação acadêmica

O sistema deve ser desenvolvido para permitir testes com representantes reais do público-alvo.

Não inventar entrevistas, participantes, opiniões, resultados, métricas ou evidências de validação.

Esses dados serão coletados posteriormente pelo grupo.

O objetivo do software é permitir verificar se clientes conseguem realizar reservas e se profissionais conseguem configurar horários e localizar os agendamentos.
