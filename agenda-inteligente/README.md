# Agenda Inteligente

MVP acadêmico de agendamento para profissionais de beleza. O profissional configura serviços e disponibilidade; o cliente reserva por um link público, sem criar conta.

## Requisitos

- Java 27 e acesso à internet na primeira execução do Maven Wrapper;
- Node.js 26+ e npm;
- Docker Desktop em execução (para o PostgreSQL).

## Como executar

1. Inicie o banco:

   ```bash
   cd database
   docker compose up -d
   ```

2. Em outro terminal, inicie a API:

   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```

3. Em outro terminal, inicie o frontend:

   ```bash
   cd frontend
   npm install
   npm run dev
   ```

4. Acesse `http://localhost:5173`. A senha inicial da área profissional é `agenda123`. Para não expor essa senha em outro ambiente, defina a variável `SENHA_PROFISSIONAL` antes de iniciar a API.

Após cadastrar ao menos um serviço e uma faixa de disponibilidade, copie o link apresentado no painel. O endereço público padrão é `http://localhost:5173/agendar/agenda-inteligente`.

## Estrutura

- `frontend/`: React e Vite.
- `backend/`: API REST em Java/Spring Boot.
- `database/`: PostgreSQL local via Docker Compose.

## Regras importantes

O backend revalida a disponibilidade antes de gravar. Além disso, o PostgreSQL mantém uma restrição de exclusão que impede intervalos sobrepostos para o profissional, inclusive em solicitações simultâneas. Os horários públicos são oferecidos em intervalos de 30 minutos e usam o fuso `America/Sao_Paulo`.

## Testes

No backend, execute:

```bash
cd backend
./mvnw test
```

No frontend, execute:

```bash
cd frontend
npm run lint
npm run build
```
