/* ユーザー */
CREATE TABLE IF NOT EXISTS users (
    user_id VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100),
    user_name VARCHAR(50)
);

/* タスク */
CREATE TABLE IF NOT EXISTS tasks (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  description VARCHAR(1000),
  due_date DATE,
  type VARCHAR(20) NOT NULL,
  priority VARCHAR(20) NOT NULL,
  assignee VARCHAR(50) NOT NULL,
  status VARCHAR(20) NOT NULL
);
