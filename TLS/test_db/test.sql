drop database if exists test;
	
	create database test;

		use test;

		create table member_tbl(
				id int not null auto_increment,
				user varchar (25) not null,
				password varchar (25) not null,
				role varchar (20) not null,
				primary key (id)
			);


	insert into member_tbl values (null, 'admin', 'admin', 'ADMIN');
	insert into member_tbl values (null, 'member', 'member', 'MEMBER');	