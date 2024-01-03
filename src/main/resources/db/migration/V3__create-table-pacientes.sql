create table pacientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    cpf varchar(14) not null unique,
    telefone varchar(20) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    cidade varchar(100) not null,
    uf char(2) not null,
    numero varchar(20),
    complemento varchar(100),

    primary key(id)

);