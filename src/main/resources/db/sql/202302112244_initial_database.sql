-- Liquibase formatted sql
-- Datetime: 2023-02-11 22:44 GMT+7
-- Changeset: 202302112244_initial_database
-- Author: duynam.do

CREATE TABLE IF NOT EXISTS fc_add
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    result  VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS fc_sub
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    result  VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS fc_mul
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    result  VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS fc_div
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    result  VARCHAR NOT NULL
);