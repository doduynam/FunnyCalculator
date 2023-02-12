-- Liquibase formatted sql
-- Datetime: 2023-02-11 22:44 GMT+7
-- Changeset: 202302112244_initial_database
-- Author: duynam.do

CREATE TABLE IF NOT EXISTS fc_add
(
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    resutl  VARCHAR NOT NULL,

    primary key (num_one, num_two)
);

CREATE TABLE IF NOT EXISTS fc_sub
(
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    resutl  VARCHAR NOT NULL,

    primary key (num_one, num_two)
);

CREATE TABLE IF NOT EXISTS fc_mul
(
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    resutl  VARCHAR NOT NULL,

    primary key (num_one, num_two)
);

CREATE TABLE IF NOT EXISTS fc_div
(
    num_one VARCHAR NOT NULL,
    num_two VARCHAR NOT NULL,
    resutl  VARCHAR NOT NULL,

    primary key (num_one, num_two)
);