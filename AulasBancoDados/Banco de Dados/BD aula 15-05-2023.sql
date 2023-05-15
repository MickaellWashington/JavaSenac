create database cadastro;

use cadastro;

create table CadastroUsuario(
id_Usuario int not null auto_increment primary key,
login varchar(45) not null,
nome varchar(45) not null,
senha varchar(50) not null,
perfil varchar(50) not null
);

insert into CadastroUsuario (
nome, login, senha, perfil
)
values 
("Administrador", "admin", "admin", "admim");

select * from CadastroUsuario;