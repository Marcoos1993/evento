INSERT INTO tb_participant (name, email) VALUES ('Jose Silva', 'jose@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Tiago Faria', ' tiago@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Maria do Rosario' , 'maria@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_category (description) VALUES ('Curso');
INSERT INTO tb_category (description) VALUES ('Oficina');

INSERT INTO tb_activity (name, description, preco, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma pratica', 80.0, 1);
INSERT INTO tb_activity (name, description, preco, categoria_id) VALUES ('Oficina de GitHub', 'Controle versoes do seu projeto', 50.0, 2);

INSERT INTO tb_block (start, finish, atividade_id) VALUES ('2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_block (start, finish, atividade_id) VALUES ('2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_block (start, finish, atividade_id) VALUES ('2017-09-26T08:00:00Z', '2017-09-26T11:00:00Z', 2);

INSERT INTO tb_participant_activity (participant_id, activity_id) VALUES (1, 1);
INSERT INTO tb_participant_activity (participant_id, activity_id) VALUES (1, 2);
INSERT INTO tb_participant_activity (participant_id, activity_id) VALUES (3, 1);
INSERT INTO tb_participant_activity (participant_id, activity_id) VALUES (3, 2);
INSERT INTO tb_participant_activity (participant_id, activity_id) VALUES (4, 1);





