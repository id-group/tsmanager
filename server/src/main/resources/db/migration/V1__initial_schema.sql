create table strategies
(
    id            serial
        constraint strategies_pk
            primary key,
    short_name    varchar(100),
    full_name     varchar(255),
    entrance_desc varchar,
    exit_desc     integer,
    state         integer
);

alter table strategies
    owner to tsmadmin;

create unique index strategies_short_name_uindex
    on strategies (short_name);

