create database BDdepartamento;
use BDdepartamento;

create table departamento(
cod_dep int not null auto_increment primary key,
descr varchar(45) not null,
localiz varchar(50) not null
);

create table funcionario(
cod_func int not null auto_increment primary key,
nome varchar(45) not null,
dt_nasc date,
dep_cod int not null,
foreign key (dep_cod) references departamento(cod_dep)
);

create table projeto(
cod_proj int not null auto_increment primary key,
nome varchar(45) not null,
orcamento decimal not null,
dt_ini date not null,
dt_prev_term date not null
);

create table funcao(
cod_funcao int not null auto_increment primary key,
nome varchar(45) not null,
sal decimal not null
);

create table trabalha(
dt_ent date not null,
dt_sai date not null,
func_cod int not null,
proj_cod int not null,
funcao_cod int not null,
foreign key (func_cod) references funcionario(cod_func),
foreign key (proj_cod) references projeto(cod_proj),
foreign key (funcao_cod) references funcao(cod_funcao)
);

show tables;
describe /*nome da table a ser aberta*/;
