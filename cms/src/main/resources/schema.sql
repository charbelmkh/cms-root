create table if not exists  card (
    id int(11) not null auto_increment,
    holder_name varchar(512) default null,
    pan varchar(16) default null,
    card_type varchar(1) default null,
    expiry_date varchar(5) default null,
    top_up_limit DECIMAL default 0,
    loading_limit DECIMAL default 0,
  primary key (id)
);








