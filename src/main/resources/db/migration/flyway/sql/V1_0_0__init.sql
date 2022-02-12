CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    password varchar(255) UNIQUE,
    role varchar(255),
    username varchar(255) UNIQUE,
    email varchar(255) UNIQUE
);