CREATE EXTENSION IF NOT EXISTS btree_gist;

CREATE TABLE IF NOT EXISTS profissionais (
  id BIGSERIAL PRIMARY KEY,
  nome VARCHAR(120) NOT NULL,
  slug VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS servicos (
  id BIGSERIAL PRIMARY KEY,
  profissional_id BIGINT NOT NULL REFERENCES profissionais(id),
  nome VARCHAR(100) NOT NULL,
  duracao_minutos INTEGER NOT NULL CHECK (duracao_minutos >= 15 AND duracao_minutos <= 480),
  ativo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS disponibilidades (
  id BIGSERIAL PRIMARY KEY,
  profissional_id BIGINT NOT NULL REFERENCES profissionais(id),
  dia_semana INTEGER NOT NULL CHECK (dia_semana BETWEEN 1 AND 7),
  hora_inicio TIME NOT NULL,
  hora_fim TIME NOT NULL,
  CHECK (hora_fim > hora_inicio)
);

CREATE TABLE IF NOT EXISTS agendamentos (
  id BIGSERIAL PRIMARY KEY,
  profissional_id BIGINT NOT NULL REFERENCES profissionais(id),
  servico_id BIGINT NOT NULL REFERENCES servicos(id),
  nome_cliente VARCHAR(120) NOT NULL,
  contato_cliente VARCHAR(120) NOT NULL,
  inicio TIMESTAMPTZ NOT NULL,
  fim TIMESTAMPTZ NOT NULL,
  criado_em TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CHECK (fim > inicio)
);

ALTER TABLE agendamentos DROP CONSTRAINT IF EXISTS sem_sobreposicao_agendamentos;
ALTER TABLE agendamentos ADD CONSTRAINT sem_sobreposicao_agendamentos
  EXCLUDE USING gist (profissional_id WITH =, tstzrange(inicio, fim, '[)') WITH &&);
