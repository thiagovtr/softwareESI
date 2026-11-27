# Agenda Inteligente

MVP acadêmico de agendamento para profissionais de beleza. O profissional configura serviços e disponibilidade; o cliente reserva por um link público, sem criar conta.

## Requisitos

- Docker Desktop em execução, para o PostgreSQL 18;
- JDK 27;
- Node.js 26 ou compatível e npm;
- acesso à internet na primeira execução do Maven Wrapper e na instalação das dependências do frontend.

## Endereços locais e credenciais padrão

| Recurso | Endereço ou credencial |
|---|---|
| Frontend | `http://localhost:5173` |
| API | `http://localhost:8080` |
| Página pública padrão | `http://localhost:5173/agendar/agenda-inteligente` |
| PostgreSQL | `localhost:5432` |
| Banco de dados | `agenda_inteligente` |
| Usuário do banco | `agenda` |
| Senha do banco | `agenda` |
| Usuário da área profissional | `profissional` |
| Senha da área profissional | `agenda123` |

Antes de consultar horários pela página pública, cadastre ao menos um serviço e uma faixa de disponibilidade na área profissional.

## Inicialização no macOS

Abra três terminais na pasta `agenda-inteligente`.

1. Inicie o PostgreSQL:

   ```bash
   cd database
   docker compose up -d
   ```

2. Em outro terminal, inicie o backend:

   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```

3. Em outro terminal, instale as dependências e inicie o frontend:

   ```bash
   cd frontend
   npm install
   npm run dev
   ```

## Inicialização no Windows

Abra três terminais na pasta `agenda-inteligente`.

1. Inicie o PostgreSQL:

   ```powershell
   cd database
   docker compose up -d
   ```

2. Em outro terminal, inicie o backend:

   ```powershell
   cd backend
   .\mvnw.cmd spring-boot:run
   ```

3. Em outro terminal, instale as dependências e inicie o frontend:

   ```powershell
   cd frontend
   npm install
   npm run dev
   ```

## Configuração por variáveis de ambiente

Os valores padrão podem ser substituídos pelas seguintes variáveis antes de iniciar a API: `BANCO_URL`, `BANCO_USUARIO`, `BANCO_SENHA`, `PORTA_API`, `USUARIO_PROFISSIONAL`, `SENHA_PROFISSIONAL` e `ORIGEM_FRONTEND`.

No macOS, por exemplo:

```bash
export SENHA_PROFISSIONAL='nova-senha'
./mvnw spring-boot:run
```

No Windows PowerShell, por exemplo:

```powershell
$env:SENHA_PROFISSIONAL = 'nova-senha'
.\mvnw.cmd spring-boot:run
```

## Estrutura

- `frontend/`: React e Vite.
- `backend/`: API REST em Java/Spring Boot.
- `database/`: PostgreSQL local via Docker Compose.

## Regras importantes

O backend revalida a disponibilidade antes de gravar. Além disso, o PostgreSQL mantém uma restrição de exclusão que impede intervalos sobrepostos para o profissional, inclusive em solicitações simultâneas. Os horários públicos são oferecidos em intervalos de 30 minutos e usam o fuso `America/Sao_Paulo`.

## Testes, lint e build

No backend, execute o teste automatizado:

```bash
cd backend
./mvnw test
```

No Windows, use:

```powershell
cd backend
.\mvnw.cmd test
```

No frontend, execute o lint e o build de produção:

```bash
cd frontend
npm run lint
npm run build
```

No Windows, os mesmos comandos `npm` podem ser executados no PowerShell após acessar a pasta `frontend`.

O conjunto atual de testes do backend é limitado e não representa cobertura completa de testes automatizados.
