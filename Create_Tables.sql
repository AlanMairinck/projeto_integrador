create database tradedb;

use tradedb;

create table permission
(
	permission_id int auto_increment primary key,
    ds_permission varchar(20) not null
);

create table trader
(
	trader_id int auto_increment,
	nm_trader varchar (100) not null,
    cpf varchar (11) not null,
    dt_birthday datetime not null,
    password varchar(255) not null,
    email varchar(255) not null,
    permission_id int not null,
    primary key(trader_id),
    foreign key(permission_id)
		references permission (permission_id),
    constraint uc_trader unique (cpf, nm_trader,dt_birthday)
);

create table wallet
(
	wallet_id int auto_increment,
    nm_wallet varchar(50) not null,
    trader_id int not null,
    dt_create datetime default CURRENT_TIMESTAMP(),
    amount_invested decimal(15,2),
    primary key(wallet_id,trader_id),
    foreign key(trader_id)
		references trader (trader_id)
        on update restrict on delete cascade
);

create table portfolio_assets
(
	portfolio_assets_id int auto_increment,
    nm_asset varchar(10) not null,
    qt_asset int not null,
    dt_firstBuy datetime default current_timestamp,
    dt_lastBuy datetime default current_timestamp,
    vl_lastBuy decimal(15,2) not null,
    vl_amountInvested decimal(15,2) not null,
    wallet_id int not null,
    trader_id int not null,
    primary key(portfolio_assets_id),
    foreign key(wallet_id,trader_id)
		references wallet (wallet_id,trader_id)
        on update restrict on delete cascade
);
