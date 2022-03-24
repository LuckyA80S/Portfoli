USE motogp;

#ex1
select distinct p.nombre, p.nombreescuderia from pilotos p, escuderias e, carreras ca, resultados r
where (p.nombreescuderia = e.nombre) and (ca.nombregp = r.nombregp) and e.sede like '%Italia%' and r.puesto = 1;

#ex3
select distinct p.nombreescuderia, count(*) numpilotos from pilotos p, escuderias e
where (p.nombreescuderia = e.nombre)
group by p.nombreescuderia;

#ex4
select distinct p.nombre, r.puesto, count(*) from pilotos p, resultados r, carreras ca
where (ca.nombregp = r.nombregp) and (p.codigo = r.codpiloto) and (ca.año = r.anyo) and r.puesto = 1 and r.anyo = 2010
order by p.nombre;

#ex5
select distinct p.nombre, p.carreradebut from pilotos p, resultados r, carreras ca
where (ca.nombregp = r.nombregp) and (p.codigo = r.codpiloto) and r.puesto = 1
order by r.puesto;

#ex6
select distinct p.nombre, r.nombregp, r.distanciaganador from pilotos p, resultados r, carreras ca
where (ca.nombregp = r.nombregp) and (p.codigo = r.codpiloto) and r.anyo = 2010 and ca.numvueltas = (select min(numvueltas) from carreras) and r.distanciaganador > '00:10:00';

#ex7
select distinct e.nombre, count(*) from pilotos p, escuderias e, resultados r
where (p.codigo = r.codpiloto) and (e.nombre = p.nombreescuderia) and r.puesto = 1
group by e.nombre
having count(*) > 1;

#ex8
select distinct p.nacionalidad from pilotos p
where p.nacionalidad = (select max(nacionalidad) from pilotos);

#ex9: Mostra el nom dels circuits dels quals NO han guanyat pilotos de nacionalitat Espanyola

#select distinct c.nombrecircuito from resultados r, carreras c
#where (r.nombregp=c.nombregp) and (c.año=r.anyo) and (r.puesto=1) and r.codpiloto NOT IN (select codigo from pilotos where nacionalidad= 'Española');