-- begin FIRESALES_CUSTOMER
create table FIRESALES_CUSTOMER (
    ID varchar(36),
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end FIRESALES_CUSTOMER
-- begin FIRESALES_PRODUCT
create table FIRESALES_PRODUCT (
    ID varchar(36),
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(18, 2),
    DESCRIPTION blob sub_type text,
    --
    primary key (ID)
)^
-- end FIRESALES_PRODUCT
-- begin FIRESALES_ORDER
create table FIRESALES_ORDER (
    ID varchar(36),
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    TOTAL decimal(18, 2),
    PRODUCT_ID varchar(36) not null,
    NUMBER_OF_ITEMS integer,
    --
    primary key (ID)
)^
-- end FIRESALES_ORDER
