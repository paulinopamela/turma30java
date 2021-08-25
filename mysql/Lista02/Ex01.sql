create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
id_classes int (3) auto_increment,
tipo_classes varchar (20) not null,
nivel_classes int (3),
primary key (id_classes)
) engine=innodb;

insert into tb_classes (tipo_classes, nivel_classes) values ("arqueiro", 70);
insert into tb_classes (tipo_classes, nivel_classes) values ("arqueiro", 95);
insert into tb_classes (tipo_classes, nivel_classes) values ("caçador", 110);
insert into tb_classes (tipo_classes, nivel_classes) values ("caçador", 60);
insert into tb_classes (tipo_classes, nivel_classes) values ("assassino", 100);

create table tb_personagem(
id_personagem int (3) auto_increment,
nome varchar (20) not null,
armas int (3),
ataque decimal (10,2),
defesa decimal (10,2),
primary key(id_personagem),
foreign key (id_personagem) references tb_classes (id_classes)
)engine = InnoDB;

insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (1,"Arrow", 5, 2500, 3000);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (3,"Axel", 3, 3000, 2800);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (2,"Azah", 6, 1500, 1700);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (1,"Bairon", 7, 500, 900);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (2,"Deluygy", 2, 1500, 2000);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (1,"Meck", 4, 850, 1000);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (3,"Ulric", 5, 3500, 4000);
insert into tb_personagem (id_classes, nome, armas, ataque, defesa) values (2,"Warlock", 6, 2700, 2000);

select * from tb_personagem
    where ataque > 2000;

select * from tb_personagem
    where defesa between 1000 and 2000;

select * from tb_personagem
    where nome like '%a%';
               
select * from tb_classe 
		inner join tb_personagem 
        on tb_classe.id = tb_personagem.id_classe;

select * from tb_classe
        inner join tb_personagem
            on tb_personagem.id_classe = tb_classe.id
                where tb_classe.nome = 'Arqueiro';








