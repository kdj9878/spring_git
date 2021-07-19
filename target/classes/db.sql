create table text(

t_text varchar2(200)
);
insert into text values ('dddd');

select * from text;

drop table text cascade constraint purge;
