create database dbContatos;

use dbContatos;

create table tbContatos(
nome varchar(100),
email varchar(100));

insert into tbContatos(nome,email)values("Maria","maria@hotmail.com");
insert into tbContatos(nome,email)values("Antonio","antonio@hotmail.com");
insert into tbContatos(nome,email)values("Jose","jose@hotmail.com");
insert into tbContatos(nome,email)values("Amarildo","amarildo@hotmail.com");
insert into tbContatos(nome,email)values("Noemi","noemi@hotmail.com");
insert into tbContatos(nome,email)values("Dalva","dalva@hotmail.com");
insert into tbContatos(nome,email)values("Lorivaldo","lorivaldo@hotmail.com");
insert into tbContatos(nome,email)values("Alice","alice@hotmail.com");
insert into tbContatos(nome,email)values("Nicole","nicole@hotmail.com");
insert into tbContatos(nome,email)values("Vicente","vicente@hotmail.com");
insert into tbContatos(nome,email)values("Emanuel","emanuel@hotmail.com");
insert into tbContatos(nome,email)values("Gabriela","gabriela@hotmail.com");

select * from tbContatos;