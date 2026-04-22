create or replace function addition(mark1 int,mark2 int,mark3 int)
returns int as $$
declare
total_mark int;
begin
	total_mark:=mark1+mark2+mark3;
	return total_mark;
end;
$$ language plpgsql;

select addition(80,50,40);


create or replace function simpleinterest(principal int,rate int,time_range int)
returns int as $$
declare 
	simple_interest int;
begin
	simple_interest:=(principal*rate*time_range)/100;
	return simple_interest;
end;
$$ language plpgsql;

select simpleinterest(10000,5,2)




