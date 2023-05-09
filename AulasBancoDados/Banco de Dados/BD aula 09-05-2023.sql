create table cliente(
id_cliente int not null auto_increment primary key,
cpf varchar(14) not null,
nome varchar(50) not null,
sexo char(1) not null,
data_nascimento date not null,
logradouro varchar(50),
numero int,
bairro varchar(30),
cidade varchar(30) not null,
UF char(2) not null
);

create table carro(
id_carro int not null auto_increment primary key,
placa varchar(8) not null,
marca varchar(20) not null,
modelo varchar(20) not null,
ano int not null,
client_id int not null,
foreign key(client_id) references cliente(id_cliente) 
);

create table telefone(
id_telefone int not null auto_increment primary key,
numero int not null,
client_id int not null,
foreign key(client_id) references cliente(id_cliente)
);