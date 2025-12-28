INSERT INTO users (user_id, password, user_name) VALUES
('u001', '$2a$12$jA9fyFy1qfh379BEfaJM2uGPe9EnqrEZnREv1iaiX8nyCmQz69ERK', 'ユーザー1'),
('u002', '$2a$12$jA9fyFy1qfh379BEfaJM2uGPe9EnqrEZnREv1iaiX8nyCmQz69ERK', 'ユーザー2');

INSERT INTO tasks (id, title, description, due_date, type, priority, assignee, status) VALUES
(1, '要件定義書の作成', '新規案件の要件を整理する', '2025-01-20', 'WORK', 'HIGH', 'u001', 'TODO'),
(2, '洗濯と掃除', '週末の家事タスク', '2025-01-18', 'HOUSEWORK', 'MEDIUM', 'u001', 'DOING'),
(3, 'Spring Boot 学習', 'MPA + Security を理解する', '2025-01-25', 'STUDY', 'HIGH', 'u002', 'DOING'),
(4, '友達と食事', '大学時代の友人と飲み会', '2025-01-22', 'FRIEND', 'LOW', 'u002', 'TODO'),
(5, '個人ブログ更新', '技術記事を書く', '2025-01-30', 'PERSONAL', 'MEDIUM', 'u001', 'DONE');