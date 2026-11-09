INSERT INTO profissionais (id, nome, slug) VALUES (1, 'Agenda Inteligente', 'agenda-inteligente') ON CONFLICT (id) DO NOTHING;
SELECT setval('profissionais_id_seq', GREATEST((SELECT COALESCE(MAX(id), 1) FROM profissionais), 1));
