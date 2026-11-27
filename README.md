# Agenda Inteligente

Trabalho prático em grupo da disciplina GCC137 — Empreendedorismo em Sistemas de Informação, do curso de Sistemas de Informação da Universidade Federal de Lavras (UFLA).

## Integrantes

| Integrante |
|---|
| Bruno Santos Vilas Boas |
| Carolina Costa Ude |
| Christian Silva Mesquita |
| Matheus Levi Tavares |
| Thiago Vinícius Tristão Rojas |

## Problema e público-alvo

Profissionais de beleza que administram a própria agenda, especialmente cabeleireiros autônomos e pequenos salões, podem enfrentar dificuldades para consultar disponibilidade, registrar reservas e evitar conflitos quando os pedidos chegam por WhatsApp e outros meios de registro. O público-alvo prioritário compreende cabeleireiros autônomos e pequenos salões com até três profissionais; seus clientes utilizam o fluxo público de reserva.

## Proposta de valor

A Agenda Inteligente oferece um link público de agendamento que pode ser compartilhado pelo profissional. Por esse link, o cliente consulta horários disponíveis e solicita uma reserva sem criar conta. A proposta busca reduzir a troca manual de mensagens para consulta de horários e manter as reservas centralizadas para o profissional.

## Funcionalidades implementadas no MVP

- Acesso à área profissional protegido por credenciais.
- Cadastro e desativação de serviços, com duração entre 15 e 480 minutos.
- Cadastro e exclusão de faixas de disponibilidade.
- Consulta de agendamentos por data na área profissional.
- Cópia do link público de agendamento.
- Consulta pública de serviços e horários livres por data.
- Solicitação de reserva com nome e contato do cliente, seguida de confirmação.
- Verificação de disponibilidade e prevenção de reservas sobrepostas, considerando a duração do serviço.

Não fazem parte deste MVP pagamentos online, integração automática com a API do WhatsApp, aplicativo nativo, lista de espera, lembretes automáticos, gestão financeira, estoque, comissões, histórico avançado de clientes ou gestão de múltiplos profissionais.

## Tecnologias utilizadas

- Frontend: React 19, Vite 8 e CSS.
- Backend: Java 27, Spring Boot 4.1.2, Spring Web MVC, Spring Data JPA, Spring Security e Bean Validation.
- Banco de dados: PostgreSQL 18, executado por Docker Compose.
- Comunicação: API REST.
- Controle de versão: Git e GitHub.

## Execução local

As instruções técnicas completas, incluindo requisitos, inicialização do banco de dados, backend e frontend para Windows e macOS, encontram-se no [README técnico](agenda-inteligente/README.md).

## Documentação das entregas e evidências

- [Entrega 01 — Descoberta do Problema e da Oportunidade](docs/entrega-01.md)
- [Entrega 02 — Validação do Problema, Clientes e Mercado](docs/entrega-02.md)
- [Entrega 03 — Proposta de valor, modelo de negócio e definição do MVP](docs/entrega-03.md)
- [Entrega 04 — MVP Funcional e Validação da Solução](docs/entrega-04.md)
- [Entrega 05 — Preparação Técnica do Software](docs/entrega-05.md)
- [Evidências das entrevistas, questionários e telas](docs/evidencias/)

## Estado atual do projeto

O MVP encontra-se executável localmente. A preparação técnica registrada para a Entrega 05 confirmou a execução do PostgreSQL, do backend e do frontend, além da verificação manual do funcionamento integrado do fluxo principal. O teste automatizado do backend executou um teste sem falhas ou erros; essa informação não representa cobertura completa de testes automatizados. O relatório final, os slides e o vídeo permanecem em preparação e serão acrescentados posteriormente.
