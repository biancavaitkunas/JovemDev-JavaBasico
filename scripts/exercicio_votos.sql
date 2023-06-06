--1
select * from cargo;

--2
select nome, qt_vereadores from cidade order by nome;

--3
select nome, qt_vereadores from cidade where qt_vereadores >= 9 order by nome;

--4
select count (*) from cidade where qt_vereadores >= 9;

--5
select max (qt_vereadores) from cidade;

--6
select nome from cidade
where qt_vereadores = (select max(qt_vereadores) from cidade);

--7
select distinct nome from candidato where cargo = 1 order by nome;

--8
select cand.nome from candidato cand
where cargo = 2 and nome like '%MARIA%' order by nome;

--9
select cand.nome from candidato cand where nome like 'Y%' order by nome;

--10
select
	cidade.nome, candidato.nome
from
	cidade
inner join candidato
	on candidato.cidade = cidade.id
	and candidato.cargo = 1
order by
	cidade.nome,
	candidato.nome;

--11
select
	cidade.nome, candidato.nome
from
	cidade
inner join candidato
	on candidato.cidade = cidade.id
	and candidato.cargo = 1
where
	cidade.nome = 'TUBARÃO'
order by
	cidade.nome,
	candidato.nome;

--12
select
	cidade.nome, candidato.nome
from
	cidade
inner join candidato
	on candidato.cidade = cidade.id
	and candidato.cargo = 1
where
	cidade.qt_eleitores = (select max(qt_eleitores) from cidade);

--13
select count (*)
from candidato
inner join cidade on cidade.id = candidato.cidade
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
and cidade.nome = 'TUBARÃO';

--14
select cidade.nome, count (cand.*)
from cidade
inner join candidato cand on cand.cidade = cidade.id
inner join cargo on cargo.id = cand.cargo and cargo.nome = 'Vereador'
group by cidade.nome
order by cidade.nome;

--15
select cargo.nome, sum (brancos), sum (nulos)
from voto_invalido
inner join cidade on voto_invalido.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = voto_invalido.cargo
group by cargo.nome;

--ou:

select cargo.nome, vi.brancos as brancos, vi.nulos as nulos
from voto_invalido vi
inner join cidade on vi.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = vi.cargo;

--16
select vi.brancos + vi.nulos as invalidos
from voto_invalido vi
inner join cidade on vi.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = vi.cargo and cargo.nome = 'Prefeito';

--17
select candidato.nome, voto.voto
from voto
inner join candidato on candidato.id = voto.candidato
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
inner join cidade on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
order by voto.voto desc;

--18
select candidato.nome, voto.voto
from voto
inner join candidato on candidato.id = voto.candidato
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
inner join cidade on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
order by voto.voto desc;

--19
select cidade.nome, max (voto.voto)
from voto
inner join candidato on candidato.id = voto.candidato
inner join cidade on cidade.id = candidato.cidade
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
group by cidade.nome;

--20
select partido.sigla, sum (voto.voto) as votos
from voto
inner join candidato on candidato.id = voto.candidato
inner join cidade on cidade.id = candidato.cidade
inner join partido on partido.id = candidato.partido
group by partido.sigla
order by votos desc;

--21
select sum (voto.voto), sum (brancos), sum (nulos)
from voto, voto_invalido
inner join cidade on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
inner join candidato on candidato.id = voto.candidato
inner join candidato on candidato.id = vi.candidato;