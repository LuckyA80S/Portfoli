CREATE DATABASE exposicioX;

use exposicioX;

create table cotxe (
 codi_cotxe int(8),
 nom varchar(20),
 pais_origen varchar(20),
 tipus varchar(10),
 primary key (codi_cotxe) );
 
create table seccio (
 codi int(4),
 nom varchar(20),
 max_visitants int(90),
 horari datetime,
 num_cotxes int(4),
 num_expositors int(4),
 num_vigilants int(4),
 primary key (codi) );

 alter table seccio add foreign key (num_cotxes) REFERENCES cotxe (codi_cotxe);
 alter table seccio add foreign key (num_vigilants) REFERENCES vigilant (DNI_vigilant);
 alter table seccio add foreign key (num_expositors) REFERENCES expositor (DNI_expositor);
 
 
create table vigilant (
 DNI_vigilant varchar(9),
 nom varchar(20),
 cognoms varchar(30),
 adreça varchar(10),
 telefon int(9),
 data_entrada date,
 codi_seccio int(4),
 primary key (DNI_vigilant), 
 foreign key (codi_seccio) REFERENCES seccio (codi) );
 
create table expositor (
 DNI_expositor varchar(9),
 nom varchar(20),
 cognoms varchar(30),
 adreça varchar(10),
 telefon int(9),
 data_entrada date,
 codi_seccio int(4),
 primary key (DNI_expositor), 
 foreign key (codi_seccio) REFERENCES seccio (codi) );
 
insert into cotxe values ('001','Urus','Italia','SUV');
insert into cotxe values ('002','Charger','EEUU','Deportiu');
insert into cotxe values ('003','Q60','Japo','Luxe');
insert into cotxe values ('004','Model S','EEUU','Luxe');
insert into cotxe values ('005','Escalade','EEUU','SUV');
insert into cotxe values ('006','F12','Italia','Deportiu');
insert into cotxe values ('007','MX5','Japo','Compacte');
insert into cotxe values ('008','500','Italia','Compacte');
insert into cotxe values ('009','RS7','Alemanya','Luxe');
insert into cotxe values ('010','Supra','Japo','Deportiu');
insert into cotxe values ('011','H1','EEUU','SUV');
insert into cotxe values ('012','M5','Alemanya','Luxe');

insert into vigilant values ('10001','Bob','Bobby','Barcelona','111111','2001/01/01','0001');
insert into vigilant values ('20002','Camila','Carrera','Sabadell','222222','2002/02/01','0001');
insert into vigilant values ('30003','Val','Roberts','Barcelona','333333','2004/09/02','0003');

insert into expositor values ('40004','Alex','Morgan','Sabadell','444444','2002/02/01','0003');
insert into expositor values ('50005','Maria','Castillos','Madrid','555555','2001/07/10','0001');
insert into expositor values ('60006','Ramon','Parks','Barcelona','777777','2001/01/02','0002');

insert into seccio values ('0001','Europeus','50','2021/10/05 12:00:00','5','1','2');
insert into seccio values ('0002','Americans','70','2021/10/06 13:30:00','4','1','0');
insert into seccio values ('0003','Japonesos','45','2021/10/11 19:30:00','3','1','1');





