create database barbearia;
use barbearia;

create table pessoa(
id_pessoa int not null auto_increment primary key,
nome varchar(45) not null,
endereco varchar(45) not null,
telefone varchar(20) not null,
email varchar(45) not null,
dt_nasc date
);

create table cliente(
id_cliente int not null auto_increment primary key,
pessoa_id int not null,
foreign key (pessoa_id) references pessoa(id_pessoa)
);

create table administrador(
id_administrador int not null auto_increment primary key,
login varchar(45) not null,
senha varchar(45) not null,
pessoa_id int not null,
foreign key (pessoa_id) references pessoa(id_pessoa)
);

create table funcionario(
id_funcionario int not null auto_increment primary key,
cargo varchar(45) not null,
senha varchar(45) not null,
pessoa_id int not null,
foreign key (pessoa_id) references pessoa(id_pessoa)
);

create table servico(
id_servico int not null auto_increment primary key,
descricao varchar(45),
dt_inicio date,
hr_inicio datetime,
valor decimal,
funcionario_id int not null,
foreign key (funcionario_id) references funcionario(id_funcionario),
cliente_id int not null,
foreign key (cliente_id) references cliente(id_cliente)
);