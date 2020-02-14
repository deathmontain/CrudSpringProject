CREATE TABLE pessoa(
                         rgPessoa bigint(20) NOT NULL,
                         cel_pessoa varchar(255),
                         cpf_pessoa int(20),
                         nomePessoa varchar(255),
                         tel_Pessoa varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE pessoa
    ADD PRIMARY KEY (rgPessoa);

Alter table pessoa
    MODIFY rgPessoa bigint(20) NOT NULL AUTO_INCREMENT;