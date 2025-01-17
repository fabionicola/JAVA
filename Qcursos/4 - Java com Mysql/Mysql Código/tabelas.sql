create database dbinfoq;

use dbinfoq;

create table tbusuarios(
	iduser int primary key,
    usuario varchar(50) not null,
    telefone varchar(15),
    login varchar(15) not null unique,
    senha varchar(15) not null
);


insert into tbusuarios(iduser, usuario, telefone, login, senha) 
values(1, 'Hugo Vasconcelos', '9999-9999', 'hugo', '123');

insert into tbusuarios(iduser, usuario, telefone, login, senha) 
values(2, 'Administrador', '9999-9998', 'admin', '123');

insert into tbusuarios(iduser, usuario, telefone, login, senha) 
values(3, 'Pedro', '9999-9988', 'pedrinho', '123');


select * from tbusuarios;


create table tbclientes(idcli int primary key auto_increment, 
nomecli varchar(50) not null, endcli varchar(100), 
fonecli varchar(15) not null, emailcli varchar(50)
);


insert into tbclientes(nomecli, endcli, fonecli, emailcli)
 values ('Fábio Vasconcelos', 'Rua Teste', '8888-7777', 
 'fabio@hotmail.com');


insert into tbclientes(nomecli, endcli, fonecli, emailcli)
 values ('Grazi Vasconcelos', 'Rua Teste 2', '6666-7777', 
 'grazi@hotmail.com');
 
 select * from tbclientes;
