create or replace procedure marks(mark1 int,mark2 int,mark3 int)
as $$
declare
total_mark int;
begin
	total_mark:=addition(mark1,mark2,mark3);
	raise notice 'total_mark = %',total_mark;

	if total_mark>=150 then
		raise notice 'PASS';
	else 
		raise notice 'FAIL';
	end if;
end;
$$ language plpgsql
call marks(70,80,30)

create or replace procedure interest(principal int,rate int,time_range int)
language plpgsql
as $$
declare
	si int;
	total int;
begin
	si := simpleinterest(principal,rate,time_range);
	total := principal+si;

	raise notice 'principal amount : %',principal;
	raise notice 'simple interest : %',si;
	raise notice 'total_amount : %',total;
end;
$$

call interest(10000,5,2);