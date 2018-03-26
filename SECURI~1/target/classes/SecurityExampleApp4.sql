create table users (
    username    varchar2(50)   primary key,
    password    varchar2(50)   not null,
    enabled     char(1)        not null
    );
    
create table authorities (
    username    varchar2(50)    not null,
    authority   varchar2(50)    not null,
    constraint fk_authorities_users foreign key(username) references users(username)
    );
    
create unique index ix_auth_username on authorities(username,authority);

insert into users
values ('justin', '1234', '1');

insert into authorities
values ('joon', '1234', '1');

insert into authorities
values ('justin', 'ROLE_USER');

insert into authorities
values ('justin', 'ROLE_ADMIN');

insert into authorities
values ('joon', 'ROLE_USER');
