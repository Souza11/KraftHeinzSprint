create table propostas(

                          id               bigint not null auto_increment,
                          nomeusuario      varchar(200),
                          estado           varchar(200) not null ,
                          tipoesg          varchar(200) not null,
                          mensagemproposta varchar(200) not null,

                          primary key (id)


)